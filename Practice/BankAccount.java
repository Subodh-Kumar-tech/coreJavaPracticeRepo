class BankAccount{


double totalBalance;



	public void deposite(double amount){

		if(amount<=0){
			System.out.println("Invalid Input");
			return;
			


		}	

		System.out.println("Amount Deposite Successfully "+amount);
		totalBalance+=amount;

		
	

	}	

	public void withdraw(double amount){

	if(amount>totalBalance){
	
		System.out.println("Invalid Input");
		return;
	
	}


	System.out.println("Amount withdraw successfully " + amount);
	totalBalance-=amount;

	}


	public void checkBalance(){


		System.out.println("Total Balance : " + totalBalance);




	}






}
