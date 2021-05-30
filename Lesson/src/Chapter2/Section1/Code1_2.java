package Chapter2.Section1;

public class Code1_2 {

	public static void main(String[] args) {

		Person1 first;
		first = new Person1(); //object
		
		first.name = "John";
		first.number = "0102483120";
		
		System.out.println("Name: "+ first.name + ", Number: "+ first.number);
		
		Person1 second = first;
		second.name = "Tom";
		System.out.println("Name: "+ first.name + ", Number: "+ first.number);

		//System.out.println("Name: "+ second.name + ", Number: "+ second.number);
		
		
		Person1 [] members = new Person1 [100];
		members[0] = first;
		members[1] = second;
		
		//객체주소를 복사한다는 것을 잊지말자 !! 
		
		System.out.println("Name: "+ members[0].name + ", Number: "+ members[0].number);
		System.out.println("Name: "+ members[1].name + ", Number: "+ members[1].number);
		
		members[2] = new Person1();
		members[2].name = "David";
		members[2].number = "12345649";
		System.out.println("Name: "+ members[2].name + ", Number: "+ members[2].number);
	
	}

}
