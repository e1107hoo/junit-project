/**
 * 
 */
package chapter18.topic5;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class ItemStockTest {
	
	@Test
	public void 初期状態でgetNumから0が取得できる() {
		ItemStock sut = new ItemStock();
		assertThat(sut.getNum(), is(0));
		
	}
	
}
