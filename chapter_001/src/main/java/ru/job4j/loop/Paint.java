/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
* @version $Id$
* @since 0.1**/
package ru.job4j.loop;
/**
* Board.
**/
public class Paint {
	/**
	 * @param h высота
	 * @return return return
	 */
	String piramid(int h) {
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < h; i++) {
			for (int j = 0; j < h * 2 - 1; j++) {
				if (j > h - 2 - i && j < h + i) {
					builder.append("^");
				} else {
					builder.append(" ");
				}
			}
			builder.append(System.getProperty("line.separator"));
		}
		return builder.toString();
	}
}



