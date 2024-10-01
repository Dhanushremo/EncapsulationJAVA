import java.util.*;
import java.lang.*;
class Warriors extends Thread{
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
}
public class ThreadLifeCycle{
	public static void main(String args[]){
		Warriors w1=new Warriors();
		Warriors w2=new Warriors();

		w1.setName("Dhanush");
		w2.setName("Remo");
		
		w1.start();
		w2.start();

		}
	}