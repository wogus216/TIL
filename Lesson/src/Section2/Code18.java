package Section2;

import java.util.Scanner;

public class Code18 {
	// ���� ���� ����
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //  �迭 ũ�⼳��;
		int[] data =new int[n];
		for(int i = 0; i < n; i++) {
			data[i] = sc.nextInt();
		}
		sc.close();
		
		bubbleSort(data, n);
			System.out.println("Sorted data");
			for(int k : data) {
				System.out.println(k);
		//�⺻Ÿ���� �Ű������� ȣ��� �޼��忡�� ���� �����ϴ��� ȣ�����ʿ� ������ ���� ���Ѵ�.
		 //���� ���� ȣ���̱� �����̴�.
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