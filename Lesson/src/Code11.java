import java.util.Scanner;

public class Code11 {

	public static void main(String[] args) {
			//중복된 정수 구하기
		Scanner sc = new Scanner(System.in);
		System.out.println("배열의 크기정하기");
		int cnt = 0;
		int size=sc.nextInt();
		int[] num=new int[size];
		
		System.out.println("원하는 숫자 입력");
		for(int i = 0; i<size; i++) {
			num[i]=sc.nextInt();
		}
		for(int j = 0; j < size-1; j++) {
			for(int k = j+1; k < size; k++) {
					if(num[j]==num[k]) {
						cnt++;
					}
				}
				System.out.println("중복된 정수 개수 :"+cnt);
				for(int n : num) {
					System.out.println(n);
				
			}
		}
		
	
	}

}
