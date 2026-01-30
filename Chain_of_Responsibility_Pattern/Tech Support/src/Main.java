public class Main {
    public static void main(String[] args) {
        // Create handlers
        SupportHandler level1 = new LevelOneSupport();
        SupportHandler level2 = new LevelTwoSupport();
        SupportHandler level3 = new LevelThreeSupport();

        // Set the chain: L1 → L2 → L3
        level1.setNextHandler(level2);
        level2.setNextHandler(level3);

        // Create requests
        SupportRequest req1 = new SupportRequest("Simple", "Password reset");
        SupportRequest req2 = new SupportRequest("Moderate", "Software installation issue");
        SupportRequest req3 = new SupportRequest("Complex", "Server down");
        SupportRequest req4 = new SupportRequest("Unknown", "Unrecognized issue");

        // Send requests to the chain
        level1.handleRequest(req1);
        level1.handleRequest(req2);
        level1.handleRequest(req3);
        level1.handleRequest(req4);
    }
}