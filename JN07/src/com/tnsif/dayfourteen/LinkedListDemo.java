package com.tnsif.dayfourteen;
import java.util.LinkedList;
import java.util.ListIterator;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList<String> cityList = new LinkedList<String>();
		cityList.add("nashik");
		cityList.add("pune");
		cityList.add("mumbai");
		System.out.println(cityList);
		System.out.println("------------------------------------------");
        cityList.add(2,"delhi");
        System.out.println(cityList);
        System.out.println("------------------------------------------");
        cityList.addFirst("hydrabad");
        cityList.addLast("chennai");
        System.out.println(cityList);
        System.out.println("------------------------------------------");
        System.out.println("First City:"+cityList.getFirst());
        System.out.println("Last City:"+cityList.getLast());
        System.out.println("City at position 2 is:"+cityList.get(2));
        System.out.println(cityList);
        System.out.println("Remove city at 2 position:"+cityList.remove(2));
        System.out.println(cityList);
        System.out.println("Mumbai city removed?:"+cityList.remove("mumbai"));
        System.out.println("Bangalore city removed?:"+cityList.remove("bangalore"));
        System.out.println("Remove first cty:"+cityList.removeFirst());
        System.out.println("Remove Last City:"+cityList.removeLast());
        System.out.println(cityList);
        //cityList.clear();
        System.out.println("-----------------------------------------");
        System.out.println(cityList);
        System.out.println("Remove first cty:"+cityList.removeFirst());
        System.out.println("Size:"+cityList.size());
        
        cityList.add("Mumbai");
		cityList.add("Delhi");
		cityList.add("Nagpur");
		cityList.add("Ahmdabad");
		cityList.add("Nashik");
		cityList.add("Pune");
		cityList.add("Bangalore");
		cityList.add("Hydrabad");
		cityList.add("Chennai");
		
		System.out.println("-----------------------------------------");
		System.out.println(cityList);
		System.out.println("Size:"+cityList.size());
		ListIterator<String> lit=cityList.listIterator();
		while(lit.hasNext())
			System.out.println(lit.next().toUpperCase());
		lit=cityList.listIterator();
		while(lit.hasNext())
		{
			String city=lit.next();
			if (city.equals("Delhi"))
				lit.remove();
			if (city.equals("Nashik"))
				lit.set("Nashik");
			if(city.equals("Nagpur"))
				lit.add("Jaipur");
		}
		System.out.println(cityList);	
		System.out.println("-----------------------------------------");
		lit=cityList.listIterator(cityList.size());
		while (lit.hasPrevious())
		{
			System.out.println(lit.previous());	
		}
		System.out.println("-----------------------------------------");
        
	}

}
