package com.oswaldo.test.exercise;

public class App 
{
	public static void main(String[] args) {

		int[] lista = ReturnAnArray.CreateArray();
		
		int[] returnedArray = CheckArray.checkValues(lista);
		
		System.out.print("El valor mayor es: " + returnedArray[0]+ "\n");		
		System.out.print("El valor menor es: " + returnedArray[1]);		

	}
	
}