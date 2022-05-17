package ListConcept;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E>void main(String[] args) {
		
		//ArrayList is a dynamic array
		//static array size is fixed
		//In Array List there is a no problem with the size automatically the moment you add the values automatically size will be increased
		
		int a[] = new int [3];
		
		//dynamic ar = new ArrayList ();
		//1.can contain duplicate values /elements 
		//2.maintains insertion order
		//3.synchronized
		//4.allow you random access to fetch the element because it stores the value on the basics of indexes
		
		ArrayList ar = new ArrayList ();
		ar.add(10);
		ar.add(20);
		ar.add(30);
		
		System.out.println(ar.size());
		
		ar.add(40);
		ar.add(50);
		ar.add(50);
		
		ar.add("test");
		ar.add(12.33);
		ar.add(100);
		ar.add(true);
		
		System.out.println(ar.size());
		System.out.println(ar.get(4));
		
		//to print all the values we use 
		//1.for loop
		//2.iterator
		
		for (int i =0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		ArrayList<Integer> ar1 = new ArrayList<Integer> ();
		ar1.add(100);
		
		
		ArrayList<String> ar2 = new ArrayList<String> ();
		ar2.add("Test");
		ar2.add("Selenium");
		
		ArrayList<E> ar3 = new ArrayList<E> ();
		
		
		//Employee Class object ;
		Employee e1 = new Employee ("Satya",27,"QA");
		Employee e2 = new Employee ("Nani",28,"Dev");
		Employee e3 = new Employee ("Narayana",29,"Admine");
		
		
		//create ArrayList 
		
		ArrayList<Employee> ar4 = new ArrayList<Employee> ();
		ar4.add(e1);
		ar4.add(e2);
		ar4.add(e3);
		
		//iterator to traverse value
		
		Iterator<Employee> it = ar4 .iterator ();
		
		while  (it.hasNext()) {
			Employee emp = it.next();
			
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
			
		}
		
		System.out.println("*************");
		
		//addAll
		
		ArrayList<String> ar5 = new ArrayList<String> ();
		ar5.add("Satya");
		ar5.add("Test");
		ar5.add("Admine");
		
		
		ArrayList<String> ar6 = new ArrayList<String> ();
		ar6.add("Dev");
		ar6.add("Java");
		ar6.add("JavaScript");
		
		ar5.addAll(ar6);
		
		for (int i =0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		
		//removeAll
		
		ar5.removeAll(ar6);
		
		for (int i =0;i<ar5.size();i++) {
			System.out.println(ar5.get(i));
		}
		
		
		
		//retainAll
		
		ArrayList<String> ar7 = new ArrayList<String> ();
		ar7.add("Test");
		ar7.add("Nani");
		ar7.add("QTP");
		
		ArrayList<String> ar8 = new ArrayList<String> ();
		ar8.add("Test");
		ar8.add("Selenium");
		
		ar7.retainAll(ar8);
		
		for (int i =0;i<ar7.size();i++)
		{
			System.out.println(ar7.get(i));
		}
		

		
		
	}

}
