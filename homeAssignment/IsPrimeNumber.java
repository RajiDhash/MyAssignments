package homeAssignment;

public class IsPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int number = 13; 
        int count = 0;   
        
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                count++; 
            }
        }

        
        if (count == 0) {
            System.out.println(number + " is a Prime Number.");
        } else {
            System.out.println(number + " is not a Prime Number.");
        }
    }
}