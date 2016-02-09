package prins.riana.InterfaceLab1;

import java.util.ArrayList;

/**
 * Created by rianaprins on 2/4/16.
 */
public class App {
    ArrayList<Car> cars;

    public static void main (String [] args) {

        Car ion = new Ion();
        ion.setFuelLevel(100);
        ion.turnOn();
        ion.drive();
        ion.drive();
        ion.turnOff();
        ion.refuel();

        Car buggy = new Buggy();

        buggy.setFuelLevel(7);
        buggy.turnOn();
        buggy.drive();
        buggy.turnOff();
        buggy.refuel();

    }

}

