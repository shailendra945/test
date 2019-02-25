import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;

public class MyRejectionExecutionHandler implements RejectedExecutionHandler {

	@Override
	public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
		try {
		RejectionExecutionHandlerTest.ALTERNATEEXECUTOR.execute(r);
		System.out.println("****************alternate executor start executing *************");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
