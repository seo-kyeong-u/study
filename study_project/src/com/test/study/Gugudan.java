package com.test.study;

public class Gugudan {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			System.out.println(i+"´Ü");
			for (int j = 1; j <= 9; j++) {
				int hap = i*j;
				System.out.print(i+"*"+j+ "=" + hap + " ");
			}
			System.out.println();
		}
	}
}
