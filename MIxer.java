class Mixer{
// properties: int speed ;  boolean isOn;
static String mixiName= "pegion";
static int speed ;
static int maxSpeed = 5;
static int currentSpeed ;
static int minSpeed = 1;
static boolean isOn ;
static double price =  5000.0;

// methods
public static boolean onOroff(){
	if(isOn==false){
		isOn= true;
		System.out.println("the  mixer  is on...");
	}else if(isOn==true){
		isOn=  false;
		System.out.println("the mixer is off..");
	}
	return isOn;
}
public static int increseSpeed(){
	if(isOn=true){
		if(currentSpeed<maxSpeed){
			currentSpeed=currentSpeed+1;
			System.out.println("the mixi speed  incresing:");
		}else{
			System.out.println("maximum speed is reached!");
		}else{
			System.out.println("mixi is turned off .please turn on");
		}
	
}
     return currentSpeed;
}
public static int decreseSpeed(){
	if(isOn=true){
		if(currentSpeed>minSpeed){
			currentSpeed=currentSpeed-1;
			System.out.println("the mixi speed is  decresing:");
		}else{
			System.out.println("minimum speed  is reached!");
		}else{
			System.out.println("the mixi is turned off.");
			
		}
	}
	return currentSpeed;
}
}