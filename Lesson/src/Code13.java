import java.util.Scanner;

public class Code13 {

	public static void main(String[] args) {
		// �ִ�Ҽ� ���ϱ�
		Scanner sc = new Scanner(System.in);
		int max = 0;
		int cnt = 0;
		String sosu = "0";
		System.out.println("�迭 ��ũ��");
		int size = sc.nextInt();
		String[] num = new String[size];
		System.out.println("�����Է�");
		for (int i = 0; i < size; i++) {
			num[i] = sc.next();
		}
		max = Integer.parseInt(num[0]);
		for (int j = 0; j < size - 1; j++) {
			sosu = num[j];
			for (int k = j + 1; k < size; k++) {
				sosu += num[k];
				System.out.println("�Ҽ�" + sosu);

				for (int i = 1; i <= Integer.parseInt(sosu); i++) {
					if (Integer.parseInt(sosu) % i == 0) {
						cnt++;
						System.out.println("cnt��" + cnt);
					}
				}
				if (cnt == 2) {
					if (max < Integer.parseInt(sosu)) {
						max = Integer.parseInt(sosu);
					}
				}
				cnt = 0;
			}
		}	
		System.out.println("max�� : " + max);
		for(String n : num) {
			System.out.println(n);
		}

	}

}
