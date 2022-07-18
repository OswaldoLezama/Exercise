package com.oswaldo.test.exercise;
import java.util.Scanner;

public class ReturnAnArray {
	
    public static int[] CreateArray() {

    	Scanner teclado = new Scanner (System.in);
		System.out.print("Por favor ingrese el tamaño de la lista: ");
		int n = teclado.nextInt();
		int lista[] = new int[n];
		
		for (int i = 0; i < lista.length; i++) {
			System.out.print("Ingrese numero "+ (i+1)+": ");
			lista[i] = teclado.nextInt();
		}
		return lista;
    }
}