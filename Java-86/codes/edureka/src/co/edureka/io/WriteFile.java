package co.edureka.io;

import java.io.FileOutputStream;

public class WriteFile {

	public static void main(String[] args) throws Exception {
		FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt");
		//FileOutputStream fout = new FileOutputStream("src/co/edureka/io/edureka.txt", true); //true-appending mode
		
		String str = "World’s #1 E-Learning Platform. Edureka's online training helps you land your dream job. "
				+ "Best-selling technology certification courses co-created with global industry experts. Instructor-led Classes. No Cost EMI Option. Flexible Batch Timings. 24/7 Lifetime Support.";
		
		byte[] data = str.getBytes();
		fout.write(data);
		System.out.println("file saved");
		
		fout.close();
	}
}
