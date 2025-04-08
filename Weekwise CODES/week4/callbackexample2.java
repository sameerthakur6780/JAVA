package week4;
import java.util.Date;
interface Notification{
	void notification();
}
class WorkingDay implements Notification{
	public void notification() {
		System.out.println("Today is working day");
		
	}
}
class Weekend implements Notification{
	public void notification() {
		System.out.println("Today is weekend");
		
	}
}
class Timerr {
	Notification n;
	public void start(Date d) {  //29/06/2024 0,1,2,3,4,5,6
		if(d.getDay() == 6 || d.getDay()==0 ) {
			n = new Weekend();
			n.notification();
		}
		else {
			n = new WorkingDay();
			n.notification();
		}
	}
}
public class callbackexample2 {
	public static void main(String[] args) {
		Timerr timer = new Timerr();
		timer.start(new Date());
	}
}
