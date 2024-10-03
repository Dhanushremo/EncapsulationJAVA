class College extends Thread{
    @Override
    public void run() {
        System.out.println("College is opened at mronign 9:00Am");
        try{
            Thread.sleep(3000);
            Facultys f=new Facultys();
            Students s=new Students();
            f.setName("FACULLTY");
            s.setName("STUDNET");
            f.setDaemon(true);
            s.setDaemon(true);
            f.start();
            s.start();
            System.out.println("College is going on");
            Thread.sleep(3000);
            System.out.println("College ended");
            T
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
}

class Facultys extends Thread{
    @Override
    public void run() {
        for( ; ;){
            System.out.println("Faculty is there in college!!");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
class Students extends Thread{
    @Override
    public void run() {
        for( ; ;){
            System.out.println("Student is there in College");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
public class DeamonThreads {
    public static void main(String[] args) {
        College c=new College();
        c.setName("College!");
        c.start();
    }
}
