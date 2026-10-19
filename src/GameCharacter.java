public class GameCharacter {
    private String movement;


    public GameCharacter(String movement) {

        this.movement = movement;
    }

    public void setMovement(String movement) {
        this.movement = movement;
    }

    public void characterMovement() {
        switch (movement) {

            case "UP":
                System.out.println("Character moves up");
                 break;
            case "DOWN":
                System.out.println("Character moves down");
                break;
            case "LEFT":
                System.out.println("Character moves to the left");
                break;
            case "RIGHT":
                System.out.println("Character moves to the right");
                break;
            default:
                System.out.println("Not a valid movement");
        }
    }

}
