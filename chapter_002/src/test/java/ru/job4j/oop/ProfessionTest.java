package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* @Test
*/
public class ProfessionTest {
    /**
     * @Test
     */
    @Test
    public void first() {
        Teacher te = new Teacher("Peter", "MGU", 1998, "Moscow", 8, "Mathematics", 425);
        Doctor doc = new Doctor("Carl", "Sechenova", 1995, "Smolensk", 15, "Allergy", 82596345);
        Engineer en = new Engineer("Viktoria", "MADI", 2016, "Moscow", 1, 1, "Development");


        String result1 = te.teach(doc);
        String result2 = doc.medicate(en);
        String result3 = en.instruct(te);

        String expect1 = "Учитель Peter обучает Carl";
        assertThat(result1, is(expect1));

        String expect2 = "Доктор Carl лечит Viktoria";
        assertThat(result2, is(expect2));

        String expect3 = "Инженер Viktoria инструктирует Peter";
        assertThat(result3, is(expect3));
    }
}
