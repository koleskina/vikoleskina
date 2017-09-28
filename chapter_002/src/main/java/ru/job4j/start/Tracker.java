/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
* @version $Id$
* @since 0.1**/
package ru.job4j.start;
import java.util.Random;
import java.util.Arrays;

/*** Tracker.*/
public class Tracker {
	/*** @param item.*/
	private Item[] items = new Item[100];
	/*** @param position.*/
	private int position = 0;
	/*** @param Random.*/
	private static final Random RN = new Random(); //для генерации случайного числа id
	/**
	 * @return **return String.valueOf**
	 */
	String generateId() {                                                                    //данный метод имеет модификатор доступа default, доступен только внунтри данного класса, и внутри пакета в котором находится.
		return String.valueOf(System.currentTimeMillis() + RN.nextInt(100));        //чтобы айди не повторялся будем добавлять реальное время System.currentTimeMillis()
	}


	//Метод public Item add(Item) добавляет заявку, переданную в аргументах в массив заявок this.items;
	/**
	 * @param item **first parameter**
	 * @return **return item**
	 */
	public Item add(Item item) {                    //метод который будет добавлять наш айтем в массив
		item.setId(this.generateId());              //для генерации айдишника мы используем класс Random кот нам генерит интежеры и потом его конвертируем в строку
		this.items[position++] = item;
		return item;
	}
	/**
	 * @param item **first parameter**
	 * @return **return item**
	 */
	public Item update(Item item) {
		for (int index = 0; index != this.position; index++) {
			if (items[index].getId().equals(item.getId())) {
				items[index].setName(item.getName());
			}
		}
		return item;
	}
	/**
	 * @param item **first parameter**
	 */
	public void delete(Item item) {
		for (int index = 0; index != this.position + 1; index++) {
			if (this.items[index] != null && this.items[index].getId().equals(item.getId())) {
				if (index  == this.position) {
					this.items[index] = null;
					this.position--;
				} else {
					int pos = this.items.length - 1 - index;
					System.arraycopy(this.items, index + 1, this.items, index, pos);
					this.position--;
				}
			}
		}
	}
	/**
	 * @return **return result**
	 */
	public Item[] getAll() {
		Item[] result = new Item[this.position];

		for (int index = 0; index != this.position; index++) {        //мы берем наш базовый массив и проходимся по нему
			result[index] = this.items[index];                        //и заполним наши элементы
		}
		return result;
	}
	/**
	 * @param name **first parameter**
	 * @return **return Arrays.copyOf**
	 */
	public Item[] findByName(String name) {
		Item[] result1 = new Item[this.position];  					//создание массива в который будем заносить элементы, у которых совпадающие имена
		int ch = 0;													//переменная счетчик для массива
		for (int index = 0; index != this.position; index++) {
			if (items[index].getName().equals(name)) {
				result1[ch++] = items[index];
			}
		}
		return Arrays.copyOf(result1, ch);
	}
	/**
	 * @param id **first parameter**
	 * @return **return result**
	 */
	protected Item findById(String id) {
		Item result = null;
		for (Item item : items) {
			if (item != null && item.getId().equals(id)) {          //проверяем чтобы обьект был не null, у обьекта айтем дергаем метод гетайди, и у уже возвращаемого Стринг вызываем метод иэквалс который сравнивает его с нашим входязщим параметром айди
				result = item;                                      //если равен то мы делаем присвоение этого айтема к нашему резалту
			} else {
				result = null;
			}
		}
		return result;
	}
}
