class Instagram{
	public static boolean login(String userID,String password){
		boolean isLogedIn=false;
			if(userID=="ismart_darshan" & password=="A6h9a6h8"){
		        isLogedIn=true;
		        System.out.println("Succusfully loged in with userID and Password ");
			}
		    else{
			    System.out.println("Invalid email or password!");
		    }
		return isLogedIn;
	}
	public static boolean login(long mobileNo , String password){
		boolean isLogedIn=false;
			if(mobileNo==9108623330L & password=="A6h9a6h8"){
			 isLogedIn=true;
			 System.out.println("Succusfully loged in with Mobile Number and Password");
		    }else{
			System.out.println("Invalid mobile no. or password!");
			}
		
	  return isLogedIn ;
	}
}