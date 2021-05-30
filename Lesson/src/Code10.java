
public class Code10 {

	public static void main(String[] args) {
	// 1 ~ 100 사이의 소수구하기
		int cnt  = 0;
		int sum = 0;
		for(int i = 1 ; i <= 1000; i++) {
			for(int j = 1; j<= i; j++) {
				if(i%j==0) {
					cnt++;
				}
			}
			if(cnt==2) {
				System.out.println("소수 : "+i);
				 sum+=i;
			}
			cnt = 0;
		}
		System.out.println("sum의 값 :"+sum);
	}

}
