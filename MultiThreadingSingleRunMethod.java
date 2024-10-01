import java.util.Scanner;

class SingleRun extends Thread{
    @Override
    public void run() {
        Thread t=Thread.currentThread();
        System.out.println(t);
        String name=t.getName();

        if(name.equals("Thread-0")){
            add();
        }
        else if (name.equals("Thread-1")) {
            printChars();
        }
        else {
            printNUmbers();
        }
    }

    public void add(){
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
    public void printChars(){
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
    public void printNUmbers(){
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

public class MultiThreadingSingleRunMethod {
    public static void main(String[] args) {
        SingleRun s1=new SingleRun();
        SingleRun s2=new SingleRun();
        SingleRun s3=new SingleRun();

        s1.start();
        s2.start();
        s3.start();
    }
}
