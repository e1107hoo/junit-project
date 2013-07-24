/**
 * 
 */
package chapter18.topic6;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class BackgroundTaskTest {
	
	@Rule
	public Timeout	timeout	= new Timeout(1000);
	
	
	@Test
	public void invokeメソッドによりRunnableオブジェクトのrunメソッドが別スレッドで実行される() throws Exception {
		// SetUp
		final AtomicReference<String> backgroundTheadName = new AtomicReference<String>();
		final CountDownLatch latch = new CountDownLatch(1);
		
		Runnable task = new Runnable() {
			
			@Override
			public void run() {
				backgroundTheadName.set(Thread.currentThread().getName());
				latch.countDown();
			}
		};
		BackgroundTask sut = new BackgroundTask(task);
		// Exercise
		sut.invoke();
		latch.await();
		// Verify
		assertThat(backgroundTheadName.get(), is(not(Thread.currentThread().getName())));
		
	}
	
}
