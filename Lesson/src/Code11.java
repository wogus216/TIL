import java.util.Scanner;

public class Code11 {

	public static void main(String[] args) {
			//�ߺ��� ���� ���ϱ�
		Scanner sc = new Scanner(System.in);
		System.out.println("�迭�� ũ�����ϱ�");
		int cnt = 0;
		int size=sc.nextInt();
		int[] num=new int[size];
		
		System.out.println("���ϴ� ���� �Է�");
		for(int i = 0; i<size; i++) {
			num[i]=sc.nextInt();
		}
		for(int j = 0; j < size-1; j++) {
			for(int k = j+1; k < size; k++) {
					if(num[j]==num[k]) {
						cnt++;
					}
				}
				System.out.println("�ߺ��� ���� ���� :"+cnt);
				for(int n : num) {
					System.out.println(n);
				
			}
		}
		
	
	}

}
