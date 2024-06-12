package com.tnsif.dayfourteen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class HomegeneousList {
 
	public static void main(String[] args) {
	ArrayList<String> nameList=new ArrayList<String>();
	nameList.add("Shruti");
	nameList.add("Rutika");
	nameList.add("Rohit");	
	nameList.add("Virat");	
	
	System.out.println("List is:"+nameList); 
	Collections.sort(nameList);
	System.out.println("List after sortting is:"+nameList);
	ArrayList<Person> personList=new ArrayList<Person>();
	personList.add(new Person ("Amol","Pune",1234568512L));
	personList.add(new Person ("Rahul","Pune",7972150680L));
	personList.add(new Person ("Amruta","Pune",123456852L));
	
	System.out.println("Person List\n "+personList);
	
	Iterator<Person> it=personList.iterator();
	while (it.hasNext()) 
	{
		Person p=it.next();
		System.out.println("Person is:"+p);
		System.out.println("---------------------------------------");
		System.out.println(personList.size());
		
        Comparator<Person> comp=(p1,p2)->p1.getName().compareTo(p2.getName());
		Collections.sort(personList,comp);
		System.out.println("-------Sorting on Ascending order------");
		System.out.println(personList);
		
		comp=(p1,p2)->(int)(p2.getContactNo()-p1.getContactNo());
		Collections.sort(personList,comp); 
		System.out.println("----sorting on ascending order of contact no.------");
		System.out.println(personList);
		  	
		
	}
	
}
	}
