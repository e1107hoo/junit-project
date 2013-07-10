/**
 * 
 */
package chapter18.topc2;

import org.junit.Test;

/**
 * @author mind
 *
 */
public class CalculatorTest {
	
	@Test
	public void 第2引数に0を指定してdivideを呼び出すと例外が発生する() {
		Calculator clc = new Calculator();
		clc.divide(2, 0);
	}
}
