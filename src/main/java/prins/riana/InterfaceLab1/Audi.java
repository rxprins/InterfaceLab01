package prins.riana.InterfaceLab1;

/**
 * Created by rianaprins on 2/4/16.
 */
public class Audi extends Car implements Driveable {
    private int fuelLevel;

    public void drive() {
        if (turnedOn == true) {
            int fuel = getFuelLevel();
            fuel -= 35;
            setCurrLevel(fuel);
        } else {
            System.out.println("Car is off. You can't drive");
        }
    }
}