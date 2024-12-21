

public class Operators2 {
	public static void main(String args[]) {
		//arithmetic operators
		
	int a=10,b=20;
	
System.out.println("Addition of two numbers is:"+(a+b));
System.out.println("Subtraction of two numbers is:"+(a-b));
System.out.println("Multiplication of two numbers is:"+(a*b));
System.out.println("Division of two numbers is:"+(a/b));
System.out.println("Modulus of two numbers is:"+(a%b));
System.out.println("Power of two numbers is:"+(a*a));



//assignmnet with arithmetic operator

System.out.println("Addition of two numbers is:"+(a+=1));
System.out.println("Subtraction of two numbers is:"+(a-=1));
System.out.println("Multipllication of two numbers is:"+(a*=1));
System.out.println("Division of two numbers is:"+(a/=1));
System.out.println("Modulus of two numbers is:"+(a%=1));



//unary opertaor

System.out.println(" a++ values is"+(a++));
System.out.println(" ++a values is"+(++a));
System.out.println(" b-- values is"+b--);
System.out.println(" --b values is"+--b);



//Comparison operator
int e=30,f=20;
System.out.println((f>e));
System.out.println((f<e));
System.out.println((f==e));
System.out.println((f>=e));
System.out.println((f<=e));



//logical operator
boolean x=true;
boolean y=false;
System.out.println(x&&y);
System.out.println(x||y);
System.out.println(!x);



//ternary operator
int s=10,t=11,u=12,result;
result=((s>t)?(s>u)?s:t:(t>u)?u:s);



//bitwise operator
int p=0b1001;
int q=0b1100;
System.out.println(p&q);
System.out.println(p|q);
System.out.println(~q);
System.out.println(p^q);



//instance of operator
Operators2 obj=new Operators2();
System.out.println((obj instanceof Operators2));





}

}