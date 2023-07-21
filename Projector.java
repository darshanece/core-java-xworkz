class Projector {
    String brand;
    String model;
    int resolution;
    boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println(brand + " " + model + " is turned on.");
    }

    public void turnOff() {
        isOn = false;
        System.out.println(brand + " " + model + " is turned off.");
    }

    public static void main(String[] args) {
        Projector projector1 = new Projector();
        projector1.brand = "Epson";
        projector1.model = "PowerLite Home Cinema 2150";
        projector1.resolution = 1080;
        projector1.turnOn();

        Projector projector2 = new Projector();
        projector2.brand = "BenQ";
        projector2.model = "MH535FHD";
        projector2.resolution = 1080;
        projector2.turnOn();

        Projector projector3 = new Projector();
        projector3.brand = "Optoma";
        projector3.model = "HD146X";
        projector3.resolution = 1080;
        projector3.turnOn();

        Projector projector4 = new Projector();
        projector4.brand = "Sony";
        projector4.model = "VPL-VW295ES";
        projector4.resolution = 4_096;
        projector4.turnOn();

        Projector projector5 = new Projector();
        projector5.brand = "ViewSonic";
        projector5.model = "PX701-4K";
        projector5.resolution = 4_096;
        projector5.turnOn();

        Projector projector6 = new Projector();
        projector6.brand = "LG";
        projector6.model = "HU80KA";
        projector6.resolution = 4_096;
        projector6.turnOn();

        Projector projector7 = new Projector();
        projector7.brand = "Acer";
        projector7.model = "H7850";
        projector7.resolution = 4_096;
        projector7.turnOn();

        Projector projector8 = new Projector();
        projector8.brand = "NEC";
        projector8.model = "NP-ME401W";
        projector8.resolution = 1280;
        projector8.turnOn();

        Projector projector9 = new Projector();
        projector9.brand = "Casio";
        projector9.model = "XJ-UT351W";
        projector9.resolution = 1280;
        projector9.turnOn();

        Projector projector10 = new Projector();
        projector10.brand = "InFocus";
        projector10.model = "IN118BB";
        projector10.resolution = 1280;
        projector10.turnOn();
    }
}
