import java.util.Scanner;

public class Code15 {

	public static void main(String[] args) {
		// 사용자가 입력하는 정수 마다 오름차순
		Scanner sc = new Scanner(System.in);
		System.out.println("크기결정");
		int size=sc.nextInt();
		int[] data=new int[size];
		
		for(int i =0; i<size; i++) {
			System.out.println("숫자 입력");
			int tmp=sc.nextInt();
			for(int j =i-1; data[j]>tmp && j>=0; j--) {
				data[j+1]=data[j];
				
			}
		}
		
		for(int n : data) {
			System.out.println(n);
		}
	}

}
