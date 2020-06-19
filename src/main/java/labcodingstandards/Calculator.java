//
//

package labcodingstandards;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


/**
 * @author
 *
 */

public class Calculator {	
//CHECKSTYLE:OFF
	public static void main(String[] args) {
//CHECKSTYLE:ON

		Scanner reader = new Scanner(System.in);

	
        System.out.print("1. +\n2. -\n3. *\n4. /\nEnter an operator: ");
        
        char operator = reader.nextLine().charAt(0);
        double First;
        double second;
        String input;
        
        while (true) {
        	System.out.print("Enter first number: ");
        	input = reader.nextLine();
        	
            try {
            	First=Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }
        
        while (true) {
        	System.out.print("Enter second number: ");
        	input = reader.nextLine();
        	
            try {
            	second=Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Not valid!");
            }
        }

        Calculator cal=new Calculator();
        String result=cal.Operation(First,second,operator);

        System.out.printf(result);
		reader.close();
	}

	private String Operation(double first,double second,char operator) {
		double result = 0;
		switch(operator)
        {
            case '1':
                result=first+second;
                break;
            case '2':
                result=first-second;
                break;
            case '3':
                result=first*second;
                break;
            case '4':
                result =first/second;
                break;
            default:
            	return "Error! operator is not correct";
        }
		return "The result is: "+result;
	}

	public void doSomething8(File file) throws IOException {
	    if (file == null) {
	        throw new FileNotFoundException(); // violation
	    }
	}
	
	class MyClass {
		  public void myMethod() {} // OK
		  public void MyMethod() {} // violation, name "MyMethod"
		                            // should match the pattern "^[a-z](_?[a-zA-Z0-9]+)*$"
	}
	
	public void myTest() {
	    int a; int b;           // OK
	    int x;int y;            // violation

	    a=1;
	    b=1;
	    x=2;
	    y=2;
	    
	    testMethod(a, b);   // OK
	    testMethod(x,y);    // violation

	    
	}

	private void testMethod(int a, int b) {
		// TODO Auto-generated method stub
		
	}
	
	
}


