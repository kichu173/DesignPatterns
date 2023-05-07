package observerDP;

public class YouTube {
    public static void main(String[] args) {
        Channel channel = new Channel("Technical Interview");

        User user1 = new User("Rahul");
        User user2 = new User("Ankit");
        User user3 = new User("Testing User");// User who is not subscribed to my channel will not receive notifications when a new video was added.

        channel.subscribe(user1);
        channel.subscribe(user2);

        // upload video to my channel
        channel.videoUpload("Video 1 - My Vlogs");
    }
}
