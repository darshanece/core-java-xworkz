class Add{

	public static int sum(int x, int y) { 
	
	return (x + y);
	}
	public static int sum(int x, int y, int z){
	
	return (x + y + z);
	}

	public static double sum(double x, double y){
	
	return (x + y);
	}
	
public static void main(String args[]){
	    int total= Add.sum(102,208);
		int total1= Add.sum(100,200,500);
		double total2=Add.sum(120.5,130.5);
		System.out.println(total);
		System.out.println(total1);
		System.out.println(total2);
	}
}
