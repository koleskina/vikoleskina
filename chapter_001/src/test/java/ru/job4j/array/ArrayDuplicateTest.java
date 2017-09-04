package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* @Test
*/
public class ArrayDuplicateTest {
/**
* @Test
*/
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
		ArrayDuplicate duplicate = new ArrayDuplicate();
		String[] array =  {"Привет", "Мир", "Привет", "Супер", "Мир"};
		String[] resultArray = duplicate.remove(array);
		String[] expectArray = {"Привет", "Мир", "Супер"};
		assertThat(resultArray, is(expectArray));
    }
	/**
	 * @Test
	 */
	@Test
	public void whenRemoveDuplicatesThenArrayWithoutDuplicate1() {
		ArrayDuplicate duplicate = new ArrayDuplicate();
		String[] array =  {"1", "2", "3", "4", "5"};
		String[] resultArray = duplicate.remove(array);
		String[] expectArray = {"1", "2", "3", "4", "5"};
		assertThat(resultArray, is(expectArray));
	}
}