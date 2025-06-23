package week3.Day1;

public class Amazon extends CanaraBank {

	

	@Override
	public void cashOnDelivery() {
		System.out.println("The mode of payment is Cash on Delivery");
		
		
	}

	@Override
	public void upiPayments() {
		System.out.println("The mode of payment is UPI payment");
		
	}

	@Override
	public void cardPayments() {
		System.out.println("The mode of payment is Card Payment");
		
	}

	@Override
	public void internetBanking() {

System.out.println("The Mode of payment is Internet Banking");
		
	}
	public static void main(String[] args) {
		Amazon amz= new Amazon();
		amz.cardPayments();
		amz.cashOnDelivery();
		amz.upiPayments();
		amz.recordPaymentDetails();
		amz.internetBanking();

		}

}
