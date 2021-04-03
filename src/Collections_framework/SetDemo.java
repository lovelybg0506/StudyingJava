package Collections_framework;

import java.util.HashSet;
import java.util.Iterator;

import sec07.exam01_promotion.E;

public class SetDemo {

	public static void main(String[] args) {
		HashSet<Integer> A = new HashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(3);
		
		HashSet<Integer> B = new HashSet<Integer>();
		B.add(3);
		B.add(4);
		B.add(5);
		
		HashSet<Integer> C = new HashSet<Integer>();
		C.add(1);
		C.add(2);
		
//		System.out.println(A.containsAll(B));	// false (A안에 B의 모든 원소가 포함되는가 ?)
//		System.out.println(A.containsAll(C));	// true
		
//		A.addAll(B); // 합집합
//		A.retainAll(B); // 교집합
//		A.removeAll(B); // A-B 차집합
		
		Iterator<E> hi = (Iterator) A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
	}
}
