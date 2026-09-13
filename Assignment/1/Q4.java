class Q4{
	public static void main(String[] args){
		System.out.println("================================================");

		double price1=1400, profit1=20;
		printTotalPriceAfterProfit(price1, profit1);

		System.out.println("================================================");
	}	

	public static void printTotalPriceAfterProfit(double price1, double profit1){

		double TotalPriceAfterProfit = price1*(100+profit1)/100 ;

		System.out.println("TotalPriceAfterProfit Price  of " + " price " + price1+ " And Profit "+ profit1 + " is " + TotalPriceAfterProfit);
	}
	
}