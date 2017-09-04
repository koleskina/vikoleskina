/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
* @version $Id$
* @since 0.1**/
package ru.job4j.array;

import java.util.Arrays;

/**
* ArrayDuplicate.
* Метод должен убрать все дубликаты строк из массива.
**/
public class ArrayDuplicate {
	/**
	 * * @param array massive
	 * @return return return
	 */
	public String[] remove(String[] array) {
		int count = 0;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i + 1; j < array.length - 1 - i; j++) {
				if (array[i].equals(array[j])) {
					String temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
					count++;
				}
			}
		}
		return Arrays.copyOf(array, array.length - count);
	}
}
