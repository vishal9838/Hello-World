package atm;
import java.util.*;
public class Atmtest2 {

	
		public static void main(String arg[]) {
			System.out.print("Swipe your card and Enter the PIN ");
			Scanner ob1=new Scanner(System.in);
			int PIN = ob1.nextInt();
			if (PIN==1234) {
				System.out.println("Select the Account\n1. Savings\n2. Current ");
				int A=ob1.nextInt();
				if(A==1) {
					Saving ob2=new Saving();
				ob2.Withdraw();
			}
	
	
}}}
