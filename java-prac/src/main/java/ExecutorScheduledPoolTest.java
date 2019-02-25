import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorScheduledPoolTest {

	public static void main(String[] args) {
		
		Runtime runtime=Runtime.getRuntime();
		System.out.println("Available cpu core : "+runtime.availableProcessors());
		ScheduledExecutorService executor=Executors.newScheduledThreadPool(runtime.availableProcessors());
		try {
			Runnable runable = () -> {
				try {
					Thread.sleep(4000l);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				System.out.println("Current thread :" + Thread.currentThread().getName()+" millis : "+System.currentTimeMillis());
			};
			executor.schedule(runable, 5000, TimeUnit.MILLISECONDS);
			//executor.scheduleAtFixedRate(runable, 5000, 1000, TimeUnit.MILLISECONDS);
			//executor.scheduleWithFixedDelay(runable, 5000, 1000, TimeUnit.MILLISECONDS);
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println(executor.isTerminated());
		System.out.println(executor.isShutdown());
		
	}

	

}
