##  캡슐화(Encapsulation)

> 오늘 수업 듣던 중 캡슐화에 대해 조금 더 공부해 싶어 오늘의 TIL의 주제로 정했다.
>
> 이해는 했으나 실제로 어떻게 적용할 지가 궁금해서 작성해 보려고 한다.
>
> 캡슐화전에 접근권한에 대해서 알아야 이해가 가능하다.

###   캡슐화란?

 오늘 배운 것을 정리하자면, 다양하고 복잡적인 타입을 정리하고 관리하기 편하게 만드는 것이라고 배웠다.  그리고 캡슐화를 하게되면 코드에 직접적인 접근을 못하기때문에 보호도된다. 뿐만 아니라 재사용성도 올라간다. 이제 코드로 예시를 들면서 좀 더 이해하기 쉽게 해보자.



```java
package com.gd.test.bean;

public class TestBean {
	private int no; //private으로 해야 접근제한 되기에 캡슐화에 필수다.
	private String name;
	private int age;
	private String address;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getNo() { //getter는값을 가져올 때 사용하고 
		return no;
	}
	public void setNo(int no) {//setter는 값을 넣을 때 사용한다.
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
	
```

### 실행예시

```java
TestBean tb = new TestBean();
			//값을 넣올때 setter
			tb.setNo(1);
			tb.setName("권재현");
			tb.setAge(300);
			tb.setAddress("관악구");
			//값을  가져올 때 getter
System.out.println("번호 :"+tb.getNo()+ " 이름 : "+ tb.getName()+" 나이 :"+ tb.getAge()+" 주소 : "+tb.getAddress());
//출력 : 번호 :1 이름 : 권재현 나이 :300 주소 : 관악구
```

실행예시에서 보듯이 변수가 하나도 없고, 메소드만 을 활용해 출력을 완료했다.

변수에 대한 접근을 private으로 막아놨기에 접근이 불가 하다. 

그래서 캡슐화 사용 시 변수에 대해 보호가 되서 훼손염려가 없습니다.

다음 유지보수시 캡슐화 클래스 수정하면 되기때문에 유지보수도 편해집니다. 

추후에 캡슐화에 대해 더 많은 것을 느끼게되면 나도 유지 보수 하자 !!