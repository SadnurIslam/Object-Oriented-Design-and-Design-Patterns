class SocketAdapter implements EuropeanSocket {
    private USASocket usaSocket;

    public SocketAdapter(USASocket usaSocket) {
        this.usaSocket = usaSocket;
    }

    @Override
    public void plugIn() {
        System.out.println("Adapter converts 110V to 220V");
        usaSocket.plugInUSA();
    }
}