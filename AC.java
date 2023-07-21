class AC{
// properties  : int temparature,boolean isOn.
static String name = "LG";
static int mintemp;
static int currenttemp = 20;
static int maxtemp =30;
static boolean isOn;
static double price = 2500.0;
// methods
//turning on the ac:onOroff
 public static boolean onOroff(){
   if(isOn==false){
	   isOn=true;
	   System.out.println("the AC Turned  on .");
   }else if(isOn==true){
	   isOn=false;
	   System.out.println("the AC is Turned on.");
   }
   return isOn;
 }
// increasetemparature : increaseTemp
 public static int  increseTemp(){
	 if(isOn=true){
		 if(currenttemp<maxtemp){
		    currenttemp=currenttemp+1;
       System.out.println("the ac temparature increse to:" +currenttemp+"degree C");	
		 }else{
			 System.out.println("max temparature reached");
		 } 
	 }else{
			 System.out.println("Ac is turned off .please  turn on the  ac to set temparature "); 
	 }
	 
	 return currenttemp;
	 }
 
 //decrese temparatur
 
	 public  static int decreseTemp(){
		 if(isOn=true)
       if(currenttemp>mintemp){
		   currenttemp=currenttemp-1;
		   System.out.println("the ac temparature decrese to:" +currenttemp+" ° C");
	   }else{
		   System.out.println("minimum temp reached");
	   
	 }else{
     System.out.println("ac is turned  off ");	 
 }
 return currenttemp;
 }
 
 
} 

