package com.exam.set;

import java.util.*;

public class SetTest01 {
	public static void main(String[] args) {
		/*
		 * 1. 선언
		 */
		Set<Integer> set = new HashSet<Integer>();
		
		/*
		 * 2. 삽입
		 * 
		 * 기본적으로 index가 없어 중간삽입이 존재하지않습니다.
		 * set은 치환도 존재하지않습니다
		 */
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(4); // 중복되면 무시당합니다
		
		System.out.println("size : "+set.size());
		
		/*
		 * 3. 삭제
		 * 
		 * set은 index가 없어 삭제할시에 삭제할 값을 다이렉트로 주어야합니다.
		 */
		set.remove(1);
		set.remove(2);
		System.out.println("size : "+set.size());
		
		/*
		 * 4. 출력
		 * 
		 * set는 index가 존재하지않기때문에 기존의 for 루프로 출력이 불가능합니다.
		 * iterator이나 foreach문을 사용하여 출력이 가능합니다.
		 */
		
		Iterator<Integer> iter = set.iterator();
		
		while(iter.hasNext()) {
			int value = iter.next();
			System.out.println("value : "+value);
		}
		System.out.println("--------------------------------------------------------");
		
		for (int value : set) {
			System.out.println("value : "+value);
		}
		
		/*
		 * 5. 전체삭제
		 */
		set.clear();

	}

}
