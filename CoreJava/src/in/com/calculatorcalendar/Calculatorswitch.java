package in.com.calculatorcalendar;

public class Calculatorswitch {
public static void main(String[] args) {
	double num1 = 100.00;
	double num2 = 10.0;
	double result ;
	char operator = '+' ;
	switch(operator) 
	{
	case '+':
		result = num1 + num2;
		System.out.println("add ="+result);
		break;
	case '-':
		result = num1 - num2;
		System.out.println("subs ="+result);
		break;
	case '*':
		result = num1 * num2;
		System.out.println("mult ="+result);
		break;
	default :
	 System.out.println("default part ");
		break;
	}
}
}
