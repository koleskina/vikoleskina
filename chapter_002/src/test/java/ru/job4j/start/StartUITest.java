package ru.job4j.start;
//Данный класс использует StubInput , который мы будем использовать в качестве тестов

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**StartUITest.**/
public class StartUITest {
    /*** @param args **first parameter***/
    public static void main(String[] args) { //в качестве параметра мы можем передавать любой обьект который реализует интерфейс input
        Input input = new StubInput(new String[] {"create stub task"});
        Tracker tracker = new Tracker();
        new StartUIMain(input, tracker).init();
    }
    /*** @Test**/
    @Test
    public void addItemTest() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "desc", "6"});   //создаём StubInput с последовательностью действий
        new StartUIMain(input, tracker).init();     //   создаём StartUI и вызываем метод init()
        assertThat(tracker.getAll()[0].getName(), is("test name")); // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
    }
    /*** @Test**/
    @Test
    public void editItemTest() {
        // создаём Tracker
        Tracker tracker = new Tracker();
        //Напрямую добавляем заявку
        Item item = tracker.add(new Item());
        //создаём StubInput с последовательностью действий
        Input input = new StubInput(new String[]{"2", item.getId(), "test name", "desc", "6"});
        // создаём StartUI и вызываем метод init()
        new StartUIMain(input, tracker).init();
        // проверяем, что нулевой элемент массива в трекере содержит имя, введённое при эмуляции.
        assertThat(tracker.findById(item.getId()).getName(), is("test name"));
    }
    /*** @Test**/
    @Test
    public void deleteItemTest() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test1", "testDescription", 123L));
        Item item2 = tracker.add(new Item("test2", "test2Description", 123L));
        Item item3 = tracker.add(new Item("test3", "test3Description", 123L));
        Input input = new StubInput(new String[]{"3", item1.getId(), "6"});
        tracker.delete(item1);
        Item[] result = tracker.getAll();
        Item[] expect = {item2, item3};
        new StartUIMain(input, tracker).init();
        assertThat(result, is(expect));
    }
    /*** @Test**/
    @Test
    public void findItemByNameTest() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test1", "1testDescription", 123L));
        Item item2 = tracker.add(new Item("test2", "2testDescription", 123L));
        Item item3 = tracker.add(new Item("test1", "3testDescription", 123L));
        Input input = new StubInput(new String[]{"5", item1.getName(), "6"});
        Item[] result = tracker.findByName("test1");
        Item[] expect = {item1, item3};
        new StartUIMain(input, tracker).init();
        assertThat(result, is(expect));
    }
    /*** @Test**/
    @Test
    public void findItemById() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test1", "1testDescription", 123L));
        Item item2 = tracker.add(new Item("test2", "2testDescription", 123L));
        Item item3 = tracker.add(new Item("test3", "3testDescription", 123L));
        Input input = new StubInput(new String[]{"4", item1.getId(), "6"});
        Item result = tracker.findById(item1.getId());
        Item expect = item1;
        new StartUIMain(input, tracker).init();
        assertThat(result, is(expect));
    }
    /*** @Test**/
    @Test
    public void showAllItem() {
        Tracker tracker = new Tracker();
        Item item1 = tracker.add(new Item("test1", "testDescription", 123L));
        Item item2 = tracker.add(new Item("test2", "test2Description", 123L));
        Item item3 = tracker.add(new Item("test3", "test3Description", 123L));
        Input input = new StubInput(new String[]{"1", "6"});
        Item[] result = tracker.getAll();
        Item[] expect = {item1, item2, item3};
        new StartUIMain(input, tracker).init();
        assertThat(result,  is(expect));
    }
}
