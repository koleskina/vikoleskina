package ru.job4j.start;

/**StartUITest.**/
public class StartUITest {
    /*** @param args **first parameter***/
    public static void main(String[] args) { //в качестве параметра мы можем передавать любой обьект который реализует интерфейс input
        Input input = new StubInput(new String[] {"create stub task"});
        new StartUIMain(input).init();
    }
}
