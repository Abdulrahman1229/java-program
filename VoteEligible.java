
public class VoteEligible {
	public static void main(String args[]) {
	Scanner sc =new Scanner(System.in);
	System.out.println("Enter your country name");

	String userCountry = sc.next();
	System.out.println("Enter your age");
	int userAge = sc.nextInt();
	if(userCountry.equalsIgnoreCase("India") ) {
		if(userAge >= 18) {
			System.out.println("your are eligible to vote");
		}else {
			System.out.println("your age is under 18 , so are not eligible to vote");
		}
		
	}else {
		System.out.println("your are not from India, so eligible to vote");
	}

}
}
	


