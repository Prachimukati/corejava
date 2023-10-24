package in.com.IoStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class PracticeWrite {
public static void main(String[] args) throws IOException {
	FileWriter writer = new FileWriter("C:\\Users\\rk163\\Desktop\\java Stream\\write.txt");
	writer.write("prachi");
	writer.close();
	System.out.println("Data write successfully");
}
}
