package Section2;

import java.util.Scanner;

public class Coed16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("두 개의 정수를 입력해주세요");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
	//메소드 power가 return문으로 넘겨 준 값을 받아서 변수 result에 저장
		int result=power(a,b);
		System.out.println("The result is :"+result);
		sc.close();
	}
	
	static int power(int n, int m) {
		int result = 1;
		for(int i = 0; i<m; i++	) {
			result*=n;
		}
		return result;
	}
	
}
