package Projectjava;

public class Lec3Arrays {

	public static void main(String[] args) {
	// syntax for Arrays
		//Datatype[]variablename={ value }
         
		// print five fev fruit
		String []fruits= {"mango","apple","banana","orange","watermelon"};
		System.out.println(fruits.length);
		fruits[4]= "grape";
		System.out.println(fruits[4]);
		
		System.out.println(fruits [0]);
		
		System.out.println(fruits[2]);
		System.out.println(fruits[3]);
   
		for(int i=0; i<fruits.length; i++) {
			System.out.println(i);
		}
		// print four sportscar
		String []sportscar = {"toyota", "nissan", "honda","bmw"};
		System.out.println(sportscar.length);
		for(int i=0; i<sportscar.length;i++) {
			System.out.println(sportscar[i]);
		}
		//sportscar[3];
		System.out.println(sportscar[3]);
		
		
		
		
		
		
	}	

}
