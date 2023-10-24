package in.com.IoStream;

import java.io.FileWriter;
import java.io.IOException;
//import java.io.PrintWriter;
//import java.io.Writer;

public class TestWrite {
public static void main(String[] args) throws IOException {
	FileWriter writer = new FileWriter("C:\\Users\\rk163\\Desktop\\java Stream\\writer.txt");
	//PrintWriter pw = new PrintWriter(writer);
	writer.write("Hello Prachi");
	writer.close();
	System.out.println("Data write successfully");
}
}
