/**
 * 
 */
package chapter18.topic4;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author mind
 *
 */
public class NumberUtilsTest {
	
	@Test
	public void 入力値に10を与えるとtrueを返す() {
		NumberUtils sut = new NumberUtils();
		assertThat(sut.isEven(10), is(true));
	}
	
	@Test
	public void 入力値に7を与えるとfalseを返す() {
		NumberUtils sut = new NumberUtils();
		assertThat(sut.isEven(7), is(false));
	}
}
