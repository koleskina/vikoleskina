/** @author Viktoria Koleskina (mailto:viktoriakoleskina@yandex.ru) 
* @version $Id$ 
* @since 0.1**/ 
package ru.job4j.max; 
/** 
* Max. 
**/ 
public class Max { 
/** 
* @param maxValue. 
*/ 
private int maxValue; 
/** 
* @param first ***first parameter** 
* @param second **sec parameter** 
* @return **return return** 
*/ 
public int max(int first, int second) { 
this.maxValue = first < second ? second : first; 
return this.maxValue; 
} 
/** 
* @param first **first parameter** 
* @param second **sec parameter** 
* @param third **third parameter** 
* @return **return Max Value** 
*/ 
public int max(int first, int second, int third) { 
return this.max(first, this.max(second, third)); 
} 
}