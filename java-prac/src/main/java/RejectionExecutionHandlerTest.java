import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class RejectionExecutionHandlerTest {
	
	public final static ThreadPoolExecutor EXECUTOR=(ThreadPoolExecutor)Executors.newFixedThreadPool(5);
	public final static ThreadPoolExecutor ALTERNATEEXECUTOR=(ThreadPoolExecutor)Executors.newFixedThreadPool(5);
	
	public static void main(String[] args) {
		
		MyRejectionExecutionHandler myReject=new MyRejectionExecutionHandler();
		EXECUTOR.setRejectedExecutionHandler(myReject);
		System.out.println("-----Starting ThreadPoolExecutor-------");

		
		Worker [] work=new Worker[10];
		for(int i=0;i<10;i++) {
			work[i]=new Worker(i);
			EXECUTOR.execute(work[i]);
			if(i==6)
				EXECUTOR.shutdown();
			
		}
		EXECUTOR.shutdown();
		
		        while(!EXECUTOR.isTerminated()){
		
		            //Waiting for the termination of executor
	
		        }
		
		        System.out.println("Execution Completed");
		
		         
		
		        ALTERNATEEXECUTOR.shutdown();
		
		        while(!ALTERNATEEXECUTOR.isTerminated()){
		
		            //Waiting for the termination of alternateExecutor
		
		        }
		
		        System.out.println("Alternate Execution Completed");

		
	}

}
