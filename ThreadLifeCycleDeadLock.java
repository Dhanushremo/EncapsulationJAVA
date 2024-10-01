import java.util.*;
import java.lang.*;
class Warriors1 extends Thread{
	String rs1="STUDY";
	String rs2="JOB";
	String rs3="HAPPINESS";
	String name;
	public void run(){
	name=Thread.currentThread().getName();	
		if(name.equals("Dhanush")){
			dhanush();
		}
		else{
			remo();
		}
	}
	public void dhanush(){
		try{
			Thread.sleep(3000);
		synchronized(rs1){
			System.out.println(name+" acquires The "+rs1);
			Thread.sleep(3000);
			synchronized(rs2){
				System.out.println(name+" acquires The "+rs2);
				Thread.sleep(3000);
				synchronized(rs3){
					System.out.println(name+" acquires The "+rs3);

				}
			}

		}
	
		}
		catch(Exception e){
			e.printStackTrace();
		}	
	}
	public void remo(){
		try{
			Thread.sleep(3000);
		synchronized(rs3){
			System.out.println(name+" acquires The "+rs3);
			Thread.sleep(3000);
			synchronized(rs2){
				System.out.println(name+" acquires The "+rs2);
				Thread.sleep(3000);
				synchronized(rs1){
					System.out.println(name+" acquires The "+rs1);

				}
			}

		}
	
		}
		catch(Exception e){
			e.printStackTrace();
		}	

	} 
}
public class ThreadLifeCycleDeadLock{
	public static void main(String args[]){
		Warriors1 w1=new Warriors1();
		Warriors1 w2=new Warriors1();

		w1.setName("Dhanush");
		w2.setName("Remo");
		
		w1.start();
		w2.start();

		}
	}