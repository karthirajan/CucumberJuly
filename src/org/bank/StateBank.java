package org.bank;

public class StateBank extends ReserveBank{

	
	public void eduLoan() {
		
		System.out.println("edu loan is 10%");
		
	}


	public void personalLoan() {
		
		System.out.println("personal loan is 12%");
	}


	public void houseLoan() {
		
		System.out.println("house loan is 14%");
	}


	public void carLoan() {
		
		System.out.println("car loan is 15%");
		
	}
	
	public static void main(String[] args) {
		StateBank s = new StateBank();
		s.agriLoan();
		s.carLoan();
		s.eduLoan();
		s.houseLoan();
		s.personalLoan();
	}

}
