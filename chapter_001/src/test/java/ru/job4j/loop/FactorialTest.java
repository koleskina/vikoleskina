package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* @Test
*/
public class FactorialTest {
/**
* @Test
*/
	@Test
    public void calculateFactorial() {
Factorial fac = new Factorial();
int result = fac.calc(5);
assertThat(result, is(120));
    }
}