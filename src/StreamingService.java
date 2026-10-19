public class StreamingService {
    private String serviceName;
    private int subscriptionPrice;
    private int totalShows;


    public StreamingService(String serviceName, int subscriptionPrice, int totalShows) {
        this.serviceName = serviceName;
        this.subscriptionPrice = subscriptionPrice;
        this.totalShows = totalShows;
    }

    public String getServiceName() {
        return serviceName;
    }

    public int getSubscriptionPrice() {
        return subscriptionPrice;
    }

    public int getTotalShows() {
        return totalShows;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public void setSubscriptionPrice(int subscriptionPrice) {
        this.subscriptionPrice = subscriptionPrice;
    }

    public void setTotalShows(int totalShows) {
        this.totalShows = totalShows;
    }

}
