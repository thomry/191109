package com.exam.list;

import java.util.*;

/*
 * ArrayList ㅇㅔ재
 * @author PC
 */

public class ListTest01 {
	public static void main(String[] args) {
		
		
		// 1. 선언
		List<Integer> list = new ArrayList<Integer>();
		
		/*
		 * 배열을 만들자마자 공간을 만들어줘야하기때문에,
		 * 모든 공간이 숫자타입일 경우 0으로 세팅된다.
		 * 하지만 list는 삽입할때마다 공간과 값을 넣기때문에
		 * 처음생성될때에는 size 자체가 0입니다.
		 * 즉, 초기화하는 것이 없다는 말입니다.
		 * 배열은 길이를 출력할때 array.length 라고 값을 가져오나,
		 * list는 list.size()라고 메서드 호출을 통해 가져온다.
		 */
		
		System.out.println("생성될 때 사이즈: "+list.size());
		
		// 2. list에 삽입1
		for(int i = 1; i <= 10; i++) {
			// list는 add라는 메서드를 통해서 값을 세팅합니다.
			list.add(i);
		}
		
		System.out.println("값을 넣은 후 사이즈: "+list.size());
		
		/*
		 * 3.
		 * 삽입2 --> 중간 삽입
		 * 만약 1~10까지 사이즈가 있는 list에서
		 * 4번째의 자리에 값을 중간 삽입하고 싶으면 인덱스가 0부터 시작하므로
		 * list.add(3, 12); 하면 4번째 자리에 중간삽입이되며
		 * 원래 4번째 자리에 있던 값은 뒤로 밀립니다.
		 */
		
		list.add(3,12);
		System.out.println("값을 새로 넣은 후 사이즈: "+list.size());
		
		/*
		 * 4. 치환
		 * 값의 치환은 set라는 메서드를 통해서 치환됩니다.
		 * 파라미터는 (index, value)가 들어갑니다.
		 * 해당 index에 위치하는 값을 입력된 value 값으로 변경해줍니다.
		 */
		list.set(3, 20);
		System.out.println("값을 치환한 후 사이즈: "+list.size());
		
		/*
		 * 5. 부분삭제
		 * 부분삭제는 remove라는 메서드를 사용합니다.
		 * 파라미터로 (index)를 받아 해당 위치에 있는 값을 지웁니다.
		 * 여기서 배열하고 차이점이 발생합니다.
		 * 배열은 해당 인덱스에 있는 값을 삭제하지만 길이는 변하지 않습니다. 즉, 배열은 값만 삭제한다는 뜻입니다.
		 * 그러나 list는 값과함께 해당 공간이 삭제되므로 사이즈가 줄어듭니다.
		 */
		list.remove(3);
		System.out.println("값을 부분삭제 후 사이즈: "+list.size());
		
		// 6. 전체삭제
		// list.clear(); // 출력을 연습하기위해 주석처리합니다.
		System.out.println("값을 모두삭제 후 사이즈: "+list.size());
		
		
		// ------------------------------------출력--------------------------------------------------
		/*
		 * 1. for문
		 * 출력은 get이라는 메서드를 이용합니다.
		 * 파라미터는 index를 받습니다.
		 * 즉, get(index);
		 */
		for (int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println("--------------------------------------------------------");
		
		/*
		 * 2. foreach 사용 - jdk 1.5부터 사용가능합니다.
		 * index가 필요없이 단순출력하는 경우는 foreach가 용의합니다.
		 */
		for (int num :list)
			System.out.println(num);
		System.out.println("--------------------------------------------------------");
		
		/*
		 * 3. iterator
		 * collections 계열들은 iterator라는 기능이 존재합니다.
		 * 이는 데이터를 출력하기 위해서 사용되는 기능인데, 화살표와 같다고 생각해도 괜찮습니다.
		 * 해당위치에 출력가능한 것이 있는지 확인한 뒤, 값이 존재하면 출력하고 없으면 종료가 됩니다.
		 */
		int num = 0;
		Iterator<Integer> iter= list.iterator();
		while(iter.hasNext()) {
			/*
			 * hasNext()는 값이 있는지 없는지를 검사하고 값이 존재하면 true, 없으면 false를 반환합니다.
			 * next()는 현재 위치하는 값을 return하고 커서(iter)를 다음 위치로 이동시킵니다.
			 */
			num = iter.next(); // 변수 만들어 두시는 편이 좋습니다.
			System.out.println(num);
		}
		System.out.println("--------------------------------------------------------");
		
		/*
		 * 4. 
		 * list를 array로 변경하여 array.toString()을 이용하여 출력
		 * 잘 사용되는 방법은 아닙니다.
		 * toArray() 메서드를 이용하면 list가 쉽게 배열로 변경됩니다.
		 * ArrayList 내부구조가 배열로 되어있기때문에 치환이 쉽기때문에 가능한 일입니다.
		 */
		System.out.println(Arrays.deepToString(list.toArray()));

	}

}
