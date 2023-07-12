class StationaryTest{
	
	
public static void main(String []args){
	
	Stationary.add("pen");
	Stationary.add("book");
	Stationary.add("pencil");
	Stationary.add("compass");
	Stationary.add("ink box");
	Stationary.add("whitener");
	Stationary.getItemsnames();
	System.out.println("+++============+++++++++");
	
	Stationary.update("pen","black pen");
	Stationary.update("pencil","pen pencil");
	Stationary.update("compass","protractor");
	Stationary.update("ink box","inkpen");
	Stationary.update("whitener","eraser");
	Stationary.update("book","longbook");
	Stationary.getItemsnames();
	System.out.println("+++============+++++++++");
    int newlength = Stationary.delete("inkpen");
    Stationary.getAfterdelete(newlength);
	 
	
	 String name1 = Stationary.getItemsByName("rubber");
	  
	  System.out.println(name1);
} 
}