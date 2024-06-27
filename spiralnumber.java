package com.Practice1;

import java.util.Scanner;

public class spiralnumber {


	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		int n=obj.nextInt();
		int [][]matrix = new int[n][n];
		
//		
////		for(int i=0;i<n;i++) {
////			for(int j=0;j<n;j++) {
////				matrix[i][j]=++k;
////			}
////			
////		}
		
//		for(int i=0;i<n;i++) {
//			for(int j=0;j<n;j++) {
//				System.out.print(matrix[i][j]);
//			}
//			System.out.print("\n");
//		}
			
		obj.close();
		printing(matrix,n);

	}
	
	
	public static void printing(int [][]matrix,int n) {
		int k=1;
		int top=0,bottom=n-1,left=0,right=n-1;
//		StringBuilder res = new StringBuilder();
		
		while(top<=bottom&&left<=right) {
			for(int i=left;i<=right;i++) {
				matrix[top][i]=k;
				k++;
			}
			top++;
			
			for(int i=top;i<=bottom;i++) {
				matrix[i][right]=k;
				k++;
			}
			right--;
			
			if(top<=bottom) {
			for(int i=right;i>=left;i--) {
				matrix[bottom][i]=k;
				k++;
			}
			bottom--;
			}
			
			if(left<=right){
			for(int i=bottom;i>=top;i--) {
				matrix[i][left]=k;
				k++;
			}
			left++;
		}
		}
		
		 //System.out.println(res.toString().trim());
		 
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(matrix[i][j]);
			}
			System.out.print("\n");
		}
		
//		for(int[] in:matrix) {
//			for(int a:in) {
//				System.out.print(a);
//			}
//			System.out.println();
//		}
		
	}
}
	
	
	
	