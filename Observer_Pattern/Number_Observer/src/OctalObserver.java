class OctalObserver implements Observer {

    @Override
    public void update(int state) {
        System.out.println("Octal: " + Integer.toOctalString(state));
    }
}
