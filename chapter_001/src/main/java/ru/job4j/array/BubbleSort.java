/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
* @version $Id$
* @since 0.1**/
package ru.job4j.array;

/**
* BubbleSort.
**/
public class BubbleSort {
	/**
	 * * @param array massive
	 * @return return return
	 */
	public int[] sort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) { //array.length - 1 потому что нужно 9 проверок сделать
			for (int j = 0; j < array.length - 1 - i; j++) {
			if (array[j] > array[j + 1]) {
				int temp = array[j];
				array[j] = array[j + 1];
				array[j + 1] = temp;
			}
		}
		}
		return array; //возвращаем перевернутый массив
	}
}



