package observerDP;

public class User implements  Observer{
    private String userName;

    public User(String userName) {
        this.userName = userName;
    }

    @Override
    public void update(String message) {// User is looking for update from the channel he subscribed.
        System.out.println("Hey, " + this.userName + " checkout the new video uploaded:: " + message);
    }
}
