package prins.riana.InterfaceLab1;

/**
 * Created by rianaprins on 2/4/16.
 */
public abstract class Car {
    public boolean turnedOn;
    private int fuelLevel;
    private int currFuelLevel;

    //set Fuel level
    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
        this.currFuelLevel = fuelLevel;
    }
    //set current level after driving
    public void setCurrLevel(int fuelLevel) {
        this.currFuelLevel = fuelLevel;
    }
    //get the current level
    public int getFuelLevel() {
        return this.currFuelLevel;
    }
    void turnOn() {
        if (this.fuelLevel <= 0) {
            System.out.println("You are out of gas. Please fill up");
        } else {
            turnedOn = true;
        }
    }
    void turnOff() {
        turnedOn = false;
    }

    void refuel() {
        if (turnedOn == true) {
            System.out.println("Turn the car off");
        } else {
            this.currFuelLevel += fuelLevel - currFuelLevel;
        }
    }
    public void drive() {}
}

