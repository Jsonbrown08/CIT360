
public class ThreadSandBox extends Thread {
	public static String one = "hello";
	public static String two = "good-bye";
	
	@Override
	public void run() {
		
		synchronized (one) {
			for (int i = 0; i < 2; i++) {
				System.out.println("Sad");
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (two) {
				}
			}
		}

		synchronized (one) {
			for (int i = 0; i < 2; i++) {
				System.out.println("Happy");
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				synchronized (two) {
				}
			}
		}
	}
	
	public static void main(String[] args) {
		ThreadSandBox happyThread = new ThreadSandBox();
		happyThread.start();
	}
}
