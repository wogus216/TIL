#   Collections 객체 설명

> 금요일 수업에서 켈랙션 수업을 들었는데, 솔직히 들을 때 내용이 잘 와닿지 않아서 주말동안 다시 공부하면서 정리해봐야겠다고 생각에 영상과 서칭을 통해 최대한 간단하게 정리 했다.
>
> 디테일적인 요소는 조금 더 공부하면서 추가 해야 할 것 같다.



## List

* 순서가 있는 데이터 집합
* 가변크기 조절이 가능함

####  코드예시

```java
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(3);

		Iterator hi = (Iterator) A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
	//출력 : 1 2 2 2 3
	
	}
}

```

###  Set (수학에서 집합)

* 중복제거 필요한 데이터

 **벤다이어그램을 생각하자**

```java
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
		
		System.out.println(A.containsAll(B));//false 
		// B는 A의 부분집합이 아니다.
		System.out.println(A.containsAll(C)); // true	
		// C는 A의 부분집합니다.
//		A.addAll(B);
		//A와 B를 합쳐 A로 만든다. 합집합
//		A.retainAll(B); 
		// A와 B 공통으로 갖고있는 값만 A에 담는다. 교집합
		A.removeAll(B);
		// A집합이 갖고있는 값 중  B에 있으면 제거한다. 차집합
		
		Iterator hi = (Iterator) A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
       
        //중복 검사
        
        public static void main(String[] args) {
		hashSet<Integer> A = new hashSet<Integer>();
		A.add(1);
		A.add(2);
		A.add(2);
		A.add(2);
		A.add(3);

		Iterator hi = (Iterator) A.iterator();
		while(hi.hasNext()) {
			System.out.println(hi.next());
		}
	//출력 : 1  2 3  보시다시피 중복허용이 안된다.
	
	}
}
		
	}
}

```

##  Set  과 List의 차이점

* Set은 값의 중복허용이 안되고 List는 값의 중복이 가능하다.

* List는 입력 한 값의 모든 값을 저장(순차적으로 저장된다.)

* Set은 저장되는 고유한 각각의 값만 저장한다.(순차적으로 보장 안된다.)

###  iterator 

* hasNext : 다음 값이존재하는 지 확인
* next: 다음 값을 가져온다.

List 와 Set 둘 사용 가능하다.

###  Map

* Key , value  이루어짐
  * Key는 중복을 허용하지 않고, Value는 중복허용한다.

```java
	//속성과 값으로 구분 된 데이터 집합
	Map<String, Object> map = new HashMap<>();
	map.put("id", 3);
	map.put("title", "Hello");
	map.put("hit", 12);
	
	System.out.println(map.get("title"));
	
	}
}
```
