package com.yedam.collection.tree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Fruits {
	String name;
	int price;

	public Fruits(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

}

class ComparatorClas implements Comparator<Fruits> {

	@Override
	public int compare(Fruits o1, Fruits o2) {
		if (o1.price > o2.price)
			return 1;
		else if (o1.price == o2.price)
			return 0;
		else
			return -1;
	}

}

public class ComparatorExample {
	public static void main(String[] args) {
		TreeSet<Fruits> tSet = new TreeSet<Fruits>(new ComparatorClas());
		tSet=new TreeSet<>(a, b)-> {
				if (a.price > b.price)
					return -1;
				else if (a.price == b.price)
					return 0;
				else
					return -1;};
		
		
		
		
		tSet.add(new Fruits("aaa", 30));
		tSet.add(new Fruits("bbb", 25));
		tSet.add(new Fruits("cc", 35));
		tSet.add(new Fruits("dddd", 50));

		Iterator<Fruits> iter = tSet.iterator();

		while (iter.hasNext()) {
			Fruits f = iter.next();
			System.out.println(f.name + ":" + f.price);
		}
		TreeSet<Fruits> tSet = t->t.compare();
		tSet.add(new Fruits("aaa", 30));
		tSet.add(new Fruits("bbb", 25));
		tSet.add(new Fruits("cc", 35));
		tSet.add(new Fruits("dddd", 50));

	}

}
