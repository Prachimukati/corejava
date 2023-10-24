package AllTest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Read {
public static void main(String[] args) throws IOException {
	FileReader file = new FileReader("C:\\Users\\rk163\\Desktop\\java Stream\\prachi.txt");
	Scanner sc = new Scanner(file);
	while(sc.hasNext()) {
		System.out.println(sc.nextLine());
	}
	file.close();
	sc.close();
	System.out.println("Data read successfully");
}
}
