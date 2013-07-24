/**
 * 
 */
package chapter18.topic6;

import java.util.concurrent.Executors;

public class BackgroundTask {
	
	private final Runnable	task;
	
	
	public BackgroundTask(Runnable task) {
		this.task = task;
	}
	
	public void invoke() {
		Executors.newSingleThreadScheduledExecutor().execute(task);
	}
	
}
