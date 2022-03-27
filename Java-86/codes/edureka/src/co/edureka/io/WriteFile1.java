package co.edureka.io;

import java.io.FileWriter;

public class WriteFile1 {

	public static void main(String[] args) throws Exception {
		FileWriter fout = new FileWriter("c:/Sunil/edureka.txt");
		
		String str = "World’s #1 E-Learning Platform. Edureka's online training helps you land your dream job. "
				+ "Best-selling technology certification courses co-created with global industry experts. Instructor-led Classes. No Cost EMI Option. Flexible Batch Timings. 24/7 Lifetime Support.";
		
		fout.write(str);
		
		System.out.println("file saved");
		
		fout.close();

	}

}
