class BinaryObserver implements Observer {

    @Override
    public void update(int state) {
        System.out.println("Binary: " + Integer.toBinaryString(state));
    }
}
