class DigitalCamera {
static	String brand ;
static        String model ;
 static String color ;
   static     String resolution ;
  static      double price ;
    public static void main(String[] args) {
         brand = "Canon";
         model = "EOS 80D";
         color = "Black";
         resolution = "24.2 megapixels";
        price = 1099.99;

        System.out.println("Digital Camera brand: " + brand);
        System.out.println("Digital Camera model: " + model);
        System.out.println("Digital Camera color: " + color);
        System.out.println("Digital Camera resolution: " + resolution);
        System.out.println("Digital Camera price: $" + price);
    }
}
