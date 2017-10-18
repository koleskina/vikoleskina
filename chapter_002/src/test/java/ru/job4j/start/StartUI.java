/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
 * @version $Id$
 * @since 0.1**/
package ru.job4j.start;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * @Test
 */
public class StartUI {
	/**
	 * @Test
	 */
	@Test
	public void addTest() {
		Tracker tracker = new Tracker();
		Item item1 = new Item("test1", "testDescription", 123L);
		tracker.add(item1);
		assertThat(tracker.add(item1).getName(), is("test1"));
	}
	/**
	 * @Test
	 */
	@Test
	public void updateTest() {
		Tracker tracker = new Tracker();
		Item previous = new Item("test1", "testDescription", 123L); // Добавляем заявку в трекер. Теперь в объект проинициализирован id.
		tracker.add(previous); // Создаем новую заявку.
		Item next = new Item("test2", "testDescription2", 1234L); // Проставляем старый id из previous, который был сгенерирован выше.
		next.setId(previous.getId()); // Обновляем заявку в трекере.
		tracker.update(next); // Проверяем, что заявка с таким id имеет новые имя test2.
		assertThat(previous.getName(), is("test2"));
	}
	/**
	 * @Test
	 */
	@Test
	public void deleteTest() {
		Tracker tracker = new Tracker();
		Item item1 = new Item("test1", "testDescription", 123L);
		tracker.add(item1);
		Item item2 = new Item("test2", "testDescription", 123L);
		tracker.add(item2);
		Item item3 = new Item("test3", "testDescription", 123L);
		tracker.add(item3);
		Item item4 = new Item("test3", "testDescription", 123L);
		tracker.add(item4);
		Item item5 = new Item("test3", "testDescription", 123L);
		tracker.add(item5);
		tracker.delete(item5);
		Item[] expect = {item1, item2, item3, item4};
		assertThat(tracker.getAll(), is(expect));
	}
	/**
	 * @Test
	 */
	@Test
	public void getAllTest() {
		Tracker tracker = new Tracker();
		Item item1 = new Item("test1", "testDescription", 123L);
		tracker.add(item1);
		Item item2 = new Item("test2", "testDescription", 123L);
		tracker.add(item2);
		Item item3 = new Item("test1", "testDescription", 123L);
		tracker.add(item3);
		Item[] result = tracker.getAll();
		Item[] expect = {item1, item2, item3};
		assertThat(result, is(expect));
	}
	/**
	 * @Test
	 */
	@Test
	public void findByNameTest() {
		Tracker tracker = new Tracker();
		Item item1 = new Item("test1", "testDescription", 123L);
		tracker.add(item1);
		Item item2 = new Item("test2", "testDescription", 123L);
		tracker.add(item2);
		Item item3 = new Item("test1", "testDescription", 123L);
		tracker.add(item3);
		Item[] result = tracker.findByName("test1");
		Item[] expect = {item1, item3};
		assertThat(result, is(expect));
	}
	/**
	 * @Test
	 */
	@Test
	public void findByIdTest() {
		Tracker tracker = new Tracker();
		Item item1 = new Item("test1", "testDescription", 123L);
		tracker.add(item1);
		Item item2 = new Item("test2", "testDescription", 123L);
		tracker.add(item2);
		Item item3 = new Item("test3", "testDescription", 123L);
		tracker.add(item3);
		Item result456 = tracker.findById(item1.getId());
		Item expect456 = null;
		assertThat(result456, is(expect456));
	}
}

