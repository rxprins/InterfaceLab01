package prins.riana.InterfaceLab1;

/**
 * Created by rianaprins on 2/4/16.
 */ public class Buggy extends Car implements Driveable {
    private int fuelLevel;


    public void drive() {
        if (turnedOn == true) {
            int fuel = getFuelLevel();
            fuel -=3;
            setCurrLevel(fuel);
        } else {
            System.out.println("Sorry, the horses are tired. Try again later");
        }
    }
}

