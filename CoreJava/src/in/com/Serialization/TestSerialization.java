package in.com.Serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {
public static void main(String[] args) throws IOException {
	FileOutputStream in = new FileOutputStream("C:\\Users\\rk163\\Desktop\\java Stream\\obj.txt");
	ObjectOutputStream out = new ObjectOutputStream(in);
	Marksheet m = new Marksheet();
	m.id = 1;
	m.name = "Chandu";
	m.Java = 85;
	m.Css = 90;
	m.JavaScript = 75;
	m.HTML = 95;
	m.pythn = 78;
	m.total = m.Css + m.HTML + m.Java + m.pythn + m.JavaScript;
	out.writeObject(m);
	in.close();
	out.close();
	System.out.println("Data convert succesfully");
}
}
