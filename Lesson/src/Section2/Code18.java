package Section2;

import java.util.Scanner;

public class Code18 {
	// 나는 내림 차순
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //  배열 크기설정;
		int[] data =new int[n];
		for(int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		
		bubbleSort(data, n);
			System.out.println("Sorted data");
			for(int k : data) {
				System.out.println(k);
		//기본타입의 매개변수는 호출된 메서드에서 값을 변경하더라도 호출한쪽에 영향을 주지 못한다.
		 //값에 의한 호출이기 때문이다.
		}
	}
	 static void bubbleSort(int[] data, int n) {
		for(int i = n-1 ; i > 0 ; i--) {
			for(int j = 0 ; j < i; j++) {
				if(data[i]> data[j]) {
					int tmp = data[i];
					data[i] = data[j] ;
					data[j] = tmp;
					}
				}
			}
		}
	
}