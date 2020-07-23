package org.com;

public class PraveenTest2 {
	 String AnimalName;
	 String AnimalFamily;
	 String AnimalPlace;
	


	PraveenTest2(String name,String Family,String Place) {
		 AnimalName = name;
		 AnimalFamily = Family;
		 AnimalPlace = Place;
	 }
	public void Animal() {
		System.out.println("Animal Name :" +AnimalName);
		System.out.println("Animal Family :" +AnimalFamily);
		System.out.println("Animal Place :" +AnimalPlace);
		
	}
	

	public static void main(String[] args) {
		PraveenTest2 T = new PraveenTest2("Tiger","Cat","Forest");
		T.Animal();

	}

}
