package Chapter2.Section1;

public class Code1 {

	public static void main(String[] args) {

		int x ;
		x= 100;
		
		double y = 1.0023;

		Person1 first;
		first = new Person1(); // °´Ã¼»ý¼º
		
		first.name = "John";
		first.number= "012345";
		
		System.out.println("Name: "+ first.name+ ", Number:"+ first.number);
		
		Person1[] members = new Person1 [10];
		members[0] = first;
		members[1] = new Person1(); 
		members[1].name ="David";
		members[1].number="2314586864";
		
		System.out.println("Name: "+ members[1].name+ ", Number:"+ members[1].number);
	}

}
