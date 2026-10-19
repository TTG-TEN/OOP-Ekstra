public class GamingSetup {
private String monitor;
private String keyboard;
private String mouse;
private int price;



public GamingSetup(String monitor, String keyboard, String mouse, int price) {
    this.keyboard = keyboard;
    this.monitor = monitor;
    this.mouse = mouse;
    this.price = price;
}

    public String getKeyboard() {
        return keyboard;
    }

    public String getMouse() {
        return mouse;
    }

    public String getMonitor() {
        return monitor;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }

    public void setMonitor(String monitor) {
        this.monitor = monitor;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }
public void displayDetails(){
        System.out.println("Monitor: " + monitor);
        System.out.println("Keyboard " + keyboard);
        System.out.println("Mouse " + mouse);
        System.out.println("Price: " + price);
    }

}
