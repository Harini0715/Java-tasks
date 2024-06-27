package com.Practice1;

import java.util.Scanner;

public class charencoding {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		String input = obj.nextLine();
		int n = input.length();
		int output=0;

		for(int i=0;i<n;i++) {
			output*=26;
			output+=input.charAt(i)-64;
		}
		
		System.out.print(output);
		}
}

