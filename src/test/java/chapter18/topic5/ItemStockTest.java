/**
 * 
 */
package chapter18.topic5;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ItemStockTest {
	
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
