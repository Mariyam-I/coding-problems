package com.cc.arrayList;

import java.util.ArrayList;

public class ArrayListMethodsDemo{
	
	public static void main(String[] args) {
		ArrayList oldList = new ArrayList<>();
		
		oldList.add(18);
		oldList.add("Mariyam");
		oldList.add('M');
		oldList.add(true);
		System.out.println("Old List : " + oldList);
		ArrayList list1 = new ArrayList<>();
		
		//add ===> void add(int index, Object o);
		list1.add(0, 28);
		list1.add(1, "A");
		list1.add(2, 49);
		list1.add(3, false);
		list1.add(4, "A");
		list1.add(5, 96.78);
		System.out.println("New list : " + list1);
		
		//addAll ===> boolean addAll(int index, Collection<? extends E>c);
		list1.addAll(2, oldList);
		System.out.println(list1);
		
		//remove ===> E remove(int index);
		list1.remove(4);
		System.out.println(list1);
		
		//get element at the given index ===> E get(int index);
		System.out.println(list1.get(3));
		
		//change the data at given inde ===> E set(int index, Object o);
		System.out.println(list1.set(1, 'M'));
		System.out.println(list1);
		
		//return the index of that element ===> int indexOf(Object o);
		System.out.println(list1.indexOf(false));
		
		//return index from last  ===> int lastIndexOf(Object o);
		System.out.println(list1.lastIndexOf("A"));
		
		//Iteretor<E> iterator();
		
 	}
}


/*
Old List : [18, Mariyam, M, true]
New list : [28, A, 49, false, A, 96.78]
[28, A, 18, Mariyam, M, true, 49, false, A, 96.78]
[28, A, 18, Mariyam, true, 49, false, A, 96.78]
Mariyam
A
[28, M, 18, Mariyam, true, 49, false, A, 96.78]
6
7
*/