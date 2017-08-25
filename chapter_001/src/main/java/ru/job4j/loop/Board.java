/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
* @version $Id$
* @since 0.1**/
package ru.job4j.loop;
/**
* Board.
**/
public class Board {
	/**
	 * @param width  ширина
	 * @param height высота
	 * @return return return
	 */
	public String paint(int width, int height) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i <  height; i++) {
			for (int j = 0; j <  width; j++) {
				if ((i+j) % 2 == 0) {
					builder.append("x");
				} else {
					builder.append(" ");
				}
			}
			builder.append(System.getProperty("line.separator"));
		}
		return builder.toString();
	}
}


