public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean garage;
    private boolean garden;
    private boolean swimmingPool;

    // Constructor for Builder
    public House(String foundation, String structure, String roof,
                 boolean garage, boolean garden, boolean swimmingPool) {
        this.foundation = foundation;
        this.structure = structure;
        this.roof = roof;
        this.garage = garage;
        this.garden = garden;
        this.swimmingPool = swimmingPool;
    }

    public void showHouse() {
        System.out.println("House Details:");
        System.out.println("Foundation: " + foundation);
        System.out.println("Structure: " + structure);
        System.out.println("Roof: " + roof);
        System.out.println("Garage: " + (garage ? "Yes" : "No"));
        System.out.println("Garden: " + (garden ? "Yes" : "No"));
        System.out.println("Swimming Pool: " + (swimmingPool ? "Yes" : "No"));
    }
}