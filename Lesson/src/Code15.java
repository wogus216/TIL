import java.util.Scanner;

public class Code15 {

	public static void main(String[] args) {
		// ����ڰ� �Է��ϴ� ���� ���� ��������
		Scanner sc = new Scanner(System.in);
		System.out.println("ũ�����");
		int size=sc.nextInt();
		int[] data=new int[size];
		
		for(int i =0; i<size; i++) {
			System.out.println("���� �Է�");
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
