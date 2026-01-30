class Vehicle {
    private String engine;
    private int wheels;
    private boolean gps;

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setGPS(boolean gps) {
        this.gps = gps;
    }

    public void showVehicle() {
        System.out.println("Vehicle details:");
        System.out.println("Engine: " + engine);
        System.out.println("Wheels: " + wheels);
        System.out.println("GPS: " + (gps ? "Yes" : "No"));
    }
}
