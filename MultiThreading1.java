import java.util.Scanner;
class Multi1 extends Thread{
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
        System.out.println("SADDITIO ENDED");
    }
}
class Multi2 extends Thread{
    @Override
    public String toString() {
        return "HAI";
    }

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

    }}

    class Multi3 extends Thread{
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



    public class MultiThreading1 {
        public static void main(String[] args) {
           Multi1 m1=new Multi1();
           Multi2 m2=new Multi2();
           Multi3 m3=new Multi3();

//           m1.run();    we cant achieve multithreading, because the stackframe will be created at main stack
//           m2.run();
//           m3.run();
            m1.start();
            m2.start();
            m3.start();   // we can achive multithreading,we can use cpu time efficiently
    }

}
