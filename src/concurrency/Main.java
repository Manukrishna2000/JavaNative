package concurrency;

public class Main {
    public static void main(String[] args) {

        Thread thred=new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 5; i++) {
                    System.out.println("thread running"+i);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        });
        thred.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main thread running"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int a=1;
        int b=0;
        try {
                System.out.println(a/b);
            }
            catch (Exception e){
                System.out.println("b is 0");
            }




//
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for (int i = 0; i < 5; i++) {
//                    System.out.println("printing "+i);
//                    try {
//                        Thread.sleep(1000);
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//
//                }
//
//            }
//        });
//        thread.start();

//        for (int i = 0; i < 5; i++) {
//            System.out.println("main printing "+i);
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            int a =1;
//            int b=0;
//            try {
//                System.out.println(a/b);
//            }
//            catch (Exception e){
//                System.out.println("b is 0");
//
//            }
//
//        }
    }

}
