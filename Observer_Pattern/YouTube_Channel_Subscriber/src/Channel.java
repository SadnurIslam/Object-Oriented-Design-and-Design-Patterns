interface Channel {
    void subscribe(Subscriber sub);
    void unsubscribe(Subscriber sub);
    void notifySubscribers();
}