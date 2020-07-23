package org.Literals;

public class LiteralString {
	public static void main (String[] args) {
		String r = "Nisha";
		String r1 = "Rangan";
		String r2 = "Nisha Rangan";
		System.out.println(System.identityHashCode(r));
		System.out.println(System.identityHashCode(r1));
		System.out.println(System.identityHashCode(r2));
		
		
	}

}
