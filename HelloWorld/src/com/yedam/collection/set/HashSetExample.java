package com.yedam.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<Member> memSet= new HashSet<>();
//		Member mem= new Member("1",1);
//		
//		Member mem1= new Member("Hello1",1);
//		System.out.println(mem.hashCode()+"  "+mem1.hashCode());
//		
		
		
		
		memSet.add(new Member("홍길동", 30));
		memSet.add(new Member("홍길동", 30));
		System.out.println("객체수"+ memSet.size());
		for(Member m: memSet) {
			System.out.println(m.name+"/"+m.age);
		}
		
		
		
		
		
//		Set<String> set = new HashSet<String>();
//		set.add("Hello");
//		set.add("World");
//		set.add("Nice");
//		set.add("java");
//		set.add("World");
//		System.out.println(set.size());
//
//		Iterator<String> iter = set.iterator();
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//		}
//		System.out.println("반복자 소진 후");
//		iter=set.iterator();
//		while (iter.hasNext()) {
//			System.out.println(iter.next());
//			
//			
//		
//
//	}
//		System.out.println("확장 for");
//		for(String str:set) {
//			System.out.println(str);
//		}
//		

}
}