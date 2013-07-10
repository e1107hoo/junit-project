/**
 * 
 */
package chapter18.topc2;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

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
	
	@Test
	public void 第1引数を4第2引数を2で2を返す() {
		Calculator clc = new Calculator();
		assertThat(clc.divide(4, 2), is(2));
	}
}