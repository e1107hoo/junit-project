/**
 * 
 */
package chapter18.topc1;

import static org.junit.Assert.*;

import org.junit.Test;


/**
 * @author mind
 *
 */
public class StringUtilsTest {
	
	@Test
	public void「aaa」を入力すると「aaa」を取得できる() throws Exception {
		StringUtils sut = new StringUtils();
		assertThat(sut.toSnakeCase("aaa"), is("aaa"));
	}
	
}
