package org.project;



public class Const {
	
	  public Const() {
		  this(123);
		System.out.println("super class default constructor");
	}
	   public Const(int a) {
		   System.out.println("super class argument based");
	   }
	   
	   public static void main(String[] args) {
		Const sd = new Const();
		
	}

}
