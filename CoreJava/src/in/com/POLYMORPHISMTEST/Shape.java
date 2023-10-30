package in.com.POLYMORPHISMTEST;

 class Shape {
                                  // METHOD OVERRIDING
	void draw() {
		System.out.println("Can't say shape type");
	}
 }
 
 class Square extends Shape {
	 @Override
	 void draw() {
		 System.out.println("Square shape");
	 }
 }