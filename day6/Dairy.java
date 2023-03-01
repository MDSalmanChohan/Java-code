
import java.lang.String;
public class Dairy {
	static float balance =0;
	static final float rate =45;
  
	public static void doodhAaya(float milk ,String type ) {
		
		balance=balance+ calculate (milk);
		System.out.println("aaj"+ type +" ka "+ milk +" ltr doodh aaya " );		
	}
           public static float calculate(float milk)  {
			float calculate= milk*rate; 
			return  calculate;
		

}

	public static void main(String[] args){
		doodhAaya(3,"cow");	
		doodhAaya(6,"bhes");
		doodhAaya(7,"cow");
		doodhAaya(1,"cow");
		doodhAaya(2,"bhes");
		doodhAaya(4,"bhes");
		doodhAaya(8,"cow");
		 System.out.println("aaj tk ka balance "  + showBalance () +"  hain");

		paiseDiye(35);
		paiseDiye(36);
		paiseDiye(37);
		paiseDiye(38);
		System.out.println("aaj tk ka balance "  + showBalance () +"  hain");

	}
																
 
	public static float showBalance (){										
		return balance;
	}
	public static void paiseDiye(float ammount){
		balance=balance-ammount;
		System.out.println("paise diye"+ ammount);
	}
}