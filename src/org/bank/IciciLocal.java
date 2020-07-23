package org.bank;

public class IciciLocal implements IciciMain,RBI{

	
	public void savingAcc() {
		
		System.out.println("min amount is 100000");
		
	}

	
	public void currentAcc() {
		
		System.out.println("min amount is 200000");
		
	}

	
	public void fixedAcc() {
		
		System.out.println("min amount is 300000");
		
	}
	
	
	public void dummy() {
		
		System.out.println("dummy");
		
	}
	
	public static void main(String[] args) {
		IciciLocal i = new IciciLocal();
		i.fixedAcc();
		i.savingAcc();
		i.currentAcc();
		i.dummy();
	}




}
