abstract class SupportHandler {
    protected SupportHandler nextHandler;

    // Set next handler in the chain
    public void setNextHandler(SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // Handle the request
    public abstract void handleRequest(SupportRequest request);
}