package com.cc.tree;

import java.util.TreeSet;

public class DemoTreeSet {

	public static void main(String[] args) {

		/*TreeSet<Integer> Tset = new TreeSet<>();  // Default Natural Sorting Order (Comparable)
		
		Tset.add(10);
		Tset.add(0);
		Tset.add(5);
		Tset.add(20);
		Tset.add(15);
		Tset.add(0);
		Tset.add(25);
		Tset.add(7);
		
		System.out.println(Tset);
		
		
//		[0, 5, 7, 10, 15, 20, 25]     OutPut
		*/
		
/*		
		//1 -> Customized sorting order using comparator  (In Ascending Order)
		TreeSet<Integer> Tset = new TreeSet<>(new AscendingNumSorting());
		
		Tset.add(10);
		Tset.add(0);
		Tset.add(5);
		Tset.add(20);
		Tset.add(15);
		Tset.add(0);
		Tset.add(25);
		Tset.add(7);
		
		System.out.println(Tset);
		
		
//		[0, 5, 7, 10, 15, 20, 25]   OutPut   -> Natural logic
//		[0, 5, 7, 10, 15, 20, 25]   OutPut   -> customized logic

		*/
		
			
/*		
		//2 - > Customized sorting order using comparator ( Descending order)
		TreeSet<Integer> Tset = new TreeSet<>(new DescendingNumSorting());
		
		Tset.add(10);
		Tset.add(0);
		Tset.add(5);
		Tset.add(20);
		Tset.add(15);
		Tset.add(0);
		Tset.add(25);
		Tset.add(7);
		
		System.out.println(Tset);
		
		
//		[25, 20, 15, 10, 7, 5, 0]   OutPut  -> changing only the sign
//		[25, 20, 15, 10, 7, 5, 0]   OutPut  -> changing conditions

		*/	
		
		
		//3. -> Customized sorting order using comparator  (For Alphabets)
		TreeSet<String> Tset = new TreeSet<>(new AlphabetOrderSorting());
		
		Tset.add("Mariyam");
		Tset.add("Nikhat");
		Tset.add("Sanawar");
		Tset.add("Anam");
		Tset.add("Zoha");
		Tset.add("Riya");
		Tset.add("Barkha");
		Tset.add("Kubra");
		Tset.add("Qurrat");
		
		System.out.println(Tset);
		
//		[Anam, Barkha, Kubra, Mariyam, Nikhat, Qurrat, Riya, Sanawar, Zoha]		-> Ascending order
//		[Zoha, Sanawar, Riya, Qurrat, Nikhat, Mariyam, Kubra, Barkha, Anam]		-> Descendong order 	

	}

}
