package ru.job4j.start;

/**Input.**/
public interface Input { //интерфейс, хранит методы которые должны выполнять
    /**
     * @param question **first parameter**
     * @return **return item**
     */
    String ask(String question);
}
