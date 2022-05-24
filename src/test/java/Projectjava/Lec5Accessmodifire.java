package Projectjava;

public class Lec5Accessmodifire {

	
	//Attribute
	int A=10;
	String car = "Nissan";
	
	//method
	//Accessmodifier return type method name();
	
	
	public void facebooklogin () {
		// block of code
	}
	public void facebooksignin() {
		
	}
	public void method2 () {
		// code
	}
	private void Rumana() {
		
	}
	
	public void Nexttech() {
		
	}
	void method5(){
		
	}
	
	public static void main(String[] args) {
		// create obj of the class
		// syntex for obj
		//class name object name  = new class name ();
		
		 Lec5Accessmodifire modifire = new  Lec5Accessmodifire();
		 
		 modifire.facebooklogin();
		 modifire.facebooksignin();
		 modifire.method5();
		System.out.println(modifire.car);
		
		modifire.A=50;
		System.out.println(modifire.A);
		modifire.car= "Toyota";
		System.out.println(modifire.car);
	}

}
