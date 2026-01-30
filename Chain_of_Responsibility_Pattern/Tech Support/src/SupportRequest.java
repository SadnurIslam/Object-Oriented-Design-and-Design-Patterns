class SupportRequest {
    private String type;
    private String description;

    public SupportRequest(String type, String description) {
        this.type = type;
        this.description = description;
    }

    public String getType() { return type; }
    public String getDescription() { return description; }
}