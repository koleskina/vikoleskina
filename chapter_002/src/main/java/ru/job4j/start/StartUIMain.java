package ru.job4j.start;
//Данный класс использует Консоль, требует ввода данных от пользователя, и этот класс является основным.
/**StartUIMain.**/
public class StartUIMain {

    /**
     * @param input **first parameter**
     * @param tracker **sec parameter**
     */
    public StartUIMain(Input input, Tracker tracker) {                       //сделать инициализацию в качестве конструктора
        this.input = input;
        this.tracker = tracker;
    }
    /*** @param tracker.*/
    private Tracker tracker = new Tracker();
    /*** @param Input.*/
    private Input input;                                //создание обьекта
    /*** @param ADD_NEW_ITEM.*/
    private static final String ADD_NEW_ITEM = "0";
    /*** @param SHOW_ALL.*/
    private static final String SHOW_ALL = "1";
    /*** @param EDIT_ITEM.*/
    private static final String EDIT_ITEM = "2";
    /*** @param DELETE_ITEM.*/
    private static final String DELETE_ITEM = "3";
    /*** @param FIND_ITEM_BY_ID.*/
    private static final String FIND_ITEM_BY_ID = "4";
    /*** @param FIND_ITEM_BY_NAME.*/
    private static final String FIND_ITEM_BY_NAME = "5";
    /*** @param EXIT.*/
    private static final String EXIT = "6";                  //Ключи меню вынесем в константы
    /**init.**/

    public void init() {
        System.out.println("0. Add new Item\n"
                + "1. Show all items\n"
                + "2. Edit item\n"
                + "3  Delete item\n"
                + "4. Find item by Id\n"
                + "5. Find items by name\n"
                + "6. Exit Program\n");
        String name = input.ask("Введите номер задачи: "); //из метода аск мы передаем вопрос который хотим получить в наш метод
        this.chooseMenu(name);
    }

    /*** @param value **first parameter***/
    public void chooseMenu(String value) {
        if (ADD_NEW_ITEM.equals(value)) {
            System.out.println("Вы выбрали добавить заявку");
            this.add();
        } else if (SHOW_ALL.equals(value)) {
            System.out.println("Вы выбрали показать все заявки");
            this.getAll();
        } else if (EDIT_ITEM.equals(value)) {
            System.out.println("Вы выбрали редактировать заявку");
            this.update();
        } else if (DELETE_ITEM.equals(value)) {
            System.out.println("Вы выбрали удалить заявку");
            this.delete();
        } else if (FIND_ITEM_BY_ID.equals(value)) {
            System.out.println("Вы выбрали найти заявку по id");
            this.findById();
        } else if (FIND_ITEM_BY_NAME.equals(value)) {
            System.out.println("Вы выбрали найти заявку по имени");
            this.findByName();
        } else if (EXIT.equals(value)) {
            System.out.println("Вы выбрали выйти из программы");
            this.exit();
        }
    }
/** add.**/
    public void add() {
        String name = input.ask("Введите имя: ");
        String desc = input.ask("Введите описание: ");
        long curTime = System.currentTimeMillis();
        Item item = new Item(name, desc, curTime);
        this.tracker.add(item);
        System.out.println("В систему добавлена новая заявка с id:" + item.getId() + "\n");
        this.init();
    }
    /** update.**/
    public void update() {
        String id = input.ask("Введите id, который хотите изменить: ");
        String name = input.ask("Введите имя: ");
        String desc = input.ask("Введите описание: ");
        long curTime = System.currentTimeMillis();
        Item item = new Item(name, desc, curTime);
        item.setId(id);
        this.tracker.update(item);
        this.init();
    }
    /** delete.**/
    public void delete() {
        String id = input.ask("Введите id, который хотите удалить: ");
        String name = null;
        String desc = null;
        long curTime = System.currentTimeMillis();
        Item item = new Item(name, desc, curTime);
        item.setId(id);
        this.tracker.delete(item);
        this.init();
    }
    /** findById.**/
    public void findById() {
        String id = input.ask("Введите id, который хотите найти: ");
        System.out.println("Вы выбрали " + this.tracker.findById(id).getName() + " " + this.tracker.findById(id).getDescription());
        this.init();
    }
    /** getAll.**/
    public void getAll() {
        this.tracker.getAll();
        for (Item item : this.tracker.getAll()) {
            System.out.println(item.getName() + " " + item.getDescription() + " " + item.getId());
        }
        this.init();
    }
    /** findByName.**/
    public void findByName() {
        String name = input.ask("Введите имя, которое хотите найти: ");
        for (Item item : this.tracker.findByName(name)) {
            if (item != null && item.getName().equals(name)) {
                System.out.println(item.getId() + " " + item.getName() + " " + item.getDescription());
            }
        }
        this.init();
    }
    /** exit.**/
    public void exit() {
                System.out.println("Вы вышли из программы");
    }
    /*** @param args **first parameter***/
    public static void main(String[] args) {        //в качестве параметра мы можем передавать любой обьект который реализует интерфейс input
        Tracker tracker = new Tracker();
        //Input input = new StubInput(new String[] {"create stub task"});
        Input input = new ConsoleInput();           //далее сделаем инициализацию нашей консоли
        new StartUIMain(input, tracker).init();
    }
}







