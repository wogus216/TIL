import java.util.Scanner;

public class Code9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭ĭ������");
		int input =sc.nextInt();
		int[]n = new int[input];
		for(int i = 0; i<input; i++) {
			System.out.println("�迭 �ȿ� ��ȣ����");
			n[i]= sc.nextInt();
		}
		
		for(int i = 0; i < n.length; i++) {
			System.out.println("n����Ʈ");
			System.out.println(n[i]);
		}
		int[] n2 = new int[input];
		
		n2[0]= n[n.length-1];
		for(int j = 1; j<n2.length; j++) {
			n2[j] =n[j-1]; 
		}
		for(int i = 0; i<n2.length; i++) {
			System.out.println("n2 ����Ʈ");
			System.out.println(n2[i]);
		}
	}
}
