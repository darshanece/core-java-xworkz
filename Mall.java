class Mall{
static String vegatables[] = {"tomato","potato","carrot","onion", "drumstick" ,"cucumber", "bringal"}; 

static  String biscuits[] = {"gooday","hide&seak","parle G","sunfeast","happy-happy","50-50","20-20" };

static String perfumes[] = {"park avenue","denver","brut","fogg","set wet","Z","neo" };
 public static void main(String args[]){
	
	 //invoke logic(methods)
   getVegatables();
   getBiscuits();
   getPerfumes();
 }
 
 // read ,get, feath 
 public static void getVegatables(){
   System.out.println("the vegatables are:");
 for(String vegatable:vegatables){
	System.out.println(vegatable);
 }
 }
 public static void getBiscuits(){
 System.out.println("the biscuits are:")	;
	for(String biscuit:biscuits){
	System.out.println(biscuit);
	}
 }
 public static void getPerfumes(){
	System.out.println("the perfumes are:");
	for(String perfume:perfumes){
	System.out.println(perfume);
 }
 }
}
 	 
	 
 
 
