/**
 * 
 */
package chapter18.topic5;

/**
 * @author mind
 *
 */
public class ItemStock {
	
	int	values;
	
	
	public ItemStock() {
		values = 0;
		
	}
	
	public int getNum(Item book) {
		
		if (values == 1) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public void add(Item book) {
		values = 1;
	}
	
}
