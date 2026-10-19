public class Movie {
    private String title;
    private String genre;
    private int rating;

    public Movie(String title, String genre, int rating) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
    }

    public void recommend() {
        if (rating > 7) {
            System.out.println("We recommend watching " + title + " (" + genre + ")");
        } else {
            System.out.println(title + " might not be a good choice");

        }

    }
}