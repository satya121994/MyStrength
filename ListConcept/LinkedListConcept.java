package ListConcept;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListConcept {

	public static void main(String[] args) {
		
		
		LinkedList <String> ll = new LinkedList<String> ();
		
		//add;
		ll.add("MY BEST FRIENDS");
		ll.add("Satya");
		ll.add("Swathi");
		ll.add("SriDevi");
		ll.add("Sandhya");
		ll.add("Gupta");
		ll.add("LovaRaju");
		ll.add("Venky");
		ll.add("Sai");
		
		System.out.println("Content of LinkedList :"+ll);
		
		//addFirst :
		ll.addFirst("Nani");
		
		//addLast :
		ll.addLast("Bujji");
		
		System.out.println("Content of LinkedList :"+ll);
		
		//get
		System.out.println(ll.get(0));
		
		//set
		
		ll.set(0, "My Heroes");
		System.out.println(ll.get(0));
		
		//remove first and last element
		ll.removeFirst();
		ll.removeLast();
		
		System.out.println("Content of LinkedList :"+ll);
		
		ll.remove(8);
		
		System.out.println("Content of LinkedList :"+ll);
		
		//how to print all the values of LinkedList :
		//1. for loop
		
		System.out.println("****using for loop");
		for (int n=0;n<ll.size();n++) {
			System.out.println(ll.get(n));
		}
		
		//2.Advance for loop
		System.out.println("********using for advance for loop");
		
		for (String str :ll) {
			System.out.println(str);
		}
		
		
		//3.iterator :
		System.out.println("******using for iterator");
		
	   Iterator <String> it =	ll.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		//4.while loop :
		
		System.out.println("***********using for While loop");
		
		int num =0;
		while (ll.size()>num) {
			System.out.println(ll.get(num));
			num++;
		}
		
		
		
		
		
		
		
	}

}
