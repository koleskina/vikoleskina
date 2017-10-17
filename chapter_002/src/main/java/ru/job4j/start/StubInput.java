package ru.job4j.start;

/**StubInput.**/
public class StubInput implements Input {
    /*** @param answers.*/
    private String[] answers;
    /*** @param position.*/
    private int position = 0;
    /**
     * @param answers **first parameter**
     */
    public StubInput(String[] answers) { //создадим конструктор который будет принимать наши значения
    this.answers = answers;
    }
    /**
     * @param question **first parameter**
     * @return **return answers**
     */
    public String ask(String question) { //данный метод мы будем использовать для тестирования нашего кода
        return answers[position++]; //здесь будем получать значения из нашего цикла, и будем делать постинкремент чтобы увеличивать наши значения
    }
}

