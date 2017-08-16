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
public double distance(Point left, Point right) { 	
return double distance = Math.sqrt (Math.pow(right.getX() - left.getX(), 2) + (Math.pow(right.getY() - left.getY(), 2)));
}
						/** @param ab расстояние между точками a b
						* @param ac расстояние между точками a c
						* @param bc расстояние между точками b c
						* @return Периметр.*/
public double period(double ab, double ac, double bc) { 		
	return (ab + ac + bc) / 2;
}
public double area() {
    double rsl = -1;
    double ab = this.distance(this.a, this.b);
    double ac = this.distance(this.a, this.c);
    double bc = this.distance(this.b, this.c);
    double p = this.period(ab, ac, bc);
    if (this.exist(ab, ac, bc)) {
	rsl = Math.sqrt(p *(p - ab) * (p - ac) * (p - bc));
    }
    return rsl;
}
						/** @param ab Длина от точки a b. 
						* @param ac Длина от точки a c.
						* @param bc Длина от точки b c.
						* @return*/
private boolean exist(double ab, double ac, double bc) {   
	return ab & ac & bc == 0 ? false : true;
	}
}


	