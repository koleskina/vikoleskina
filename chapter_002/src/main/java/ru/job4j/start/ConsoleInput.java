package ru.job4j.start;


import java.util.Scanner;
/**ConsoleInput.**/
public class ConsoleInput implements Input {            //implements Input значит что мы обязаны реализовать все методы кот находятся в Input
    /*** @param scanner.*/
    private Scanner scanner = new Scanner(System.in);   //для ввода значений
    /** @param question *first parameter*
     * @return *scanner**/
    public String ask(String question) {                 //имплементируем метод ask
        System.out.println(question);
    //return scanner.next(); //метод next вернет нам значение, метод next считывает первое слово до разделения
        return scanner.nextLine(); //метод next вернет нам значение
    }
}
