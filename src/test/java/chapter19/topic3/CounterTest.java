/**
 * 
 */
package chapter19.topic3;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author mind
 *
 */
public class CounterTest {
	
	@Test
	public void incrementメソッドを実行すると1が取得できる(){
		Counter sut = new Counter ;
		assertThat(sut.increment(), is(1));
	}
}
