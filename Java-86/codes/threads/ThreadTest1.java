package co.edureka.threads;

class MyTask implements Runnable{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);		
	}
}

public class ThreadTest1 {

	public static void main(String[] args) {
		int n = Thread.activeCount();
		System.out.println("no of active threads = " + n);
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		MyTask task = new MyTask();
		Thread ct = new Thread(task);
		ct.start();
		
		n = Thread.activeCount();
		System.out.println("no of active threads = " + n);
	}

}
