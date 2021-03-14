# 오늘은 split이다.

**split도 역시 자바플레이 그라운드 구구단과 계산기 실습 중 궁금해진 함수다.


검색결과 split은 String를 사용 시 빈번하게 사용하는 함수였다.   
내가 발견한 것은 split을 사용하면,  입력한 문자열을 기준으로 Arrays를 만들어 주는게 너무도 신기했다.  
서두가 길었다.     
바로 코드를 설명으로 들어가자!!

```java
public class Gugudan2 {
	
	static Scanner sc= new Scanner(System.in);
	static String inputValue = sc.nextLine();
	static String[] splitedValue=inputValue.split(",");
	static int first= Integer.parseInt(splitedValue[0]);
	static int second= Integer.parseInt(splitedValue[1]);
	static int third= Integer.parseInt(splitedValue[2]);
      
      /* 입력: 5,5,5,5
       * 결과: [5, 5, 5, 5]
       */
}
```
결과 값을 통해 내가 지정한 split()에 있는 쉼표를 기준으로 배열이 만들어진것을 확인 할 수있다.   
알아서 배열 공간과 순서도 착착해주니 아주 좋은 무기가 될 것은 느낌이다.    
공부해서 찾아 보니, 기능이 한가지 더 존재 했고,    
바로 *배열 크기를 정할 수 있는 기능*이다. 바로 코드 설명으로 들어간다.

```java
public class Practice {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름을 입력해주세요");
		String name=sc.nextLine();
		String[] names=name.split(",",2);
		System.out.println("이름 : "+names[0]);
		System.out.println("이름 : "+names[1]);
		
        /*
      이름을 입력해주세요
      티어니,오바메양,레노,로우
       이름 : 티어니
      이름 : 오바메양,레노,로우
      */
	}
}
```
내가 *name.split(",",2);* 이렇게 쉼표옆에 2를 입력했고 이뜻은 배열 크기 2란 뜻이다.  
결과 값을 확인 하면 나는 4개의 이름을 입력했고 공간이 2개 뿐이라서,        
결과는 티어니와 오바메양,레노,로우 이렇게 나눠진 것을 확인 할 수 있다.


## 내일부터 국비학원 시작인데 불태우자!!!
