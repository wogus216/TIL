# Scanner 사용 시 next와 nextLine의 차이점!!  
>  자바프로그래머스 구구단 실습 중 차이점이 너무 궁금해서 실습 과제해결하고 찾아봤다.  
찾아보니 다행히 차이점이 명확해 이해가 쉬웠다.  


### 이제 진짜 본론으로 들어 가보자

* 백문이 불여일견 바로 코드로 설명 들어갑니다~~

```java
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
	System.out.println("이름을 입력해주세호");
		Scanner sc=new Scanner(System.in);
		String next=sc.next();
		System.out.println(next);
		/*next의 경우 
		 *입력: 권재현 출력: 권재현
		 *
		 *입력: 권재현(공백)권재현 출력: 권재현
		 *
		 *입력: 권재현권재현 출력: 권재현권재현
		*/
	}

}
```

위에 주석을 보면 next는 **공백값**을 포함하지 못한다는 걸을 발견할 수 있다  
그래서 공백을 포함 할 수 있는 nextLine를 사용하는 것이다.

```java

import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		System.out.println("이름을 입력해주세호");
		Scanner sc=new Scanner(System.in);
		String nextLine=sc.nextLine();
		System.out.println(nextLine);
		
		/*nextLine의 경우 
		 *입력: 권재현 출력: 권재현
		 *
		 *입력: 권재현(공백)권재현 출력: 권재현(공백)권재현
		 *
		 *입력: 권재현권재현 출력: 권재현권재현
		*/
	}
}
```
차이점을 분명하게 두번째 입력에서 바로 확인 할 수 있다.
**하지만** 주의해야 점이 있다. 
```java
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		System.out.println("이름을 입력해주세호");
		Scanner sc=new Scanner(System.in);
		String next=sc.next();
		String nextLine=sc.nextLine();
		System.out.println(next);
		System.out.println(nextLine);
    /*
		 * 입력: 권재현Enter 출력:권재현
		 */
	}
}
```
next와 nextLine을 연속해서 입력을 넣을때  '권재현'을 입력 후 Enter를 치면 권재현만 출력이된다. 

왜냐하면 nextLine은 공백을 값으로 받는다.

그래서Enter을 누르는 순간 공백을 값으로 받기 때문에 출력이 끝나는것이다.  

 nextLine 사용 시 연속해서 값을 입력해야 한다면 주의해서 사용해야 한다.
