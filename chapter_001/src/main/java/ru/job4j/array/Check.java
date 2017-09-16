/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
 * @version $Id$
 * @since 0.1**/
package ru.job4j.array;
/**
 * ArrayDuplicate.
 **/
public class Check {
	/**
	 * * @param origin origin
	 *  @param sub sub
	 * @return return return
	 */
	boolean contains(String origin, String sub) {
		boolean vi = false;
		char[] or = origin.toCharArray();
		char[] su = sub.toCharArray();
		int count = 0;
		for (int i = 0; i < or.length; i++) {
				for (int j = 0; j < su.length; j++) {
					if (or[i + j] == su[j]) {
						count++;
					}
				}
			if (su.length == count) {
				vi = true;
				break;
			} else {
				count = 0;
			}
		}
		return vi;
	}
}