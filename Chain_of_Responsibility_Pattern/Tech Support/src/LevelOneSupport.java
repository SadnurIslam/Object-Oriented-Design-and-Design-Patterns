class LevelOneSupport extends SupportHandler {
    @Override
    public void handleRequest(SupportRequest request) {
        if (request.getType().equalsIgnoreCase("Simple")) {
            System.out.println("Level 1 Support handled request: " + request.getDescription());
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}