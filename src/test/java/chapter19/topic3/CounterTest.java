/**
 * 
 */
package chapter19.topic3;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

/**
 * @author mind
 *
 */
@RunWith(Enclosed.class)
public class CounterTest {
	
	public static class 初期状態の場合 {
		
		@Test
		public void incrementメソッドを実行すると1が取得できる() {
			Counter sut = new Counter();
			assertThat(sut.increment(), is(1));
		}
	}
	
	public static class 一回実行状態 {
		
		@Test
		public void incrementメソッドを1回実行した状態でincrementメソッドを実行すると2が取得できる() {
			Counter sut = new Counter();
			sut.increment();
			assertThat(sut.increment(), is(2));
			
		}
	}
}
