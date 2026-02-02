public class Main {
    public static void main(String[] args) {

        Subject subject = new NumberSubject();

        Observer binary = new BinaryObserver();
        Observer octal = new OctalObserver();

        subject.attach(binary);
        subject.attach(octal);

        System.out.println("Setting state = 15");
        ((NumberSubject) subject).setState(15);

        System.out.println("\nSetting state = 10");
        ((NumberSubject) subject).setState(10);

        subject.detach(octal);
        System.out.println("\nSetting state = 8");
        ((NumberSubject) subject).setState(8);
    }
}
