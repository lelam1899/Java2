package Assignment3;

public class Main {
    public  static void main(String[]args)throws InterruptedException{
  //      System.out.println(""+Thread.currentThread().getName());
//        for (int i=0; i<5; i++){
//            System.out.println("Running main thread -- "+i);
//            Thread.sleep(2000);
//        }
//        for (int i =0;i<1; i++){
//            System.out.println("CHUC MUNG");
//            Thread.sleep(10000);
//        }
//        SubThread subThread = new SubThread();
//        subThread.start();


//        SubThread sub2Thread = new SubThread();
//        Thread thread = new Thread(sub2Thread);
//        thread.start();
//
//        MyThread myThread = new MyThread();
//        System.out.println(myThread.getName());
//        myThread.setName("MyJavaThread");
//        System.out.println(myThread.getName());
//        myThread.start();


        SubThread subThread = new SubThread();
        SubThread subThread1 = new SubThread();
        SubThread subThread2 = new SubThread();
        subThread.start();
        subThread1.start();
        subThread2.start();
    }

}
