import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ExecutorsSandBox {
	public static void main(String[] args) {
	
		Executor anExecutor = Executors.newCachedThreadPool();
		
			RunnableSandBox runnable1 = new RunnableSandBox();
			anExecutor.execute(runnable1);
			
		try {
			for(int i = 1; i < 3; i++) {
				RunnableSandBox runnable2 = new RunnableSandBox();
				anExecutor.execute(runnable2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
