import java.util.Scanner;

class MultiR implements Runnable{
    @Override
    public void run() {
        System.out.println("ADDITION STARTED");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1 ");
        int num1=sc.nextInt();
        System.out.println("Enter Number2 ");
        int num2=sc.nextInt();
        int res=num1+num2;
        System.out.println("Result "+res);
        System.out.println("ADDITION ENDED");
    }
}

class MultiR1 implements Runnable{
    @Override
    public void run() {
        System.out.println("PRINTING CHARS");
        for(int i=65;i<=75;i++){
            System.out.println((char)i);
            try{
                Thread.sleep(1000);
            }
            catch (Throwable e){
                e.printStackTrace();
            }
        }
        System.out.println("PRINTING CHARS ENDED");

    }
}

class MultiR2 implements Runnable{
    @Override
    public void run() {
        System.out.println("PRINTING NUMBERS");
        for(int i=65;i<=75;i++){
            System.out.println(i);
            try{
                Thread.sleep(1000);
            }
            catch (Throwable e){
                e.printStackTrace();
            }
        }
        System.out.println("PRINTING NUMBERS ENDED");

    }
}

public class MultiThreadingRunnable {
    public static void main(String[] args) {
        MultiR m=new MultiR();
        MultiR1 m1=new MultiR1();
        MultiR2 m2=new MultiR2();

        Thread t1=new Thread(m);
        Thread t2=new Thread(m1);
        Thread t3=new Thread(m2);

        t1.start();
        t2.start();
        t3.start();
    }
}
