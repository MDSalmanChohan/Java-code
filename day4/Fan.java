import java.lang.String;

public class Fan {
	static boolean workWithElectricity = true;
	static short bladeCount = 3;
	 static String madeof = "iron";
	static boolean isOn = false;
	
	static void toGiveAir () {
 		 System.out.println("giving Air");
	}


	static  void switchOn () {
   		isOn =true  ;
		workWithElectricity = true ;



		System.out.println ("Fan Started");
	}

	static void switchOFF () {
		isOn = false;
		workWithElectricity = false;
		System.out.println("Fan Stoped");
	} 
	public static void main (String args[]) {
		switchOn ();
		toGiveAir ();
 		switchOFF ();
		makeFan((short)4);
	}

	public static void makeFan(short bladeParameter) {
		System.out.println("BEFORE my Fan has "+bladeCount);
		bladeCount = bladeParameter; 
		System.out.println("AFTER my Fan has "+bladeCount);
			
	}
	
}