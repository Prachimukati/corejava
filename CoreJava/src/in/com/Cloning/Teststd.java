package in.com.Cloning;

public class Teststd {
public static void main(String[] args) throws CloneNotSupportedException {
	Student s1 = new Student(45, "Ujjain");
    Student s2=(Student) s1.clone();
    s2.age=12;
    s2.address="Indore";
    System.out.println(s1.age);
    System.out.println(s1.address);
	System.out.println(s2.age);
	System.out.println(s2.address);
}
}
