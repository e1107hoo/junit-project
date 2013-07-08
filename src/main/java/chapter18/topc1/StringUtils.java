/**
 * 
 */
package chapter18.topc1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author mind
 *
 */
public class StringUtils {
	
	/**
	 * @param string
	 * @return
	 */
	public String toSnakeCase(String string) {
		
		String snake = string;
		Pattern p = Pattern.compile("([A-Z])");
		for (;;) {
			Matcher m = p.matcher(snake);
			if (!m.find()) {
				break;
			}
			snake = m.replaceFirst("_" + m.group(1).toLowerCase());
		}
		return snake.replaceFirst("^_", "");
	}
}
