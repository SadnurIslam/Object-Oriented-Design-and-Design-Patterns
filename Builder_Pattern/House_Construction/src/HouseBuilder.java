public class HouseBuilder {
    private String foundation;
    private String structure;
    private String roof;
    private boolean garage;
    private boolean garden;
    private boolean swimmingPool;

    // Required fields constructor
    public HouseBuilder(String foundation, String structure, String roof) {
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
    }

    // Optional fields
    public HouseBuilder setGarage(boolean garage) {
        this.garage = garage;
        return this;
    }

    public HouseBuilder setGarden(boolean garden) {
        this.garden = garden;
        return this;
    }

    public HouseBuilder setSwimmingPool(boolean swimmingPool) {
        this.swimmingPool = swimmingPool;
        return this;
    }

    // Build method
    public House build() {
        return new House(foundation, structure, roof, garage, garden, swimmingPool);
    }
}