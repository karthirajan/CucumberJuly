package org.Literals;

public class NonLiteral {
	public static void main (String[] args) {
		String r = new String ("Nisha");
		String r1 = new String ("Rangan");
		String r2 = new String ("Nisha Rangan");
		System.out.println("Non-Literal String");
		System.out.println(System.identityHashCode(r));
		System.out.println(System.identityHashCode(r1));
		System.out.println(System.identityHashCode(r2));
	}

}
