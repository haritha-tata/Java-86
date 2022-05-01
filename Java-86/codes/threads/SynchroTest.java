package co.edureka.threads;
class Printer{
	
	//public void printTable(int n) {
	public synchronized void printTable(int n) {
		for(int i=1;i<=10;i++) {
			int p = n * i;
			try {
				System.out.println(n + " x " + i + " = " + p);
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}
		System.out.println("------------------------------------");
		try {
			Thread.sleep(4000);
		}catch(Exception ex) {}
	}
}

class MyThread1 extends Thread{
	Printer printer;
	
	MyThread1(Printer p){
		this.printer = p;
	}
	
	public void run() {
		printer.printTable(5);
	}
}

class MyThread2 extends Thread{
	Printer printer;
	
	MyThread2(Printer p){
		this.printer = p;
	}
	
	public void run() {
		printer.printTable(6);
	}
}
public class SynchroTest {

	public static void main(String[] args) {
		Printer printer = new Printer();
		
		MyThread1 t1 = new MyThread1(printer);
		MyThread2 t2 = new MyThread2(printer);
		
		t1.start();
		t2.start();
	}

}
