public class Main {
    public static void main(String[] args) {
        // Build a full-featured house
        House house1 = new HouseBuilder("Concrete", "Brick", "Tile Roof")
                .setGarage(true)
                .setGarden(true)
                .setSwimmingPool(true)
                .build();
        house1.showHouse();

        System.out.println();

        // Build a simple house with only required fields
        House house2 = new HouseBuilder("Wood", "Wooden Frame", "Shingle Roof")
                .build();
        house2.showHouse();
    }
}