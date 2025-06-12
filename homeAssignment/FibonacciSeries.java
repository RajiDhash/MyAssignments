package homeAssignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int range =8, num1=0, num2=1;
System.out.println("Fibonacci series of " +range +" number:");
	
	{
 for (int i =1; i <= range; ++i)
 {
	 System.out.println(num1+" ");
	 int sum=num1+num2;
	 num1 = num2;
	 num2 = sum;
 } 
 }
	}
}

