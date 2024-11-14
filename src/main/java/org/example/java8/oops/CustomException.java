package org.example.java8.oops;

/*
 * Steps -
 * 1. create class by extending Exception class
 * 2. create public constructor inside this class
 * 3. use super keyword and call constructor of Exception class
 * 4. throw your exception from try block
 * 5. And catch your exception in catch block
 */


//1. create class by extending Exception class
class MyException extends Exception{

	//2. create public constructor inside this class
	public MyException(String ex) {
		
		//3. use super keyword and call constructor of Exception class
		super(ex);
	}
}


public class CustomException {

	public static void main(String[] args) {
		
		int i =11;
		
		try {
			if(i > 10) {
				
				//4. throw your exception from try block
				throw new MyException("i is greater than 10");		
			}
		}
		//5. And catch your exception in catch block
		catch(MyException ex){
			System.out.println(ex.getMessage()+ " - My exception catched");
		}
		catch(Exception ex) {
			System.out.println(ex.getMessage() + " - generic exception block");
		}
		
		
		System.out.println("Executing next lines after exception...");
		
	}
	
}

