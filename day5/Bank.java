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
 public static void cutTax ( float taxPercentage){
	calculateTax(taxPercentage);
	balance = balance-balance*taxPercentage/100;
	System.out.println("cutTax "+ taxPercentage);

}

public static void calculateTax(float taxPercantage){
	System.out.println("ki tumhara tax itna hai: "+(balance*taxPercantage/100));

}

 public static void showBalance (){
  	System.out.println ("Balance:" + balance );
}
 public static void main (String []args){
		deposit (500);
		deposit (100);
		showBalance ();
		withdraw (50);
		cutTax (5);
		showBalance ();
	}
}
