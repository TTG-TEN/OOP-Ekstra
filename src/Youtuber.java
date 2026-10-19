public class Youtuber {
private String channelName;
private int subscribers;
private String niche;


public Youtuber(String channelName, String niche, int subscribers) {
    this.channelName = channelName;
    this.niche = niche;
    this.subscribers = subscribers;

}

    public String getChannelName() {
        return channelName;
    }

    public int getSubscribers() {
        return subscribers;
    }

    public String getNiche() {
        return niche;
 }

public void displayYoutubers() {
    System.out.println(channelName + " | Subscribers " + subscribers + "  | niche: " + niche);

}

}
