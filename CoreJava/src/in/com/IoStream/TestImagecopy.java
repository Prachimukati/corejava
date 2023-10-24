package in.com.IoStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestImagecopy {
public static void main(String[] args) throws IOException {
	FileInputStream in = new FileInputStream("C:\\Users\\rk163\\Desktop\\java Stream\\bullet.jpg");
	FileOutputStream out = new FileOutputStream("C:\\Users\\rk163\\Desktop\\java Stream\\Bike.txt");
	int ch = in.read();
	while(ch!= - 1) {
		out.write(ch);
		ch=in.read();
	}
	in.close();
	out.close();
	System.out.println("Data is copy");
	
}
}
