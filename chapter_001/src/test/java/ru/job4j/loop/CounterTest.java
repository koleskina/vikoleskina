package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* @Test
*/
public class CounterTest {
/**
* @Test
*/
	@Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
Counter count = new Counter();
int result = count.add(0, 10);
assertThat(result, is(30));
        //напишите здесь тест, проверяющий, что сумма чётных чисел от 1 до 10 при вызове метода counter.add будет равна 30.
    }
}