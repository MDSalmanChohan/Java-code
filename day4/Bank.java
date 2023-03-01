import java.lang.String;
 public class Bank {
	   static float balance = 0;
 public static void  deposit () {
   		balance = balance+10;
		System.out.println(" 10 rs added");
	}

 public static void withdraw () {
 		balance= balance-10;
		 System.out.println("10 rs removed");
}
 public static void showBalance (){
  	System.out.println ("Balance:" + balance );
}
 public static void main (String []args){
		deposit ();
		deposit ();
		showBalance ();
		withdraw ();
		showBalance ();
	}
}
