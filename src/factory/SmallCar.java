package factory;

public class SmallCar extends Car {
    SmallCar() {
        super(CarType.SMALL);
        construct();
    }
    protected void construct() {
    }
}