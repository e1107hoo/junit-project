/**
 * 
 */
package chapter18.topic3;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import chapter19.topic3.Counter;

import org.junit.Before;
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
		
		Counter	sut;
		
		
		@Before
		public void setUp() {
			sut = new Counter();
		}
		
		@Test
		public void incrementメソッドを実行すると1が取得できる() {
			assertThat(sut.increment(), is(1));
		}
	}
	
	public static class 一回実行状態 {
		
		Counter	sut;
		
		
		@Before
		public void setUp() {
			sut = new Counter();
			sut.increment();
		}
		
		@Test
		public void incrementメソッドを1回実行した状態でincrementメソッドを実行すると2が取得できる() {
			assertThat(sut.increment(), is(2));
			
		}
	}
	
	public static class increment50回実行状態 {
		
		Counter	sut;
		
		
		@Before
		public void setUp() {
			sut = new Counter();
			for (int i = 0; i < 50; i++) {
				sut.increment();
			}
		}
		
		@Test
		public void incrementメソッドを50回実行した状態でincrementメソッドを実行すると51が取得できる() {
			assertThat(sut.increment(), is(51));
			
		}
	}
}
