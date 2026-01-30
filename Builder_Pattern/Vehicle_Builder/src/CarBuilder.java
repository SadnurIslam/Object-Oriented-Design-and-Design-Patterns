class CarBuilder implements VehicleBuilder {
    private Vehicle car = new Vehicle();

    public void buildEngine() {
        car.setEngine("Car Engine V6");
    }

    public void buildWheels() {
        car.setWheels(4);
    }

    public void buildGPS() {
        car.setGPS(true);
    }

    public Vehicle getVehicle() {
        return car;
    }
}
