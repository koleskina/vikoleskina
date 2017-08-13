/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
* @version $Id$
* @since 0.1**/
package ru.job4j.calculator;


/**
 * Calculator.
 *
 * @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru)
* @version $Id$
* @since 0.1
 */

public class Calculator {
/**
* @param result.
*/
    private double result;
	/**
     * @param first **first parameter**
	 * @param second **sec parameter**
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
/**
     * @param first **first parameter**
	 * @param second **sec parameter**
     */
	public void subtract(double first, double second) {
        this.result = first - second;
    }
/**
     * @param first **first parameter**
	 * @param second **sec parameter**
     */
	public void div(double first, double second) {
        this.result = first / second;
    }
/**
     * @param first **first parameter**
	 * @param second **sec parameter**
     */
	public void multiple(double first, double second) {
        this.result = first * second;
    }
/**
     * @return **Here we return getResult**
     */
    public double getResult() {
        return this.result;
    }
}