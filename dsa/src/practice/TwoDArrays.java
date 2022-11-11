package practice;

import java.util.Scanner;

public class TwoDArrays {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
//		int[][] arr2D = new int[3][3];
//		for(int i = 0; i<arr2D.length; i++) {
//			System.out.println("Enter "+ i +" ith row ");
//			for(int j = 0; j<arr2D[0].length; j++) {
//				int n = scan.nextInt();
//				arr2D[i][j] = n;
//			}
//		}
//		
//		// row wise sum
//		// int[][] arr2D = new int[3][3];
//		for(int i = 0; i<arr2D.length; i++) {
//			int sum = 0;
//			for(int j = 0; j<arr2D[0].length; j++) {
//				sum += arr2D[i][j];
//			}
//			System.out.println(i + "th row sum: " + sum);
//		}
		
		// different way to initialize array
		int[][] arrTwoD = new int[4][];
		
		for(int i =0; i<arrTwoD.length; i++) {
			arrTwoD[i] = new int[i];
		}
		System.out.println(arrTwoD[0].length);
		System.out.println(arrTwoD[2].length);
	}
}