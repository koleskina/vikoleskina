/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
* @version $Id$
* @since 0.1**/
package ru.job4j.array;
/**
* ArrayCopy.
**/
public class ArrayCopy {
	/**
	 *  @param array1 massive
	 *  @param array2 massive
	 * @return return return
	 */
	public int[] copy(int[] array1, int[] array2) {
		int first = 0;
		int second = 0;
		int[] array3 = new int[array1.length + array2.length];
		for (int i = 0; i < array3.length; i++) {
			if (first > array1.length - 1) {
				array3[i] = array2[second];
				second++;
			} else if (second > array2.length - 1) {
				array3[i] = array1[first];
				first++;
			} else if (array1[first] < array2[second]) {
				array3[i] = array1[first];
				first++;
			} else if (array1[first] > array2[second]) {
				array3[i] = array2[second];
				second++;
			}
		}
		return array3;
	}
}
