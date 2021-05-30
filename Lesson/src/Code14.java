import java.util.Scanner;

public class Code14 {

	public static void main(String[] args) {
		
		int temp = 0;
		int[] num= {8,4,1,7,11,13,5,2};
		
		for(int i = num.length-1; i>0; i--) {
			for(int j = 0; j<i; j++) {
				if(num[j]>num[j+1]) {
					temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		}
		for(int n : num) {
			System.out.println(n);
		}

	}

}
