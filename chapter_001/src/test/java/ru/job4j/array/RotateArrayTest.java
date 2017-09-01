package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* @Test
*/
public class RotateArrayTest {
/**
* @Test
*/
    @Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
		RotateArray rotate1 = new RotateArray();
		int[][] array = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
		int[][] resultArray = rotate1.rotate(array);
		int[][] expectArray = {{13, 9, 5, 1}, {14, 10, 6, 2}, {15, 11, 7, 3}, {16, 12, 8, 4}};
		assertThat(resultArray, is(expectArray));
        //напишите здесь тест, проверяющий поворот массива размером 2 на 2.
    }
}