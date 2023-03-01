import java.lang.String;
 public class Bank {
	   static float balance = 0;
 public static void  deposit (float depositAmount) {
   		balance = balance+depositAmount;
		System.out.println(depositAmount+" rs added");
	}

 public static void withdraw ( float withdrawAmount) {
 		balance= balance-withdrawAmount;
		 System.out.println(withdrawAmount+"rs removed");
}

 public static void addByaaj ( float byaajPercentage) {

 	balance = balance + calculateTax(byaajPercentage,"byaaj");

	System.out.println("aapka Byaaj " + byaajPercentage+ " tha");
}
 public static void cutTax ( float taxPercentage){
	 String  taxType =  "tax";
	float myTax= calculateTax(taxPercentage , taxType );
	balance = balance- myTax;
	System.out.println("cutTax "+ taxPercentage);

}

public static float calculateTax(float taxPercantage, String type ){
	System.out.println("ki tumhara "+ type +"itna hai: "+(balance*taxPercantage/100));
	
	return (balance*taxPercantage/100);

}

 public static void showBalance (){
  	System.out.println ("Balance:" + balance );
}
 public static void main (String []args){
		deposit (500);
		deposit (100);
		addByaaj(12);
		showBalance ();
		withdraw (50);
		cutTax (5);
		showBalance ();
	}
}
