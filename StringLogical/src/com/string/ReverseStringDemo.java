package com.string;

public class ReverseStringDemo {

	public static void main(String[] args) {
		String str="avanish";
		char[] array=str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = array.length-1 ; i>=0;i--) {
			sb.append(array[i]);
		}
		System.out.println("Reverse of string : "+sb);
		sb.toString();
		System.out.println("Reverse of sring : "+sb);
	}
}
