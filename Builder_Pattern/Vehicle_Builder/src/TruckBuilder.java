class TruckBuilder implements VehicleBuilder {
    private Vehicle truck = new Vehicle();

    public void buildEngine() {
        truck.setEngine("Truck Engine V8");
    }

    public void buildWheels() {
        truck.setWheels(6);
    }

    public void buildGPS() {
        truck.setGPS(false);
    }

    public Vehicle getVehicle() {
        return truck;
    }
}
