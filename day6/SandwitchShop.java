package day6;

import java.lang.String;
public class SandwitchShop {
	static float balance = 0;
	static final float rate = 20;
	
	public static void giveSandwitch (int count,String type,boolean tikha) {
		if(type=="cheese") {
			
			balance = balance + count*(rate+10);

		} else if (type=="chicken") {
			
  			balance = balance + count*(rate+20);
		} else {
	
			balance = balance + count*(rate);
		}
		System.out.println("give Sandwitch "+ count +" type "+type + " tikha " + tikha );

	} 
		



	public static void main (String [] args ) {

		String stype = "normal";
			
		giveSandwitch(5,stype,true);
		giveSandwitch(6,"cheese", true);
		giveSandwitch(11,"chicken",false);
		showBalance();
		showBalance();
		showBalance();
	}
	 

	public static void  showBalance ()  {
		
		System.out.println("aaj tak ka balance " + balance);
	}

} 
	