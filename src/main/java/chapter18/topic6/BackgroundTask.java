/**
 * 
 */
package chapter18.topic6;

import java.util.concurrent.Executors;

/**
 * @author mind
 *
 */
public class BackgroundTask {
	
	private final Runnable	task;
	
	
	public BackgroundTask(Runnable task) {
		this.task = task;
	}
	
	/**
	 * 
	 */
	public void invoke() {
		// TODO 自動生成されたメソッド・スタブ
		Executors.newSingleThreadScheduledExecutor().execute(task);
	}
	
}
