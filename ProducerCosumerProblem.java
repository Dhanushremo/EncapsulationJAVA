class Queue{
    private int data;
    public void ssetData(int data){
        this.data=data;
        System.out.println("Producer produced "+data);
    }
    public void getData(){

        System.out.println("Consumer consumed "+data);
    }
}
class Producer extends Thread{
    Queue q;
    public void run(){
        int i=1;
        for( ; ; ){
            q.ssetData(i++);
        }
    }
    public Producer(Queue q){

        this.q=q;
    }
}

class Consumer extends Thread{
    Queue q;
    public void run(){
        for( ; ; ){
            q.getData();
        }
    }
    public Consumer(Queue q){
        this.q=q;
    }
}


public class ProducerCosumerProblem {
    public static void main(String args[]){
        Queue q=new Queue();

        Producer p=new Producer(q);
        p.setName("PRODUCER");
        Consumer c=new Consumer(q);
        c.setName("CONSUMER");

        p.start();
        c.start();

    }
}
