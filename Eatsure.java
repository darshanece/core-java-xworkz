class Eatsure{
 
 public static double search(String foodName){
	 if("rotti"==foodName){
		 System.out.println("i searched one food i.e, :"+foodName);
		 return 65.0; 
	 }
	 if("halka pulka"==foodName){
		 System.out.println("i searched one food i.e, :"+foodName);
		 return 165.0; 
	 }
	 if("dal"==foodName){
		 System.out.println("i searched one food i.e, :"+foodName);
		 return 65.0; 
	 }
	 if("dal makhani"==foodName){
		 System.out.println("i searched one food i.e, :"+foodName);
		 return 85.0; 
	 }
	 if("tanduri"==foodName){
		 System.out.println("i searched one food i.e, :"+foodName);
		 return 755.0; 
	 }
	 if("chole bhature"==foodName){
		 System.out.println("i searched one food i.e, :"+foodName);
		 return 65.0; 
	 }
	 if("butter chicken"==foodName){
		 System.out.println("i searched one food i.e, :"+foodName);
		 return 65.0; 
	 }
	 if("butter rotti"==foodName){
		 System.out.println("i searched one food i.e, :"+foodName);
		 return 65.0; 
	 }
	 if("maagi rotti"==foodName){
		 System.out.println("i searched one food i.e, :"+foodName);
		 return 65.0; 
	 }
	 if("chana masala"==foodName){
		 System.out.println("i searched one food i.e, :"+foodName);
		 return 465.0; 
	 }
	 if("palak panner"==foodName){
		 System.out.println("i searched one food i.e, :"+foodName);
		 return 965.0; 
	 }
	 if("korma"==foodName){
		 System.out.println("i searched one food i.e, :"+foodName);
		 return 658.0; 
	 }
	 if("rajma"==foodName){
		 System.out.println("i searched one food i.e, :"+foodName);
		 return 265.0; 
	 }
	 if("veg corn soup"==foodName) {
		 System.out.println("i searched another food i.e,:"+foodName);
		 return 80.0;
	 }
	 if("tava sweet"==foodName){
		 System.out.println("i searched another food i.e,:"+foodName);
		 return 65;
	 }
	 if("coconut chutney"==foodName){
		 System.out.println("i searched another food i.e,:"+foodName);
		 return 95;
	 }
	 if("chala mirchi"==foodName){
		 System.out.println("i searched another food i.e,:"+foodName);
		 return 100;
	 }
	 if("carrot alva"==foodName){
		 System.out.println("i searched another food i.e,:"+foodName);
		 return 65.0;
	 }
	 if("uppitu"==foodName){
		 System.out.println("i searched another food i.e,:"+foodName);
		 return 99.0;
	 }
	 if("batora"==foodName){
		 System.out.println("i searched another food i.e,:"+foodName);
		 return 66.0;
	 }
	 return 0.0;
 }
public static double search(String foodName,int quantity){
	 if("rotti"==foodName){
		 
		 return 65.0*quantity; 
	 }
	 if("halka pulka"==foodName){
		
		 return 165.0*quantity; 
	 }
	 if("dal"==foodName){
		 
		 return 65.0*quantity; 
	 }
	 if("dal makhani"==foodName){
		 
		 return 85.0*quantity; 
	 }
	 if("tanduri"==foodName){
		 
		 return 755.0*quantity; 
	 }
	 if("chole bhature"==foodName){
		 
		 return 65.0*quantity; 
	 }
	 if("butter chicken"==foodName){
		 
		 return 65.0*quantity; 
	 }
	 if("butter rotti"==foodName){
		 
		 return 65.0*quantity; 
	 }
	 if("maagi rotti"==foodName){
		 
		 return 65.0*quantity; 
	 }
	 if("chana masala"==foodName){
		 
		 return 465.0*quantity; 
	 }
	 if("palak panner"==foodName){
		 
		 return 965.0*quantity; 
	 }
	 if("korma"==foodName){
		 
		 return 658.0*quantity; 
	 }
	 if("rajma"==foodName){
		 
		 return 265.0*quantity; 
	 }
	 if("veg corn soup"==foodName) {
		 
		 return 80.0*quantity;
	 }
	 if("tava sweet"==foodName){
		 
		 return 65*quantity;
	 }
	 if("coconut chutney"==foodName){
		 
		 return 95*quantity;
	 }
	 if("chala mirchi"==foodName){
		 
		 return 100*quantity;
	 }
	 if("carrot alva"==foodName){
		 
		 return 65.0*quantity;
	 }
	 if("uppitu"==foodName){
		 
		 return 99.0*quantity;
	 }
	 if("batora"==foodName){
		 
		 return 66.0*quantity;
	 }
	 return 0.0*quantity;
 }
}