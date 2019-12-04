//P4 Assignment
// Author: Brisben,Blake
// Date:   Sep 13, 2019
// Class:  CS163 or CS164
// Email:  blakebri@rams.colostate.edu

import java.util.Scanner;

public class P4 {

    @SuppressWarnings("resource")
	public static String evaluate(String expression) {
    	
    	// declare vars
    	double operand0, operand1;
    	double result;
    	String operator;
    	
        // Print expression
        System.out.println(expression);

        // Declare variables for operands, operator, result, and return value
        String returnString = "";

        // Create Scanner object to parse expression
        Scanner in = new Scanner(expression);

        // Use Scanner to read operands and operator
        if (in.hasNextDouble())
        	operand0 = in.nextDouble();
        else
        	return "Invalid Operand!";
        operator = in.next();
        if (in.hasNextDouble())
        	operand1 = in.nextDouble();
        else
        	return "Invalid Operand!";
        in.close();
        
        
        // Compute a numerical result for the expression
        switch (operator)
        {
        case "+":
        	result = operand0 + operand1;
        	break;
        case "-":
        	result = operand0 - operand1;
        	break;
        case "/":
        	result = operand0 / operand1;
        	break;
        case "*":
        	result = operand0 * operand1;
        	break;
        case "%":
        	result = operand0 % operand1;
        	break;
        case "^":
        	result = Math.pow(operand0, operand1);
        	break;
        default:
        	return "Invalid Operator!";
        	
        }

        // Convert numerical result to string
        returnString =  Double.toString(result);

        // Return result
        return returnString;
        
        
    }
}