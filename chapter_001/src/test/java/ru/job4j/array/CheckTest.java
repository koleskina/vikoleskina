package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* @Test
*/
public class CheckTest {
/**
* @Test
*/
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
		Check check = new Check();
		boolean result = check.contains("пивотека", "пиво");
		boolean expect = true;
		assertThat(result, is(expect));
    }
	/**
	 * @Test
	 */
	@Test
	public void whentyplicatesThenArrayWithoutDuplicate() {
		Check check = new Check();
		boolean result = check.contains("ab", "b");
		boolean expect = true;
		assertThat(result, is(expect));
	}
	/**
	 * @Test
	 */
	@Test
	public void whentdplicatesThenArrayWithoutDuplicate() {
		Check check = new Check();
		boolean result = check.contains("ab", "a");
		boolean expect = true;
		assertThat(result, is(expect));
	}
	/**
	 * @Test
	 */
	@Test
	public void whesdfmoveDuplicatesThenArrayWithoutDuplicate() {
		Check check = new Check();
		boolean result = check.contains("пивотека", "вот");
		boolean expect = true;
		assertThat(result, is(expect));
	}
	/**
	 * @Test
	 */
	@Test
	public void whesdfmoveDupldscatesThenArrayWithoutDuplicate() {
		Check check = new Check();
		boolean result = check.contains("пивотека", "тека");
		boolean expect = true;
		assertThat(result, is(expect));
	}
	/**
	 * @Test
	 */
	@Test
	public void whesdfmdseDupldscatesThenArrayWithoutDuplicate() {
		Check check = new Check();
		boolean result = check.contains("тер", "тер");
		boolean expect = true;
		assertThat(result, is(expect));
	}
}