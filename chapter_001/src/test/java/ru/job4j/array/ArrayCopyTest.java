package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* @Test
*/
public class ArrayCopyTest {
/**
* @Test
*/
    @Test
    public void whenCopyDuplicatesThenArrayWithoutDuplicate() {
		ArrayCopy copy = new ArrayCopy();
		int[] array1 =  {0, 3, 10, 12};
		int[] array2 = {2, 6, 11, 13, 15};
		int[] resultArray = copy.copy(array1, array2);
		int[] expectArray = {0, 2, 3, 6, 10, 11, 12, 13, 15};
		assertThat(resultArray, is(expectArray));
    }
	/**
	 * @Test
	 */
	@Test
	public void whenDuplicatesThenArrayWithoutDuplicate() {
		ArrayCopy copy = new ArrayCopy();
		int[] array1 =  {0, 1, 2, 3, 4, 5, 6, 289};
		int[] array2 = {255, 265, 268, 1000};
		int[] resultArray = copy.copy(array1, array2);
		int[] expectArray = {0, 1, 2, 3, 4, 5, 6,  255, 265, 268, 289, 1000};
		assertThat(resultArray, is(expectArray));
	}
}