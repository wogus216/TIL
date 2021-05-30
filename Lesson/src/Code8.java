import java.util.Scanner;

public class Code8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int sum = 0;
		int max = 0;
		System.out.println("배열칸수정하기");
		int input =sc.nextInt();
		int[]num=new int[input];
		
		System.out.println("원하는 숫자를 입력해주세용");
		
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
		System.out.println("숫자들의 합 : "+sum);
		System.out.println("가장 큰 숫자 : "+max);
		
	}

}
