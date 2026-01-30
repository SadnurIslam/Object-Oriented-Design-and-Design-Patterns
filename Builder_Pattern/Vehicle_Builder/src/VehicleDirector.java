class VehicleDirector {
    private VehicleBuilder builder;

    public VehicleDirector(VehicleBuilder builder) {
        this.builder = builder;
    }

    public void constructVehicle() {
        builder.buildEngine();
        builder.buildWheels();
        builder.buildGPS();
    }

    public Vehicle getVehicle() {
        return builder.getVehicle();
    }
}
