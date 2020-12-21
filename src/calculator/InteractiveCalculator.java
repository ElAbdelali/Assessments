package calculator;

import java.util.Scanner;

import calculatorOperations.AddOperation;
import calculatorOperations.DivideOperation;
import calculatorOperations.MultiplyOperation;
import calculatorOperations.SubtractOperation;



public class InteractiveCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please input a number:");
		int numberA = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please input a second number:");
		int numberB = scanner.nextInt();
		System.out.println("Please enter an operation:");
		scanner.nextLine();
		String operation = scanner.nextLine();
		
		double result = 0;
		if (operation.equals("+")) {
			AddOperation add = new AddOperation();
			add.setA(numberA);
			add.setB(numberB);
			result = add.getResult();
		} else if (operation.equals("-")) {
			SubtractOperation substract = new SubtractOperation();
			substract.setA(numberA);
			substract.setB(numberB);
			result = substract.getResult();
		} else if (operation.equals("*")) {
			MultiplyOperation multiply = new MultiplyOperation();
			multiply.setA(numberA);
			multiply.setB(numberB);
			result = multiply.getResult();
		} else if (operation.equals("/")) {
			DivideOperation divide = new DivideOperation();
			divide.setA(numberA);
			divide.setB(numberB);
			result = divide.getResult();
		} else {
			System.out.println("Operation was not recognized. Please use one of the following: (+, -, *, /)");
		}

		System.out.println("The result is");
		System.out.println(result);
		

	}

}
