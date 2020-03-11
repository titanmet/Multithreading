public class Test1Multithread {
    public static void main(String[] args) throws InterruptedException {
        MyThread myThread = new MyThread();
        myThread.start();
//        System.out.println("I am going to sleep");
//        MyThread.sleep(30);
//        System.out.println("I am awake");
//
//        MyThread myThread1 = new MyThread();
//        myThread1.start();
        Thread thread = new Thread(new Runner());
        thread.start();
    }
}

class Runner implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Yes:)" + i);
        }
    }
}

class MyThread extends Thread {
    public void run() {
        for (int i = 0; i < 1000; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Yes:)" + i);
        }
    }
}