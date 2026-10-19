public class FitnessApp {
private String userName;
private int stepsToday;
int caloriesBurned;


public FitnessApp(String userName, int stepsToday, int caloriesBurned) {
    this.userName = userName;
    this.caloriesBurned = caloriesBurned;
    this.stepsToday = stepsToday;
}

public void addSteps(int steps) {
  this.stepsToday += steps;

}
public void calculateSteps() {
    this.caloriesBurned = (int) (stepsToday * 0.04);

}
public void displaySteps() {
    System.out.println(userName + " - Steps: " + stepsToday + ", Calories burned: " + caloriesBurned);

}
}
