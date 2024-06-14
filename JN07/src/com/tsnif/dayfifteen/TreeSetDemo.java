package com.tsnif.dayfifteen;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> courseSet = new TreeSet<String>(); 
		
		courseSet.add("Java");
		courseSet.add("C++");
		courseSet.add("Python");
		courseSet.add("C");
		courseSet.add("React");
		courseSet.add("Angular");
		
	 System.out.println(courseSet);
	 
	 System.out.println("First Course:"+courseSet.first());
	 System.out.println("Last Course:"+courseSet.last());
	 
	 courseSet.remove("C");//remove course "c" if present
	 
	 System.out.println(courseSet);
	 
	 courseSet.pollFirst();//remove first element
	 System.out.println(courseSet);
	 
	 courseSet.pollLast();//remove last element
	 System.out.println(courseSet);
		 
	 
	 System.out.println("\n *************************************************");
     
	 Comparator<Employee> comp=(e1,e2)->(int)(e1.getSalary()-e2.getSalary());
	 
	 TreeSet<Employee> empSet=new TreeSet<Employee>(comp);
	 empSet.add(new Employee (101,"Prathmesh",73000));
	 empSet.add(new Employee (102,"Sharad",62000));
	 empSet.add(new Employee (103,"Ram",81000));
	 empSet.add(new Employee (104,"Ankita",78000));
	 empSet.add(new Employee (105,"Nandini",63000));
	 
	 System.out.println("Employee Details:\n"+empSet);
	 
	 
	 
	}

}
