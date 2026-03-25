package com.cc.arrayList;

import java.util.ArrayList;

public class CollectionMethodsDemo {
	
	public static void main(String[] args) {

		ArrayList old = new ArrayList<>();
		old.add(111);
		old.add(222);
		old.add(333);
		System.out.println("Old : " + old);
		
		ArrayList old1 = new ArrayList<>();
		old1.add(444);
		old1.add(555);
		old1.add(666);
		System.out.println("Old1 : " + old1);
		
		
		ArrayList list = new ArrayList<>();
		
//		add ===> boolean add(Object o);
		list.add(2125);
		list.add("M");
		list.add(true);
		list.add('A');
		list.add(28.18);
		System.out.println("List : " + list);
		
//		addAll ===> boolean addAll(Collection <? extends E > c);
		list.addAll(old);
		System.out.println("After Adding old collection : " + list);
		
//		remove ===> boolean remove(Object o);
		list.remove(true);
		System.out.println("After removing one object : " + list);
		
//		removeAll ===> boolean removeAll(Collection <?> c);
		list.removeAll(old);
		System.out.println("After removing old Collection : " + list);
		
//		contains ===> boolean contains(Obeject o);
		System.out.println( "checking if the ELement is present or not : "+ list.contains(28.18));
		
//		containsAll ===> boolean containsAll(Collection <?> c);
		System.out.println( "checking if the Collection is present or not : "+ list.containsAll(old));
		
//		retainAll ===> boolean retainAll(Collection <?> c);
		old.addAll(old1);
		old.addAll(list);
		System.out.println(old);
		old.retainAll(list);
		System.out.println("after deleting all Objects except passed in retainAll method : " + old);
		
//		Emprty ===> boolean isEmpty();
		System.out.println("is Collection is empty " +  list.isEmpty());
		
//		size ===> int size();
		System.out.println("return size : " + list.size());
		
//		clear ===> void clear();
		old.clear();
		System.out.println("Old Object After clearing all : "+ old);
		
//		to Object array ===> Object[] toArray();
//		iteration ===> Iterator<E> iterator();
	
	}

}



/*
Old : [111, 222, 333]
Old1 : [444, 555, 666]
List : [2125, M, true, A, 28.18]
After Adding old collection : [2125, M, true, A, 28.18, 111, 222, 333]
After removing one object : [2125, M, A, 28.18, 111, 222, 333]
After removing old Collection : [2125, M, A, 28.18]
checking if the ELement is present or not : true
checking if the Collection is present or not : false
[111, 222, 333, 444, 555, 666, 2125, M, A, 28.18]
after deleting all Objects except passed in retainAll method : [2125, M, A, 28.18]
is Collection is empty false
return size : 4
Old Object After clearing all : []
*/