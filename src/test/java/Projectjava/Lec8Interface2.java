package Projectjava;

public class Lec8Interface2 implements Lec8Interface1{

	public static void main(String[] args) {
	

		Lec8Interface2 myobj= new Lec8Interface2();
		myobj.method1();
		myobj.fbsignin();
		myobj.method2();
	}

	@Override
	public void method1() {
	System.out.println("nexttech");
		
	}
 
	@Override
	public void method2() {
		System.out.println("rumana");
		
	}

	@Override
	public void fbsignin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fblogin() {
		// TODO Auto-generated method stub
		
	}

}
