class Stationary{
static  String storeItems[] = {null,null,null,null,null,null,};
static int index;

public static boolean add(String item){
	boolean isAdded= false;
	if(item!=null){
		storeItems[index]=item;
		index++;
		isAdded =true;
	}
	else{
		System.out.println("cant add ");
	}
	return isAdded;
}

public static void getItemsnames(){
	for(int i=0; i<storeItems.length;i++){
		String reff = storeItems[i];
		System.out.println(reff);
	}
}
public  static boolean update(String existName,String newName){
	boolean isUpdated=false;
	for(int index=0;index<storeItems.length;index++){
		if(storeItems[index].equals(existName)){
			storeItems[index]=newName;
			isUpdated=true;
		}
	}
	return isUpdated;
}
public static int delete(String deteteName){
	int index;
	int noOfelements=storeItems.length;
	for(index=0;index<storeItems.length;index++){
		if(storeItems[index].equals(deteteName)){
			break;
		}
	}
if(index < noOfelements){
		noOfelements=noOfelements-1;
		for(int ix=index;ix<noOfelements;ix++){
			storeItems[ix]=storeItems[ix+1];
		}
	}
	return noOfelements;
}
public static void getAfterdelete(int newlength){
	for(int j=0;j<newlength;j++){
		String refference = storeItems[j];
		System.out.println(refference);
	}
}

// returns specific item name(String) 
public static String getItemsByName(String itemName){
	String sName =null;
	for(String name :storeItems){
		if(name.equals(itemName)){
			sName= name;
			System.out.println("the item  is available");
		}	
	return sName;
}
}