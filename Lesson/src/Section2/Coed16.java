package Section2;

import java.util.Scanner;

public class Coed16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�� ���� ������ �Է����ּ���");
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
	//�޼ҵ� power�� return������ �Ѱ� �� ���� �޾Ƽ� ���� result�� ����
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
