/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
* @version $Id$
* @since 0.1**/
package ru.job4j.loop;
/**
* Factorial.
**/
public class Factorial {
/*** @param chetnoe.*/
private int factor = 1;
/** @param n число факториал
* @return посчитанный факториал*/
	public int calc(int n) {
for (int i = 1; i <= n; i++) {
	this.factor = this.factor * i;
	}
	System.out.println(this.factor);
	return this.factor;
	}
}


