import java.util.Scanner;

public class Code8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum = 0;
		int max = 0;
		System.out.println("�迭ĭ�����ϱ�");
		int input =sc.nextInt();
		int[]num=new int[input];
		
		System.out.println("���ϴ� ���ڸ� �Է����ּ���");
		
		for(int i = 0; i<num.length; i++) {
			num[i]=sc.nextInt();
			sum += num[i];
			
		}
			max = num[0];
			for(int i = 1; i<num.length; i++) {
				if(max<num[i]) {
					max=num[i];
				}
			}
		System.out.println("���ڵ��� �� : "+sum);
		System.out.println("���� ū ���� : "+max);
		
	}

}
