import java.util.Scanner;

public class Code12 {

	public static void main(String[] args) {
		//�ִ밪 ���ϱ�
		Scanner sc = new Scanner(System.in);
		int max = 0;
		System.out.println("�迭��ũ��");
		int size = sc.nextInt();
		int[] num = new int[size];

		System.out.println("���ϴ� �����Է�");
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
		System.out.println("max�� ��:" + max);
	}

}
