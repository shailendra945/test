
public class Worker implements Runnable {
	
	public int id;
	
	public Worker(int id) {
		this.id=id;
	}

	@Override
	public void run() {
		
		try {
			String name=Thread.currentThread().getName();
			System.out.println(name +"Executing "+id);
			Thread.sleep(1000);
			System.out.println(name +"completed "+id);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
	}
	
}
