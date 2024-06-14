package com.tnsif.daysixteen;

public class StringDemo {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3=new String ("Hello");
		
		System.out.println("s1==s2?"+(s1==s2));
		System.out.println("s1==s3?"+(s1==s3));
		System.out.println("s1.equals(s3)?"+s1.equals(s3));
		
		
		String s4=s1;
		String s5=s3;
		String s6=new String(s3);
		String s7=s3.intern();
		
		System.out.println("s1==s4?"+(s1==s4));
		System.out.println("s5==s3?"+(s5==s3));
		System.out.println("s6==s3?"+(s6==s3));
		System.out.println("s7==s3?"+(s7==s3));
		
		
	}

}
