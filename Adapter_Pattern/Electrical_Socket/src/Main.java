public class Main {
    public static void main(String[] args) {
        EuropeanSocket euroSocket = new SocketAdapter(new USASocket());

        // Client expects EuropeanSocket interface
        euroSocket.plugIn();
    }
}