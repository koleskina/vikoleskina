/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
* @version $Id$
* @since 0.1**/
package ru.job4j.start;
/**
 * Item.
 **/
public class Item {
	/**  @param id id*/
	private String id; //определяет уникальный номер для каждого итема
	/**  @param name name*/
	private String name;
	/**  @param description description*/
	private String description;
	/**  @param create create*/
	private long create;
	/** Item.**/
	public Item() { //дефолтный конструктор
	}
	/**
	 * @param name **first parameter**
	 * @param description **sec parameter**
	 * @param create **third parameter**
	 */
	public Item(String name, String description, long create) {
		this.name = name;
		this.description = description;
		this.create = create;
	}
	/*** getName.
	 * * @return this.name*/
	public String getName() {
		return this.name;
	}
	/*** @param name **first parameter***/
	public void setName(String name) {
		this.name = name;
	}
	/*** getDescription.
	 * * @return this.description*/
	public String getDescription() {
		return this.description;
	}
	/*** @param description **first parameter***/
	public void setDescription(String description) {
		this.description = description;
	}
	/*** getCreate.
	 * * @return this.create*/
	public long getCreate() {
		return this.create;
	}
	/*** getId.
	 * * @return this.id*/
	public String getId() {
		return this.id;
	}
	/*** @param id **first parameter***/
	public void setId(String id) {
		this.id = id;
	}

}
