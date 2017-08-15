/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
* @version $Id$
* @since 0.1**/
	package ru.job4j.condition;
/**
 * Point.
 **/
	public class Point {
						/*** @param x.*/
	private int x;
						/*** @param y.*/
	private int y;
						/*** @param point.*/
	private int point;
						/*** @param x **first parameter**
						* @param y **second parameter***/
	public  Point(int x, int y) {
      this.x = x;
      this.y = y;
  }
						/*** @return **Here we return x***/
	public int getX() {
      return this.x;
  }
						/*** @return **Here we return y***/
	public int getY() {
     return this.y;
  }
}
						/*** Triangle.**/
public class Triangle {
						/*** @param a.*/
   private Point a;
						/*** @param b.*/
   private Point b;
						/*** @param c.*/
   private Point c;
						/*** @param a **first parameter**
						* @param b **second parameter**
						* @param c **third parameter***/
   public Triangle(Point a, Point b, Point c) {
       this.a = a;
       this.b = b;
       this.c = c;
    }
						/** @param left Точка слева
						* @param right Точка с права.
						* @return расстояние между точками left и right.*/
public double distance(Point left, Point right) { 				/*Метод должен вычислять расстояние между точками left и right. Для вычисления расстояния использовать формулу. * √(xb - xa)^2 + (yb - ya)^2
																где √ - корень квадратный, для извлечения корня использовать метод Math.sqrt(). ^ - степень.*/
    return -1;
}
						/** @param ab расстояние между точками a b
						* @param ac расстояние между точками a c
						* @param bc расстояние между точками b c
						* @return Периметр.*/
public double period(double ab, double ac, double bc) { 		/*Метод вычисления периметра по длинам сторон.Формула. (ab + ac + bc) / 2*/
    return -1;
}
																/* @return Вернуть прощадь, если треугольник существует или -1.*/
public double area() { 											/*Метод должен вычислить прощадь треугольканива.* Формула.* √ p *(p - ab) * (p - ac) * (p - bc), * где √ - корень квадратный, 
																для извлечения корня использовать метод Math.sqrt().*/
    double rsl = -1;
    double ab = this.distance(this.a, this.b);
    double ac = this.distance(this.a, this.c);
    double bc = this.distance(this.b, this.c);
    double p = this.period(ab, ac, bc);
    if (this.exist(ab, ac, bc)) {
						// написать формулу для расчета площади треугольника.
						//rsl = ...
    }
    return rsl;
}
						/** @param ab Длина от точки a b. 
						* @param ac Длина от точки a c.
						* @param bc Длина от точки b c.
						* @return*/
private boolean exist(double ab, double ac, double bc) {   /* Метод проверяет можно ли построить треугольник с такими длинами сторон. * Подумайте какое надо написать условие, чтобы определить можно ли построить треугольник.*/
   return false;
	}
}


	