import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class SingleThreadExecutorTest {

	public static void main(String[] args) {
		
		//int nThreads=10;
		ExecutorService executor=Executors.newSingleThreadExecutor();
		List<Callable<String>> taskList = CreateTasks();
		List<Future<String>> futureList=null;;
		try {
			
		futureList=executor.invokeAll(taskList);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		futureList.stream().map(x->{
			try {
				return x.get();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
			return null;
		}).forEach(System.out::println);
		
		List<Runnable> tasks=executor.shutdownNow();
		System.out.println(executor.isTerminated());
		System.out.println(executor.isShutdown());
		System.out.println(tasks);
	}

	private static List<Callable<String>> CreateTasks() {
		List<Callable<String>> taskList=new ArrayList<Callable<String>>();
		taskList.add(()->{
		Thread.sleep(4000l);
		return("Current thread :"+Thread.currentThread().getName());
		});
		taskList.add(()->{
			Thread.sleep(4000l);
			return("Current thread :"+Thread.currentThread().getName());
		});
		taskList.add(()->{
		Thread.sleep(4000l);
		return("Current thread :"+Thread.currentThread().getName());
		});
		taskList.add(()->{
		Thread.sleep(4000l);
		return("Current thread :"+Thread.currentThread().getName());
		});
		taskList.add(()->{
		Thread.sleep(4000l);
		return("Current thread :"+Thread.currentThread().getName());
		});
		taskList.add(()->{
		Thread.sleep(4000l);
		return("Current thread :"+Thread.currentThread().getName());
		
		});
		taskList.add(()->{
			Thread.sleep(4000l);
		return("Current thread :"+Thread.currentThread().getName());
		
		});
		taskList.add(()->{
			Thread.sleep(4000l);
			return("Current thread :"+Thread.currentThread().getName());
		});
		taskList.add(()->{
		Thread.sleep(4000l);
		return("Current thread :"+Thread.currentThread().getName());
		
		});
		taskList.add(()->{
			Thread.sleep(4000l);
			return ("Current thread :"+Thread.currentThread().getName());
		
		});
		taskList.add(()->{
			Thread.sleep(4000l);
			return ("Current thread :"+Thread.currentThread().getName());
		
		});taskList.add(()->{
			Thread.sleep(4000l);
			return ("Current thread :"+Thread.currentThread().getName());
		
		});taskList.add(()->{
			Thread.sleep(4000l);
			return ("Current thread :"+Thread.currentThread().getName());
		
		});taskList.add(()->{
			Thread.sleep(4000l);
			return ("Current thread :"+Thread.currentThread().getName());
		
		});taskList.add(()->{
			Thread.sleep(4000l);
			return ("Current thread :"+Thread.currentThread().getName());
		
		});taskList.add(()->{
			Thread.sleep(4000l);
			return ("Current thread :"+Thread.currentThread().getName());
		
		});taskList.add(()->{
			Thread.sleep(4000l);
			return ("Current thread :"+Thread.currentThread().getName());
		
		});
		return taskList;
	}

}
