package week4;
class BookMyShow{
	String userEmail;
	String movieName;
	double amount;
	public void bookTicket() {
		Payment payment = new Payment();
		if(payment.makePayment()) {
			System.out.println("Tickets booked");
		}
	}
	private class Payment{
		private int cardno;
		private int cvv;
		
		public boolean makePayment() {
			return true;
			
		}
	}
}
public class UserTicket {
	public static void main(String[] args) {
		BookMyShow obj = new BookMyShow();
		obj.bookTicket();
		
	}
}
