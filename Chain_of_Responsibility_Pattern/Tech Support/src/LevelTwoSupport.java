class LevelTwoSupport extends SupportHandler {
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType().equalsIgnoreCase("Moderate")) {
            System.out.println("Level 2 Support handled request: " + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}