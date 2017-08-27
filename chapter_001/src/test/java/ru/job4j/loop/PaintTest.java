package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* @Test
*/
public class PaintTest {
/**
* @Test
*/
@Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.piramid(2);
        String expected = String.format(" ^ \r\n^^^\r\n", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
/**
* @Test
*/
@Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
       Paint paint = new Paint();
        String result = paint.piramid(3);
        String expected = String.format("  ^  \r\n ^^^ \r\n^^^^^\r\n", System.getProperty("line.separator"));
        assertThat(result, is(expected));
    }
}