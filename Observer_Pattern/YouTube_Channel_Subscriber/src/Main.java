public class Main {
    public static void main(String[] args) {

        Subject channel = new YouTubeChannel();

        Observer sub1 = new Subscriber("Alice");
        Observer sub2 = new Subscriber("Bob");
        Observer sub3 = new Subscriber("Charlie");

        channel.attach(sub1);
        channel.attach(sub2);
        channel.attach(sub3);

        ((YouTubeChannel) channel).uploadVideo("Observer Pattern Explained");

        channel.detach(sub2);

        ((YouTubeChannel) channel).uploadVideo("Design Patterns in Java");
    }
}
