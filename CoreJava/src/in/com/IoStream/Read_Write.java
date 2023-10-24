package in.com.IoStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write {
public static void main(String[] args) {
	File f = new File("ramu.txt");
	try {
		f.createNewFile();
	} catch (IOException e) {
	    System.out.println("file not found");
	}
//	try {
//		FileWriter fw = new FileWriter(f);
//		fw.write("If you can dream it you can do it");
//		fw.close();
//		
//	} catch (Exception e) {
//		System.out.println("done");
//		e.printStackTrace();
	}
}

