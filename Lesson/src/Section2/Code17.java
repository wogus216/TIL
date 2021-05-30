package Section2;

public class Code17 {

	static int cnt = 0;
	public static void main(String[] args) {
		//1 ~ 100000 사이의 소수를 찾아 출력한다.
		/*
		 * for( int i = 2; i <=100; i++) { for(int j = 1; j <= i; j++) { if(i%j==0) {
		 * cnt++; } } if(cnt==2) { System.out.println(i);
		 * 
		 * } cnt=0; }
		 */
		for(int i = 2; i <= 100; i++) {
			if(isPrime(i)) {
				System.out.println(i);
			}
		}
	}
		static boolean isPrime(int k) {
	
				for(int j =1; j<=k; j++) {
						if(k%j==0) {
							cnt++;
				}
			}
			if(cnt==2) {
				cnt=0;
				return true;
			}
			cnt =0;
			return false;
		}
	}	