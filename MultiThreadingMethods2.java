class Demo123 extends Thread{
    @Override
    public void run() {
        System.out.println("Thread-0 Is Started");
        System.out.println("Thread-0 is executing!!");
        System.out.println("Thread-0 is executing!!");
        System.out.println("Thread-0 is executing!!");System.out.println("Thread-0 is executing!!");

        System.out.println("Thread-0 is executing!!");
        System.out.println("Thread-0 is executing!!");
        Thread t=Thread.currentThread();
        System.out.println("Thread-0 is executing!!");
        t.setName("Dhannush");
        System.out.println("Thread-0 is executing!!");
        System.out.println(t);
        System.out.println("Thread-0 is executing!!");
        System.out.println(t.getName());
        System.out.println("Thread-0 is executing!!");
        System.out.println("Thread-0 is executing!!");
        System.out.println("Thread-0 is executing!!");
        System.out.println("Thread-0 is executing!!");
        System.out.println("THREAD-0 IS STOPPED");
    }
}


public class MultiThreadingMethods2 {
    public static void main(String[] args) {
        System.out.println("MAIN STARTED");
        System.out.println("Main is Executing..");
        System.out.println("Main is Executing..");
        System.out.println("Main is Executing..");System.out.println("Main is Executing..");
        System.out.println("Main is Executing..");
        Thread mainThread=Thread.currentThread();
        System.out.println("Main is Executing..");
        mainThread.setName("Hey Main Is MOdified");
        System.out.println("Main is Executing..");
        System.out.println(mainThread);
        System.out.println("Main is Executing..");
        System.out.println(mainThread.getName());
        System.out.println("Main is Executing..");
        Demo123 d=new Demo123();
        d.start();
        try{
            d.join();
        }
        catch (Throwable e){
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println(e);
        }
        System.out.println("Main is Executing..");
        System.out.println("Main is Executing..");System.out.println("Main is Executing..");

        System.out.println("Main is Executing..");
        System.out.println("MAIN STOPED");
    }
}
