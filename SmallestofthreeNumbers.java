
public class SmallestofthreeNumbers {
	public static void main (String args[]) {
		Scanner sc=new Scanner(System.in);
		int num1 = sc.nextInt();
		System.out.println("Enter the second number");
		int num2 = sc.nextInt();
		System.out.println("Enter the third number");
		int num3 = sc.nextInt();
		if(num1<num2 && num1<num3) {
			System.out.println("the first number is smallest number");
		}else if(num2<num1 && num2<num3){
			System.out.println("the second number is the smallest number");
		}else {
			System.out.println("the third number is the smallest number");
		}
	}

}
