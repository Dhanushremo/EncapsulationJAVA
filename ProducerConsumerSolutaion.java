class Queue1{
    private int data;
    boolean isDataPresent=false;

    public synchronized void setData(int data) {
        if(isDataPresent==false){
            this.data=data;
            System.out.println("PRODUCER Produced "+data);
            isDataPresent=true;
            notify();

        }
        else{
            try {
                wait();
            } catch (Throwable e) {
                System.out.println(e);
            }
        }
    }
    public synchronized void getData() {
        if(isDataPresent==true){
            System.out.println("COMSUMER CONSUMED "+data);
            isDataPresent=false;
            notify();

        }
        else {
            try{
                wait();
            }
            catch (Exception e){
                System.out.println(e);
            }
        }
    }

    @Override
    public String toString() {
        return "Queue{" +
                "data=" + data +
                '}';
    }
}

class Producer1 extends Thread{
    Queue1 q;
    @Override
    public void run() {
        int i=0;
        for( ; ; ){
            q.setData(i++);
        }
    }
    public Producer1(Queue1 q){
        this.q=q;
    }
}

class Consumer1 extends Thread{
    Queue1 q;
    @Override
    public void run() {
        for( ; ; ){
            q.getData();
        }
    }
    public Consumer1(Queue1 q){
        this.q=q;
    }
}


public class ProducerConsumerSolutaion {
    public static void main(String[] args) {
        Queue1 q=new Queue1();
        Producer1 p=new Producer1(q);
        Consumer1 c=new Consumer1(q);
        p.setName("PRODUCER");
        c.setName("CONSUMER");
        p.start();
        c.start();
    }
}
