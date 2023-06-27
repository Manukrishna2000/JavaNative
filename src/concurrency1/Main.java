package concurrency1;

public class Main {
    public static void main(String[] args) {


    Thread thread=new Thread(new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i <5; i++) {
                System.out.println("thread printing "+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    });
    thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main thread running"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
}
}