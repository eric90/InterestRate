import java.util.*;
//import javax.swing.JOptionPane;

public class Interest {
	public static void main(String[] args ){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the balance: ");
		double balance = input.nextDouble();
		System.out.print("Enter the interest rate: ");
		double interestRate = input.nextDouble();
		/*String balanceText = JOptionPane.showInputDialog(null, 
				"Enter the balance:"); 
		double balance = Double.parseDouble(balanceText);
		String interestText = JOptionPane.showInputDialog(null, 
				"Enter the interest rate: ");
		double interestRate = Double.parseDouble(interestText);*/
		double mountlyRate = interestRate / 1200 ;
		double interest = balance * mountlyRate ;
		
		System.out.print("The interest is " + interest);
		//JOptionPane.showMessageDialog(null, "The interest is "+
		//(int)(100* interest) / 100.0);
		
		input.close();
	}

}
