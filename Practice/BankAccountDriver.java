import java.util.Scanner;

class BankAccountDriver{


	public static void main(String[] args){

	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Deposite Amount : ");
	double amount1= sc.nextDouble();

	double amount2 = Double.parseDouble(IO.readln("Enter withdraw amount : "));

	BankAccount acc1 = new BankAccount();

	acc1.deposite(amount1);
	acc1.withdraw(amount2);
	acc1.checkBalance();
	
	}




}
