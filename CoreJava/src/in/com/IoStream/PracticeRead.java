package in.com.IoStream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class PracticeRead {
public static void main(String[] args) throws IOException {
	FileReader file = new FileReader ("C:\\Users\\rk163\\Desktop\\java Stream\\prachi.txt");
	Scanner sc = new Scanner (file);
	while(sc.hasNext()) {
		System.out.println(sc.nextLine());
	}
	sc.close();
}
}
