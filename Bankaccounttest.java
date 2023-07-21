class Bankaccounttest{
	public static void main(String []args){
		Bankaccount.credit(300);
		Bankaccount.credit(600);
		Bankaccount.credit(200);
		double currentbalance=Bankaccount.getbalance();
		System.out.println("the total  balance amount is;"+currentbalance);
        Bankaccount.debit(350);		
        Bankaccount.debit(500);		
        Bankaccount.debit(500);		
        Bankaccount.debit(600);		
        double currentbalance1=Bankaccount.getbalance();
           System.out.println("the total balance is:"+currentbalance1);
		   
		   Bankaccount.credit(5000);
		   Bankaccount.debit(2000);
		   Bankaccount.debit(3251);
		   
        double currentbalance2=Bankaccount.getbalance();
System.out.println("the total balance is:"+currentbalance2);		
	}
}