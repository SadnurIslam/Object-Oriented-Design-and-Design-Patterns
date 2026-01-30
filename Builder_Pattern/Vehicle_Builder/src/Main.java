public class Main {
    public static void main(String[] args) {
        // Build a car
        VehicleBuilder carBuilder = new CarBuilder();
        VehicleDirector director1 = new VehicleDirector(carBuilder);
        director1.constructVehicle();
        Vehicle car = director1.getVehicle();
        car.showVehicle();

        System.out.println();

        // Build a truck
        VehicleBuilder truckBuilder = new TruckBuilder();
        VehicleDirector director2 = new VehicleDirector(truckBuilder);
        director2.constructVehicle();
        Vehicle truck = director2.getVehicle();
        truck.showVehicle();
    }
}
