import java.util.Scanner;

public class TestVolatile {
    public static void main(String[] args) {
        MyThread1 myThread1=new MyThread1();
        myThread1.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();

        myThread1.shutdown();
    }
}

class MyThread1 extends Thread {
    private volatile boolean running = true;

    public void run() {
        while (running) {
            System.out.println("HI !!!");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public void shutdown() {
        this.running = false;
    }
}
