class MNchats{
	public static void main(String args[]){
		
 String chatNames[]={"dhi puri","pani puri","masala puri"};
 //invoke logic methods
 //arguments
getchatNames(chatNames);

}
public static void getchatNames(String chatNames[]){
	System.out.println(" inside getchatNames:");
	for(String chatName:chatNames){
		System.out.println(chatName);
	}	
}
}