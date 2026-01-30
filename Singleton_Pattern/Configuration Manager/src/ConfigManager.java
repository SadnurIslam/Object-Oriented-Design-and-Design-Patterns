class ConfigManager {
    private static ConfigManager instance;
    private String config;

    private ConfigManager() {
        config = "Default Configuration";
        System.out.println("ConfigManager initialized");
    }

    public static ConfigManager getInstance() {
        if(instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String getConfig() {
        return config;
    }

    public void setConfig(String config) {
        this.config = config;
    }
}
