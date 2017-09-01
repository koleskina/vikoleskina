/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
* @version $Id$
* @since 0.1**/
package ru.job4j.array;

/**
* RotateArray.
**/
public class RotateArray {
	/**
	 * * @param array massive
	 *
	 * @return return return
	 */
	public int[][] rotate(int[][] array) {
		for (int i = 0; i < array.length / 2; i++) { 			//array.length / 2  - так мы узнаем сколько поворачиваем квадратов
			for (int j = i; j < array.length - 1 - i; j++) { 	//array.length - 1 - i ограничение для количества итераций
				int temp = array[i][j];							//создание переменной в кот хранится массив
				array[i][j] = array[array.length - 1 - j][i];	//[0][0] -> [0][3]
				array[array.length - 1 - j][i] = array[array.length - 1 - i][array.length - 1 - j]; //[0][3] -> [3][3] ->
				array[array.length - 1 - i][array.length - 1 - j] = array[j][array.length - 1 - i]; //[3][3] -> [3][0] ->
				array[j][array.length - 1 - i] = temp; //[3][0] -> [0][0].
			}
		}
		return array; //возвращаем массив
	}
}
