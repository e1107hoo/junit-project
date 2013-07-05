/**
 * 
 */
package chapter18.topc1;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author mind
 *
 */
public class StringUtilsTest {
	
	@Test
	public void aaaを入力するとaaaを取得できる() throws Exception {
		StringUtils sut = new StringUtils();
		assertThat(sut.toSnakeCase("aaa"), is("aaa"));
	}
	
	@Test
	public void HelloWorldを入力するとhello_worldが取得できる() throws Exception {
		StringUtils sut = new StringUtils();
		assertThat(sut.toSnakeCase("HelloWorld"), is("hello_world"));
	}
}
