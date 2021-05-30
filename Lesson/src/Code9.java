import java.util.Scanner;

public class Code9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("배열칸수지정");
		int input =sc.nextInt();
		int[]n = new int[input];
		for(int i = 0; i<input; i++) {
			System.out.println("배열 안에 번호지정");
			n[i]= sc.nextInt();
		}
		
		for(int i = 0; i < n.length; i++) {
			System.out.println("n프린트");
			System.out.println(n[i]);
		}
		int[] n2 = new int[input];
		
		n2[0]= n[n.length-1];
		for(int j = 1; j<n2.length; j++) {
			n2[j] =n[j-1]; 
		}
		for(int i = 0; i<n2.length; i++) {
			System.out.println("n2 프린트");
			System.out.println(n2[i]);
		}
	}
}
