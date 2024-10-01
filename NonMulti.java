import java.util.Scanner;
public class NonMulti {
    public static void main(String[] args) {
        System.out.println("ADDITION STARTED");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number1 ");
        int num1=sc.nextInt();
        System.out.println("Enter Number2 ");
        int num2=sc.nextInt();
        int res=num1+num2;
        System.out.println("Result "+res);
        System.out.println("SADDITIO ENDED");
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
