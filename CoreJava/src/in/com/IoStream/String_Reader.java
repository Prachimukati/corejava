package in.com.IoStream;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class String_Reader {
public static void main(String[] args) throws IOException {
	FileReader r = new FileReader("C:\\Users\\rk163\\Desktop\\java Stream\\Hello.txt");
	BufferedReader reader = new BufferedReader(r);
	
	String line = reader.readLine();
	while(line!=null) {
		System.out.println(line);
		line=reader.readLine();
	}
	r.close();
	reader.close();
}
}
