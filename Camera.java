class Camera {
static	 String brand ;
static        String model ;
static        int year ;
 static       String color ;
 static       double price;
    public static void main(String[] args) {
         brand = "Canon";
        model = "EOS 5D Mark IV";
       year = 2021;
        color = "Black";
         price = 2499.99;

        System.out.println("Camera brand: " + brand);
        System.out.println("Camera model: " + model);
        System.out.println("Camera year: " + year);
        System.out.println("Camera color: " + color);
        System.out.println("Camera price: $" + price);
    }
}
