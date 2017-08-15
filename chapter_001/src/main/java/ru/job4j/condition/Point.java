/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
* @version $Id$
* @since 0.1**/
	package ru.job4j.condition;
/**
 * Point.
 **/
	public class Point {
/**
* @param x.
*/
	private int x;
/**
* @param y.
*/
	private int y;
/**
* @param point.
*/
	private int point;
/**
* @param x **first parameter**
* @param y **second parameter**
*/
	public  Point(int x, int y) {
      this.x = x;
      this.y = y;
  }
/**
* @return **Here we return x**
*/
	public int getX() {
      return this.x;
  }
/**
* @return **Here we return y**
*/
	public int getY() {
     return this.y;
  }
/**
* @param a **first parameter**
* @param b **second parameter**
* @return **Here we return point**
*/
  public boolean is(int a, int b) {
	return this.y == this.x * a + b ? true : false;
	}
}