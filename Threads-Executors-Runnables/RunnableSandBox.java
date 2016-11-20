
public class RunnableSandBox implements Runnable {
	private int counter = 1;
	public void run() {
		synchronized(this)
		{
			try {
				for (int i = 1; i < 3 ; i++) {
					System.out.println("Thread ID: " + Thread.currentThread().getName() +
							" Counter: " + counter++);
					Thread.sleep(100);
				}
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}

	public static void main(String[] args) {
	}

}
