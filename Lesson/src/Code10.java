
public class Code10 {

	public static void main(String[] args) {
	// 1 ~ 100 ������ �Ҽ����ϱ�
		int cnt  = 0;
		int sum = 0;
		for(int i = 1 ; i <= 1000; i++) {
			for(int j = 1; j<= i; j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt==2) {
				System.out.println("�Ҽ� : "+i);
				 sum+=i;
			}
			cnt = 0;
		}
		System.out.println("sum�� �� :"+sum);
	}

}
