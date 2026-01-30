import java.util.ArrayList;
import java.util.List;

class YouTubeChannel implements Channel {
    private List<Subscriber> subscribers = new ArrayList<>();
    private String latestVideo;

    @Override
    public void subscribe(Subscriber sub) {
        subscribers.add(sub);
    }

    @Override
    public void unsubscribe(Subscriber sub) {
        subscribers.remove(sub);
    }

    public void uploadVideo(String title) {
        this.latestVideo = title;
        notifySubscribers();
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber sub : subscribers) {
            sub.update(latestVideo);
        }
    }
}