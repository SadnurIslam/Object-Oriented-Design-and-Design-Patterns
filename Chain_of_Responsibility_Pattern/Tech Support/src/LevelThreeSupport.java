class LevelThreeSupport extends SupportHandler {
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType().equalsIgnoreCase("Complex")) {
            System.out.println("Level 3 Support handled request: " + request.getDescription());
        } else {
            System.out.println("Request could not be handled: " + request.getDescription());
        }
    }
}