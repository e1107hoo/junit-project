/**
 * 
 */
package chapter18.topic5;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mind
 *
 */
public class ItemStock {
	
	private final Map<String, Integer>	values	= new HashMap<String, Integer>();
	
	
	public int getNum(Item item) {
		Integer num = values.get(item.name);
		if (num == null) {
			num = 0;
		}
		return num;
	}
	
	public void add(Item item) {
		Integer num = values.get(item.name);
		if (num == null) {
			num = 0;
		}
		num++;
		values.put(item.name, num);
	}
	
}
