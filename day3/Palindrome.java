package week1.day3;

public class Palindrome {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		int input,output = 0,rem;
		input = 262;
		
		for (int i = input; i >0; i=i/10)
		{
		
		 rem = i%10; 
		 output = output*10+rem;
	
		
	
		System.out.println(output);
		}
		if(input == output)
		{
			System.out.println("its a palidrome");
		}
		else
		{
			System.out.println("Not  palidrome");
		}
		
	}


	}


