public class Player {
    private String playerName;
    private String team;
    private int score;

public Player(String playerName, String team, int score) {
    this.playerName = playerName;
    this.team = team;
    this.score = score;
}

public void printInfo() {

    System.out.println("Player " + playerName + ", Team: " + team + ", Score: " + score);
}

}
