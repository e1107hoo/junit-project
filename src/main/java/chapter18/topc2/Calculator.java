/**
 * 
 */
package chapter18.topc2;

/**
 * @author mind
 *
 */
public class Calculator {
	
	public int divide(int x, int y) throws IllegalAccessException {
		if (y == 0) {
			throw new IllegalAccessException();
		}
		return x / y;
	}
	
}
