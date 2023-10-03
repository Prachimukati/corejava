package in.com.Strbuffmathtypetypecasting;

public class Strbuffer {
public static void main(String[] args) {
	StringBuffer sd = new StringBuffer("prachi");
	sd.append("mukati");
	System.out.println(sd.length());
	System.out.println(sd.capacity());
	System.out.println(sd.charAt(5));
	System.out.println(sd.indexOf("m"));
	System.out.println(sd.replace(1,4,"ry"));
	System.out.println(sd.reverse());
}
}
