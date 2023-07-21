class Speaker1{
 static String name = "jbl";
static int minVolume ;
static int currentVolume;
static int maxVolume=10;
static boolean isConnected;
//method
public static boolean onOroff(){
	System.out.println("invoking onOroff()");
	System.out.println("parameter :"+0);
	
	if(isConnected == false){
		isConnected=true;
		System.out.println("Speaker is turned on enjoy");
	}else if(isConnected==true){
	  isConnected=false;
	  System.out.println("Speaker is turned off");
	}
	return isConnected;
}

//increseVolume
public static void increseVolume(){
	System.out.println("start of the increse volume");
	if(isConnected=true){
	if(currentVolume<maxVolume){
		currentVolume=currentVolume+1;
		
		System.out.println("the currentVolume is :"+currentVolume);
	}else{
		System.out.println("max volume reached");
	}
}else{
	System.out.println("le spk connect madu firstu");
	
}
System.out.println("end of the increse volume");
}
//decrese volume
public static void decreseVolume(){
	if(isConnected==true){
		if(currentVolume>minVolume){
			currentVolume=currentVolume-1;
			System.out.println("the currentVolume is :"+currentVolume);
		}else{
			System.out.println("min volume reached ");
		}
		}else{
			System.out.println("the spk is turned off");
	}
}
}






















