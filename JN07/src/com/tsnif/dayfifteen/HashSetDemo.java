package com.tsnif.dayfifteen;
import java.util.HashSet;
import java.util.PriorityQueue;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> set1 = new HashSet<Integer>();
	      set1.add(50);
	      set1.add(100);
	      set1.add(25);
	      set1.add(90);
	      set1.add(65);
	      set1.add(80);
	      set1.add(70);
	      System.out.println("First Set :"+set1);
	      System.out.println(set1.add(65));
	      System.out.println(set1);
	      
	   HashSet<Integer> set2 = new HashSet<Integer>();
	      set2.add(51);
	      set2.add(100);
	      set2.add(21);
	      set2.add(91);
	      set2.add(65);
	      set2.add(80);
	      set2.add(70);
	      System.out.println("Second Set :"+set2);
	      System.out.println("-----------------------------------------");
	      
	      //union operation
	      set1.addAll(set2);
	      System.out.println("First Set :"+set1);
	      System.out.println("Second Set :"+set2);
	      System.out.println("-----------------------------------------");
	      
	      
	      //difference operation
	      set1.removeAll(set2);
	      System.out.println("First Set :"+set1);
	      System.out.println("Second Set :"+set2);
	      
	      set1.clear();
	      set1.add(50);
	      set1.add(100);
	      set1.add(25);
	      set1.add(90);
	      set1.add(65);
	      set1.add(80);
	      set1.add(70);
	      System.out.println("First Set :"+set1);
	      System.out.println("Second Set :"+set2);
	      System.out.println("-----------------------------------------");
	       
	      //Intersection of two sets
	      set1.retainAll(set2);
	      System.out.println("First Set :"+set1);
	      System.out.println("Second Set :"+set2);
	      System.out.println("-----------------------------------------");
	      
	}

}
