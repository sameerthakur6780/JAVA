package week4;
interface TimerOwner {
    void timerDone();
}
class Timer implements Runnable {
    private TimerOwner owner;
    public Timer(TimerOwner owner) {
        this.owner = owner;  //Callbackclass
    }
    public void start() {
        Thread thread = new Thread(this);
        thread.start();  //start() invoke run()
    }

    @Override
    public void run() {
        try {
            System.out.println("Timer started, doing something...");
            Thread.sleep(2000); 
            System.out.println("Timer task completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        owner.timerDone();
    }
}

public class Callbackclass implements TimerOwner {

    @Override
    public void timerDone() {
        System.out.println("Timer done!");
    }

    public void startTimer() {
        Timer timer = new Timer(this);
        timer.start();
        System.out.println("Hello1");
        System.out.println("Hello1");
    }

    public static void main(String[] args) {
        Callbackclass Callbackclass = new Callbackclass();
        Callbackclass.startTimer();
        
    }
}

