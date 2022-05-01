package co.edureka.threads;

class MyThread extends Thread {
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println(t);		
	}
}

public class ThreadTest2 {

	public static void main(String[] args) {
		int n = Thread.activeCount();
		System.out.println("no of active threads = " + n);
		
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		MyThread ct = new MyThread();
		ct.start();
		
		n = Thread.activeCount();
		System.out.println("no of active threads = " + n);
	}

}
