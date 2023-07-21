class Umbrella{
    String brand;
    String color;
    int size;

    public void open() {
        System.out.println("Opening the " + color + " " + brand + " umbrella.");
    }

    public void close() {
        System.out.println("Closing the " + color + " " + brand + " umbrella.");
    }

    public static void main(String[] args) {
        Umbrella umbrella1 = new Umbrella();
        umbrella1.brand = "GustBuster";
        umbrella1.color = "Black";
        umbrella1.size = 42;
        umbrella1.open();

        Umbrella umbrella2 = new Umbrella();
        umbrella2.brand = "Totes";
        umbrella2.color = "Navy Blue";
        umbrella2.size = 36;
        umbrella2.open();

        Umbrella umbrella3 = new Umbrella();
        umbrella3.brand = "Fulton";
        umbrella3.color = "Red";
        umbrella3.size = 48;
        umbrella3.open();

        Umbrella umbrella4 = new Umbrella();
        umbrella4.brand = "ShedRain";
        umbrella4.color = "Yellow";
        umbrella4.size = 60;
        umbrella4.open();

        Umbrella umbrella5 = new Umbrella();
        umbrella5.brand = "Blunt";
        umbrella5.color = "Gray";
        umbrella5.size = 50;
        umbrella5.open();

        Umbrella umbrella6 = new Umbrella();
        umbrella6.brand = "GustBuster";
        umbrella6.color = "Blue";
        umbrella6.size = 42;
        umbrella6.open();

        Umbrella umbrella7 = new Umbrella();
        umbrella7.brand = "Totes";
        umbrella7.color = "Pink";
        umbrella7.size = 36;
        umbrella7.open();

        Umbrella umbrella8 = new Umbrella();
        umbrella8.brand = "Fulton";
        umbrella8.color = "Green";
        umbrella8.size = 48;
        umbrella8.open();

        Umbrella umbrella9 = new Umbrella();
        umbrella9.brand = "ShedRain";
        umbrella9.color = "Purple";
        umbrella9.size = 60;
        umbrella9.open();

        Umbrella umbrella10 = new Umbrella();
        umbrella10.brand = "Blunt";
        umbrella10.color = "Orange";
        umbrella10.size = 50;
        umbrella10.open();
    }
}
