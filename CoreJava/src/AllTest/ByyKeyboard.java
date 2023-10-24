package AllTest;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;


public class ByyKeyboard {
public static void main(String[] args) throws IOException {
	FileWriter file = new FileWriter("C:\\Users\\rk163\\Desktop\\java Stream\\print.txt");
	PrintWriter out = new PrintWriter(file);
	out.println("Hello");
	out.println("prachi");
	out.println("How are you");
	System.out.println("Data write successfully");
	file.close();
	out.close();
	
}
}
