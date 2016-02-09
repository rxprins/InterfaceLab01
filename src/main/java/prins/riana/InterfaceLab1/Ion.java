package prins.riana.InterfaceLab1;

/**
 * Created by rianaprins on 2/4/16.
 */
public class Ion extends Car implements Driveable {
    private int fuelLevel;

    public void drive() {
        if (turnedOn == true) {
            int fuel = getFuelLevel();
            fuel -=15;
            setCurrLevel(fuel);
        } else {
            System.out.println("Not charged");
        }
    }
}

