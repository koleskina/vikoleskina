/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
* @version $Id$
* @since 0.1**/
package ru.job4j.array;

/**
* Turn.
**/
public class Turn {
	/**
	 * * @param array massive
	 * @return return return
	 */
	public int[] back(int[] array) {
		for (int i = 0; i < array.length / 2; i++) {
		int temp = array[i];
 		array[i] = array[array.length - 1 - i];
		array[array.length - 1 - i] = temp;
		}
		return array; //возвращаем перевернутый массив
	}
}



