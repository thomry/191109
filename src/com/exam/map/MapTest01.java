package com.exam.map;


import java.util.*;
import java.util.Map.Entry;


/*
 * map test
 */

public class MapTest01 {
	public static void main(String[] args) {
		
		// 1. 생성
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		/*
		 * 2. 삽입1
		 * 
		 * map는 삽입할때 put이라는 메서드를 호출합니다.
		 * put는 파라미터로 key, value를 바듭니다.
		 * put(key, value); 이러하게 코드를 사용하시면 됩니다.
		 * key와 value는 선언된 generic 타입에 맞게 주입해야합니다.
		 */
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		
		/*
		 * map은 key가 중복되지않습니다.
		 * 중복된 key를 입력할 경우, 마지막 입력된 value값으로 해당 key의 값으로 치환합니다.
		 * map은 index를 지니지않습니다. 즉, 순서가 없다는 뜻입니다.
		 * 다시말해, list처럼 중간삽입이란 개념이 존재하지 않습니다.
		 */
		map.put("three", 30);
		
		/*
		 * 3. 삭제
		 * 
		 * map은 index가 없기때문에 삭제시에는 key를 기준으로 삭제합니다.
		 */
		map.remove("three");
		
		/*
		 * 4. 찾기
		 * 
		 * map은 key또는 value기준으로 검색이 됩니다.
		 * list 계열도 안되는건 아니나 자주 사용되는 기능이 아닙니다.
		 * 결과는 true 혹은 false를 return 합니다.
		 */
		System.out.println("find 1 by key  : "+map.containsKey("one"));
		System.out.println("find 1 by value: "+map.containsValue(1));
		
		/*
		 * 5. 출력1
		 * 
		 * map은 index값이 없기때문에 값을 출력하기 위해서는 key를 알아야합니다.
		 * 때문에 map은 key 그룹을 먼저 찾고 값을 찾아야합니다.
		 * map의 key리스트는 set타입에 담겨있습니다.
		 * set는 중복을 무시하는 타입이기때문에 중복을 허용하지않는 key리스트를 담기에 적합한 타입입니다.
		 */
		Set<String> keyset = map.keySet();
		/*
		 * keyset를 루프로 돌립니다.
		 * 단 set는 list와 다르게 index가 존재하지않습니다.
		 * 다시 말해, 값을 저장할 때에 순서가 없다는 이야기이며
		 * 출력할때 index를 이용한 loop출력이 불가합니다.
		 * 그래서 내부 로직이 iterator를 사용하는 foreach문을 통하여 출력해야합니다. 혹은 직접 iterator를 이용해 출력이 가능합니다.
		 */
		for(String key: keyset)
			System.out.println(map.get(key));
		System.out.println("--------------------------------------------------------");
		
		// iterator이용
		Iterator<String> iter = keyset.iterator();
		while(iter.hasNext()) {
			String key = iter.next();
			System.out.println(map.get(key));
		}
		
		/*
		 * 6. 출력2
		 * 
		 * value를 한꺼번에 출력해보는 기능이나, 정말 자주사용하지 않는 기능입니다.
		 */
		Set<Entry<String, Integer>> entry = map.entrySet();
		//iterator사용
		Iterator<Entry<String, Integer>> iter2 = entry.iterator();
		while(iter.hasNext()) {
			Map.Entry<String, Integer> m = iter2.next();
			System.out.println("key: "+m.getKey()+", value :"+m.getValue());
		}

	}

}
