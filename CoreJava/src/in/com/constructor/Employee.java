package in.com.constructor;
 class Employee {
	private int id;
	private String name;
	
	public Employee() {
		id = 1;
		name = "prachi";
	}
	
	public static void main(String[] args) {
		Employee e = new Employee();
		System.out.println(e.id + "\n" + e.name);
	}
}
