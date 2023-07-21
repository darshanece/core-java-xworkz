class MixiTest{
public static void main(String  [] args){
	System.out.println("the mixer name is:"+Mixer.mixiName);
	System.out.println("the price of the device is :$"+Mixer.price);
   boolean isOn =Mixer.onOroff();
   Mixer.increseSpeed();
   Mixer.increseSpeed();
   Mixer.increseSpeed();
   Mixer.increseSpeed();
   Mixer.increseSpeed();
	boolean isOn1 =  Mixer.onOroff();
	Mixer.decreseSpeed();
	Mixer.decreseSpeed();
	Mixer.decreseSpeed();
	Mixer.decreseSpeed();
	Mixer.decreseSpeed();
}
}



}