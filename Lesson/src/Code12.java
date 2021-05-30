import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {
		//최대값 구하기
		Scanner sc = new Scanner(System.in);
		int max = 0;
		System.out.println("배열의크기");
		int size = sc.nextInt();
		int[] num = new int[size];

		System.out.println("원하는 숫자입력");
		for (int i = 0; i < size; i++) {
			num[i] = sc.nextInt();
		}
		for (int n : num) {
			System.out.println(n);
		}
		int sum = 0;
		for (int j = 0; j < size - 1; j++) {
			sum = num[j];
			for (int k = j + 1; k < size; k++) {
				sum += num[k];
				if (max < sum) {
					max = sum;
				}
			}
		}
		System.out.println("max의 값:" + max);
	}

}
