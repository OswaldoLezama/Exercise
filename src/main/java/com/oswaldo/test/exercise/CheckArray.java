package com.oswaldo.test.exercise;

public class CheckArray {
	
	public static int[] checkValues(int[] args) {
		
		int values[] = new int[2];
				
		values[0] = values[1] = args[0];
		
		for (int z = 0; z < args.length; z++) {
			if (args[z] > values[0]) {
				values[0] = args[z];
			}
			if (args[z] < values[1]) {
				values[1] = args[z];
			}
		}
		
		return values;
		
	}
}
