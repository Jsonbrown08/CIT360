
public class NastyThreadSandBox extends Thread {
	public static Object ball = new Object();
	public static String greeting = "hello";
	
	@Override
	public void run() {
		
		synchronized (ball) {
			System.out.println("Thread 1: acessing the oject");
			try {
				Thread.sleep(10);
			}
			catch (InterruptedException e) { 
				e.printStackTrace();
			}
			synchronized (greeting) {
				System.out.println("Thread 2: trying to access the string that Thread 2 is accessing");
			}
		}
		
		synchronized (greeting) {
			System.out.println("Thread 2: acessing the string");
			try {
				Thread.sleep(10);
			}
			catch (InterruptedException e) { 
				e.printStackTrace();
			}
			synchronized (ball) {
				System.out.println("Thread 2: trying to access the string that Thread 1 is accessing");
			}
		}
	}
	
	public static void main(String args[]) {
		
		NastyThreadSandBox nastyThread1 = new NastyThreadSandBox();
		NastyThreadSandBox nastyThread2 = new NastyThreadSandBox();
		
		nastyThread1.start();
		nastyThread2.start();
	}
}
