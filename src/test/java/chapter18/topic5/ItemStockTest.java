/**
 * 
 */
package chapter18.topic5;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;

@RunWith(Enclosed.class)
public class ItemStockTest {
	
	public static class 初期状態の場合 {
		
		ItemStock	sut;
		Item		book;
		
		
		@Before
		public void setUp() {
			sut = new ItemStock();
			book = new Item("book", 3000);
		}
		
		@Test
		public void 初期状態でgetNumから0が取得できる() {
			
			assertThat(sut.getNum(book), is(0));
			
		}
		
		@Test
		public void 初期状態でaddでItemを追加するとgetNumで1が取得できる() {
			
			sut.add(book);
			
			assertThat(sut.getNum(book), is(1));
		}
	}
	
	public static class bookが1回追加されている場合 {
		
		ItemStock	sut;
		Item		book;
		
		
		@Before
		public void setUp() {
			sut = new ItemStock();
			book = new Item("book", 3000);
			sut.add(book);
		}
		
		@Test
		public void Itemが1つ追加されている状態でgetNumで1が取得できる() {
			assertThat(sut.getNum(book), is(1));
		}
		
	}
	
}
