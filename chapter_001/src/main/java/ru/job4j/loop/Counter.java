/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
* @version $Id$
* @since 0.1**/
package ru.job4j.loop;
/**
* Counter.
**/
public class Counter {
/*** @param chetnoe.*/
	private int chetnoe;
/** @param start начало цикла
* @param finish конец цикла
* @return chetnoe*/
	public int add(int start, int finish) {
		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
			this.chetnoe = this.chetnoe + i;
			}
		}
		System.out.println(this.chetnoe);
		return this.chetnoe;
	}
}