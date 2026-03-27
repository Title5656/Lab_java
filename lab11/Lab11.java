import java.util.Scanner;
import java.util.InputMismatchException;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Lab11 {
	public static int balance = 3000;
	
	//------------challenge----------// 
	public static void withDraw(int amount) throws pidkub {
		if (amount < 0) {
			throw new pidkub("You must enter amount > 0");
		}
		if (amount > balance) {
			throw new pidkub("Insufficient amount to withdraw");
		}
		balance -= amount;
		System.out.println("withdraw: " + amount);
		System.out.println("balance: " + balance);
	}
	
	public static void main(String[] args) {
		
		//--------------Task1--------------//
		//task1.1
		try {
			System.out.println(3/0);
		}catch(ArithmeticException e) {
			System.out.println("Cannot divide by 0");
		}
		
		
		//task1.2
		try {
			int x;
			Scanner reader = new Scanner(System.in);
			System.out.print("Enter number: ");
			x = reader.nextInt();   //possibly run-time error 
			System.out.println("Your number is " + x);
			reader.close();
		} catch (InputMismatchException e) {

			System.out.println("Exception occurred.");
		}
		
		
		

		//task1.3
		try {
			String[] list = {"$123", "456"}; 
			double amount = Double.parseDouble(list[0]);
			System.out.println("The amount at index 2 " + amount);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Index out of bounds.");
		} catch (NumberFormatException e){
			System.out.println("Number format exception.");
		} finally{
			System.out.println("Program Ended");	
		}
		
		
		
		//--------------Task2--------------//
		
		try {
			int balance = 3000;
			Scanner reader2 = new Scanner(System.in);
			System.out.print("Enter amount: ");
			int bal = reader2.nextInt();
			withDraw(bal);
			reader2.close();
		} catch (pidkub e) {
			e.printStackTrace();
		}
	}
}