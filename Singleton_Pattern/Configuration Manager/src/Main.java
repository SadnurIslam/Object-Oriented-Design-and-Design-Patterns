public class Main{
    public static void main(String[] args) {
        ConfigManager conf1 = ConfigManager.getInstance();
        ConfigManager conf2 = ConfigManager.getInstance();

        System.out.println(conf1.getConfig());
        conf2.setConfig("Updated Configuration");
        System.out.println(conf1.getConfig()); // Updated Configuration
        System.out.println(conf1 == conf2); // true
    }
}