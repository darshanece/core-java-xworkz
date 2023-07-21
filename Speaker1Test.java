class Speaker1Test{
public static void main(String args[]){
	 String name= Speaker1.name;
	boolean connected = Speaker1.onOroff();
	System.out.println("is speaker connected:"+connected);
    Speaker1.increseVolume();
    Speaker1.increseVolume();
    Speaker1.increseVolume();
    Speaker1.increseVolume();
    Speaker1.increseVolume();
	boolean connected1 = Speaker1.onOroff();
	System.out.println("is speaker connected:"+connected1);
	Speaker1.decreseVolume();
	Speaker1.decreseVolume();
	Speaker1.decreseVolume();
	Speaker1.decreseVolume();
	Speaker1.decreseVolume();
	Speaker1.decreseVolume();
		
		
}

}