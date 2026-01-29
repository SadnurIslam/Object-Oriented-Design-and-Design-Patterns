public class FactoryDemo {
    public static void main(String[] args) {

        Notification notification =
                NotificationFactory.createNotification("SMS");

        notification.notifyUser();
    }
}
