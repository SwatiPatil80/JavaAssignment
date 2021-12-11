package practice;

class Classexample1 {
	
	public static void main(String[] args) {
		
		int num1,num2;
		try {
			num1=0;
			System.out.println("Sending the Exception");
			num2=62/num1;
			System.out.println(num2);
		}
		catch (ArithmeticException e) {
			
			/*This block will only execute if any Arithmetic exception
			*occurs in try block
			*/
			  System.out.println("We can't devide any number by zero");
		}
		catch (Exception e) {
			/* This is generic Exception Handler which means it can handle 
			 * all the Exceptions.This will execute if the Exception is not
			 * handled by previous catch
			 */
			System.out.println("Exception Occured");
		}
		System.out.println("Try-Catch ended");	
		}
			
		
		
	}

