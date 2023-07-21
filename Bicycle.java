class Bicycle {
static	String brand;
 static       String model;
 static       int year ;
 static       String color ;
 static       double price ;
    public static void main(String[] args) {
         brand = "Trek";
         model = "FX 3";
         year = 2023;
         color = "Matte Black";
         price = 79988.99;

        System.out.println("Bicycle brand: " + brand);
        System.out.println("Bicycle model: " + model);
        System.out.println("Bicycle year: " + year);
        System.out.println("Bicycle color: " + color);
        System.out.println("Bicycle price: $" + price);
    }
}
