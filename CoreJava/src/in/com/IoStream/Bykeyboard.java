package in.com.IoStream;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Bykeyboard {
public static void main(String[] args) throws IOException {
	System.out.println("Enter text");
	InputStreamReader isReader = new InputStreamReader(System.in);
	BufferedReader in = new BufferedReader(isReader);
	FileWriter write = new FileWriter("C:\\Users\\rk163\\Desktop\\java Stream\\print1.txt");
	PrintWriter out = new PrintWriter(write);
	String line =  in.readLine();
	while(!(line.equals("By"))) {
		out.print(line);
		line = in.readLine();
	}
	System.out.println("your compiler is closed");
	isReader.close();
	in.close();
	write.close();	
}
}