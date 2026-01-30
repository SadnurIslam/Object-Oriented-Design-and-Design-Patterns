public class Main {
    public static void main(String[] args) {
        YouTubeChannel channel = new YouTubeChannel();

        Subscriber user1 = new User("Alice");
        Subscriber user2 = new User("Bob");
        Subscriber user3 = new User("Charlie");

        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.subscribe(user3);

        channel.uploadVideo("Observer Pattern Explained");

        channel.unsubscribe(user2);

        channel.uploadVideo("Design Patterns in Java");
    }
}