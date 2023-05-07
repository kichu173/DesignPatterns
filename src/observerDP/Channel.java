package observerDP;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private String channelName;
    private List<Observer> list = new ArrayList<>();// to maintain a mapping between the subscribers and the channel in the YouTube db.

    public Channel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Observer observer) {
        list.add(observer);
    }

    @Override
    public void unsubscribe(Observer observer) {
        list.remove(observer);
    }

    @Override
    public void notifyAllObserver(String message) {
        for (Observer observer : list) {
            observer.update(message);
        }
    }

    public void videoUpload(String message) {// Once we upload a new video to our YouTube channel, we can notify all subscribers with the message.
        notifyAllObserver(message);
    }
}
