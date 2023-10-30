package in.com.deserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Deserizable {
public static void main(String[] args) throws Exception {
	String source = "C:\\Users\\rk163\\Desktop\\java Stream\\mukati.txt";
	FileInputStream in = new  FileInputStream(source);
    ObjectInputStream out = new ObjectInputStream(in);
	Marksheet m =(Marksheet) out.readObject();    
    
	System.out.println("id="+m.id);
	System.out.println("name="+m.name);
	System.out.println("java="+m.Java);
	System.out.println("html="+m.HTML);
	System.out.println("css="+m.Css);
	System.out.println("javaScript="+m.JavaScript);
	System.out.println("total="+m.total);
	in.close();
	out.close();
	System.out.println("Deserialization completed");
	
}
}
