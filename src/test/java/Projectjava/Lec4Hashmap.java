package Projectjava;

import java.util.HashMap;

public class Lec4Hashmap {

	public static void main(String[] args) {
		
	
				// TODO Auto-generated method stub

		          // create HashMap with  citis with zip codes
				HashMap<String,Integer> citys= new HashMap <String,Integer>();
				citys.put("stamford", 6902);
				citys.put("new cannon", 6905);
				citys.put("darian", 6994 );
				citys.put("norwalk", 6956);
				
				
				// print only values
				for(int i: citys.values()) {
					System.out.println(i);
				}
				
				
				// print only keyset
			   for(String i: citys.keySet()) {
				System.out.println(i);
			}
				
			   
			   //print keys and valus
			   
			   for (String i: citys.keySet()) {
				   System.out.println("keys:" +  i  +"value:"+  citys.get(i));
			   }
			
			
				// create HashMap called capital cities
				HashMap<String,String>CapitalCitis= new HashMap <String,String>();
				CapitalCitis.put("Dhaka", "Bangladesh");
				CapitalCitis.put("Delhi", "India");
				CapitalCitis.put("Sedny", "Austrilia");
				CapitalCitis.put("toronto","Canada");
				System.out.println(CapitalCitis);
			
				// create HashMap with Integer and String
				HashMap<Integer,String>Iphone= new HashMap<Integer,String>();
				Iphone.put(6, "iphone");
				Iphone.put (7,"iphone");
				Iphone.put(8, "iphone");
				
				System.out.println(Iphone);
				for(String i: Iphone.values()) {
					System.out.println(i);
				}
				
				// Remove torranto 
				CapitalCitis.remove(3);
				System.out.println(CapitalCitis.remove("Dhaka"));
				
				// Remove delhi
				CapitalCitis.remove("Delhi");
				System.out.println(CapitalCitis.remove("Delhi"));
				
				
				
				
				//define the size
				CapitalCitis.size();
				System.out.println(CapitalCitis.size());
				
				
				
				// get access
			
				CapitalCitis.get("Banglades");
				System.out.println("Bangladesh");
				CapitalCitis.get("Delhi");
				System.out.println("Delhi");
				CapitalCitis.get("sedny");
				System.out.println("Sedny");
			
				
		      // create hashMap intger, string
				HashMap<Integer,String> fabcitys = new HashMap<Integer,String>();
				
				fabcitys.put(1, "stamford");
				fabcitys.put(2, "norwalk");
				fabcitys.put(3, "darian");
				fabcitys.put(4, "highridge");
				fabcitys.put(5, "milford");
				
				System.out.println(fabcitys.size());
				fabcitys.get(3);
				System.out.println(fabcitys.get(3));
				
				for( int i=0; i<1; i++) {
					System.out.println(fabcitys);
					}
				
				fabcitys.remove(4, "highridge");
				System.out.println(fabcitys.remove(4));
				
				HashMap<String,Integer>citysjip= new HashMap<String,Integer>();
				citysjip.put("stamford", 6905);
				citysjip.put("norwalk", 5609);
				citysjip.put("darian", 6508);
				citysjip.put("Milford", 50689);
				for(int i=0; i<1; i++) {
					System.out.println(citysjip);
				}
				citysjip.size();
				System.out.println(citysjip.size());
				citysjip.get("stamford");
				System.out.println("stamford");
				
				citysjip.get(6905);
				System.out.println(6905);
						
					// print keys 
				for(String i: citysjip.keySet() ) {
				System.out.println(i);}
				
				for(int i: citysjip.values()) {
					System.out.println(i);
				}
				// keyset and valus together print
				for(String i: citysjip.keySet() ){
					System.out.println("keyset : "  +  i  +  " value : " + citysjip.get(i));
				}
				
				//HashMap<Integer,"String">variblename=new HashMap <Integer,"String">();
				HashMap<Integer,String>sportscar=new HashMap <Integer,String>();
				sportscar.put(1, "toyota");
				sportscar.put(2, "nissan");
				sportscar.put(3, "bmw");
				sportscar.put(4, "laxus");
				sportscar.put(5, "corolla");
				for(int i=1;i<sportscar.size();i++) {
					System.out.println(sportscar.get(i));
				}
				
				System.out.println(sportscar.size());
				
				//access corolla
				sportscar.get(5);
				System.out.println(sportscar.get(5));
				
				sportscar.remove(3);
				System.out.println(sportscar.remove(3));
				
				for(int i: sportscar.keySet()) {
					System.out.println(i);
				}
				for(String i: sportscar.values()) {
					System.out.println(i);
				}
				for(int i=0; i<sportscar.size(); i++) {
					System.out.println(sportscar.get(i));
				}
				for(int i: sportscar.keySet()) {
					System.out.println("key: "+ i + "value:"+sportscar);
					
				}
				for(int i=0; i<1;i++) {
					System.out.println(sportscar);}
			
				
				HashMap<String,String>capitalcitys= new HashMap<String,String>();
				capitalcitys.put("dhaka", "bangladesh");
				capitalcitys.put("stamford", "usa");
				capitalcitys.put("kolkata", "india");
				capitalcitys.put("florida", "usa");
				System.out.println(capitalcitys.size());
				for(int A =0; A<1; A++) {
				System.out.println(capitalcitys);
				}
				for(String i:capitalcitys.keySet()) {
				System.out.println(i);	
				}
				for(String i: capitalcitys.values()) {
					System.out.println(i);
				}
				for(String i: capitalcitys.keySet()) {
					System.out.println("keys: "+ i + "  valus : "+ capitalcitys.get(i));
				}
				for(int i=0; i<4; i++) {
					System.out.println(capitalcitys);
				}
				
				
				
				
				
				
				}			
				
							
			
	}
		


	


