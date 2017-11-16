package atm;
import java.util.*;
 abstract class Account {
double balance=5555.55;

 abstract void Withdraw() ;
 abstract void Deposit();
	 double getBalance() {
			double balance=5555.55;
		return balance;
		}
	 
	 
	public class Savings extends Account {
		void Withdraw() {
			 System.out.println("Please Enter the amount ");
			Scanner ob1 = new Scanner(System.in);
			int amt=ob1.nextInt();
			 if ( amt > balance) {
				 System.out.println("Insufficient Balance");
				
			}
			 else {
				 System.out.println("Please take your Cash\nThank You!");
				 balance = balance-amt;
			 }
		}
		
		void	 Deposit(){
				 System.out.println("Please Enter the amount to be deposit");
				 Scanner ob1= new Scanner(System.in);
				 int amt = ob1.nextInt();
				 balance=balance+amt;
			 }
			 
	 }}
		 
	 
	 class Current  extends Account  {
		void Withdraw() {
			 System.out.println("Please Enter the amount ");
			Scanner ob1 = new Scanner(System.in);
			int amt=ob1.nextInt();
			 if ( amt > balance) {
				 System.out.println("Insufficient Balance");
				
			}
			 else {
				 System.out.println("Please take your Cash\nThank You!");
				 balance = balance-amt;
			 }
		}
		
			void Deposit(){
				 System.out.println("Please Enter the amount to be deposit");
				 Scanner ob1= new Scanner(System.in);
				 int amt = ob1.nextInt();
				 balance=balance+amt;
			 }
	 }
class ATMtest {
	public static void main(String arg[]) {
		System.out.print("Swipe your card and Enter the PIN ");
		Scanner ob1=new Scanner(System.in);
		int PIN = ob1.nextInt();
		if (PIN==1234) {
			System.out.println("Select the Account\n1. Savings\n2. Current ");
			int A=ob1.nextInt();
			//if(A==1) {
				Account s=new Saving();
			s.Withdraw();
		}
	}
}