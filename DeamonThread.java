package com.dhanush.java;

class Captain extends Thread{
	@Override
	public void run() {
		System.out.println("ROHITHSHARAMA ENTERS THE GROUND");
		try {
			Batting bac=new Batting();
			bac.setName("BattingCoach");
			Bowling boc=new Bowling();
			boc.setName("BowlingCoach");
			bac.setDaemon(true);
			boc.setDaemon(true);
			bac.start();
			boc.start();
			Thread.sleep(3000);
			System.out.println("ROHITHSHARAMA WILL GO WARM-UP");
			Thread.sleep(3000);
			System.out.println("ROHITHSHARAMA WILL GO WALKING");
			Thread.sleep(3000);
			System.out.println("ROHITHSHARAMA WILL GO JAGGING");
			Thread.sleep(3000);
			System.out.println("ROHITHSHARAMA WILL GO RUNNING");
			Thread.sleep(3000);
			System.out.println("ROHITHSHARAMA WILL GO FILEDING");
			Thread.sleep(3000);
			System.out.println("ROHITHSHARAMA WILL GO BATTING");
			Thread.sleep(3000);
			System.out.println("ROHITHSHARAMA WILL GO BOWLING");
			Thread.sleep(3000);
			System.out.println("ROHITHSHARAMA WILL GO REST-ROOM");
			Thread.sleep(3000);
			System.out.println("ROHITHSHARAMA WILL GO TAKE REST");
			Thread.sleep(3000);
			System.out.println("ROHITHSHARAMA WILL GO HOTEL");
		}
		catch(Throwable e) {
			System.out.println(e.getMessage());
		}
	}
}
class Batting extends Thread{
	@Override
	public void run() {
		for( ; ; ) {
			System.out.println("BATTING COACH IS THERE IN THE GROUND!!");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			
				e.printStackTrace();
			}
		}
	}
}

class Bowling extends Thread{
	@Override
	public void run() {
		for( ; ; ) {
			System.out.println("BOWLING COACH IS THERE IN THE GROUND!!");
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
			
				e.printStackTrace();
			}
		}
	}
}


public class DeamonThread {

	public static void main(String[] args) {
		Captain c=new Captain();
		c.setName("Captain");
		
		c.start();
		

	}

}
