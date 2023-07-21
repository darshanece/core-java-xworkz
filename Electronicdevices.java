class Electronicdevices{
public static void main(String arg[]){
  String electronicsDevices[]=  {"refrigerator","washing machine","TV","LED","Griender","A C","Ironbox","Micro oven"};
  double priceofDevices[]={50000,25000.32,35000.00,1000.0,12000.52,50000.00,2000.00,10000.00};
  
   System.out.println("the eln devices are :");
   
  for(int i=0;i<electronicsDevices.length;){
   
  System.out.println(electronicsDevices[i]);
  System.out.println("this device price is:");
  System.out.println(priceofDevices[i]);
   i++;
	}  
  }
}

