public class SmartphoneClock {
private int hours;
private int minutes;
private int seconds;


public SmartphoneClock(int hours, int minutes, int seconds) {
    this.hours = hours;
    this.minutes = minutes;
    this.seconds = seconds;
}

public void countsSeconds(int ticks) {

    for (int i = 0; i < ticks; i++) {
        seconds++;
        if (seconds == 60) {
            seconds = 0;
            minutes++;
        }
    } if (minutes == 60) {
        minutes = 0;
        hours++;
    } if (hours == 24) {
        hours = 0;
    }
    System.out.println(String.format("Time: %02d:%02d:%02d", hours, minutes, seconds));
}
}