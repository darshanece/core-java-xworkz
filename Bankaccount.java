class Bankaccount{
static double balance;
static boolean isCredited;
static boolean isDebited;

public static boolean credit(int amount){
	if(amount>=0){
		balance=balance+amount;
		isCredited=true;
		System.out.println("the credited AMt is :"+amount);
	}
	return isCredited;
}
public static boolean debit(int amount){
	if(balance>=amount){
		balance=balance-amount;
		isDebited=true;
		System.out.println("the debited amount is :"+amount);
	}else{
		System.out.println("payment failed[insufficient  balance]");
	}
	return isDebited;
}
public static double getbalance(){
	return balance;
}
}

