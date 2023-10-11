package in.com.inheritance;

public class Manager  extends Employe{
	
	 private int numberOfSubordinates;
	 
     public void setNumberOfsubordinates(int numberOfSubordinates) {
    	 this.numberOfSubordinates =  numberOfSubordinates;
     }
     public int getNumberOfSubordinates() {
    	 return  numberOfSubordinates;
     }
     @Override
     public double calculatebonus() {
 		return 0.5;
 	}
     
     @Override
 	public String generatePerformanceResult() {
 		return " Generate Performance Result" ; 
 	}
}
