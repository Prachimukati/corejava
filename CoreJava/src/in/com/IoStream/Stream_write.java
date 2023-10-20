package in.com.IoStream;

import java.io.FileWriter;
import java.io.IOException;

public class Stream_write {
public static void main(String[] args) throws IOException {
	FileWriter writer = new FileWriter("C:\\Users\\rk163\\Desktop\\java Stream\\Hello.txt");
    writer.write("How are you");
    writer.close();
    System.out.println("Data is copy");
}
}
