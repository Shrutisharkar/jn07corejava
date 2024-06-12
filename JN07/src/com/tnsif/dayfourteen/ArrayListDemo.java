package com.tnsif.dayfourteen;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {

	//Raw list hetrogeneous elements
	
	public static void main(String[] args) {
		 
ArrayList a=new ArrayList();
a.add(10);
a.add(20);
a.add(30);
a.add(45);
a.add(50);
a.add(20);
a.add(2.5);
a.add(new String("shruti"));
     
System.out.println("Array list is :" +a);

System.out.println("Is 30 present:" +a.contains(30));

System.out.println("Is 300 present:" +a.contains(300));

System.out.println("Index of 20 is:"+a.indexOf(20));

System.out.println("Size of array list is :"+a.size());

System.out.println("Last index of 20 is : "+a.lastIndexOf(20));

System.out.println("remove(3)"+a.remove(3));

System.out.println("array after removing"+a);

System.out.println(a.remove(Integer.valueOf(30)));

System.out.println("array after removing"+a);

//Collections.sort(a);--------throws ClassCast exception


System.out.println("array after removing"+a);

Iterator i=a.iterator();
System.out.println("----------------------------------------------");
while (i.hasNext())
	System.out.println(i.next());  

	}

}
