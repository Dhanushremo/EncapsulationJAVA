package com.dhanush.java;
class Bathroom{
	synchronized public void bathRoom() {
		try {
			String name=Thread.currentThread().getName();
			System.out.println(name+" Enters The Bathroom");
			Thread.sleep(3000);
			System.out.println(name+" Using The Bathroom");
			Thread.sleep(3000);
			System.out.println(name+" Exits The Bathroom");			
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
	}
}
class Boy extends Thread{
	Bathroom ba;
	@Override
	public void run() {
		ba.bathRoom();
	}
	public Boy(Bathroom bathroom) {
		this.ba=bathroom;
	}
}

class Girl extends Thread{
	Bathroom ba;
	@Override
	public void run() {
		ba.bathRoom();
	}
	public Girl(Bathroom bathroom) {
		this.ba=bathroom;
	}
}
class Others extends Thread{
	Bathroom ba;
	@Override
	public void run() {
		ba.bathRoom();
	}
	public Others(Bathroom bathroom) {
		this.ba=bathroom;
	}
}
public class Synchronaization {
	
	public static void main(String[] args) {
		
	Bathroom ba=new Bathroom();
	
	Boy b=new Boy(ba);
	Girl g=new Girl(ba);
	Others o=new Others(ba);
	b.setName("Boy");
	g.setName("Girl");
	o.setName("Others");
	
	
	try {
		b.start(); 
		g.start();
		o.start();
	}
	catch(Exception e) {
		e.printStackTrace();
	}

	}
	
}
