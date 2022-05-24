package Projectjava;

import java.util.ArrayList;

public class Lec3ArrayList {

	public static void main(String[] args) {
		//sysntx 
		//ArrayList<Datatype>variablename= new ArrayList<String>();
		ArrayList <String>sportscar=new ArrayList();
		sportscar.add("toyota");
		sportscar.add("laxus");
		sportscar.add("rav4");
		sportscar.add("nissan");
        System.out.println(sportscar.size());
        
        sportscar.get(1);
        System.out.println(sportscar.get(1));
        for(int i=0; i<sportscar.size(); i++) {
        	System.out.println(sportscar.get(i));
        }
        for(int i=0; i<sportscar.size(); i++) {
        	System.out.println(sportscar.get(i));
        }
        ArrayList<String> flowers= new ArrayList <String>();
        flowers.add("rose");
        flowers.add("bally");
        flowers.add("waterlilly");
        flowers.add("lily");
        
        System.out.println(flowers.size());
        
        for(int i=0; i< flowers.size(); i ++) {
        	System.out.println(flowers.get(i));
        }
        
        
        
        
        
        
        
        
        
        
	}

}
