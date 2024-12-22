

public class PrimeNumbers {
	public static void main (String args[]) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	if(num<=1) {
		System.out.println("the given number is not prime");
	}else if(num == 2|| num == 3||num ==5|| num == 7) {
		System.out.println("the given number is prime");
	}else if(num%2 == 0) {
		System.out.println("the given number is not prime");
	}else if(num%3 == 0) {
		System.out.println("the given number is not prime");
	}else if(num%7 == 0) {
		System.out.println("the given number is not prime");
	}else if(num%2 == 0) {
		System.out.println("the given number is not prime");
	}else {
		System.out.println("the given number is prime");
	}
		// TO
	}
	

}
