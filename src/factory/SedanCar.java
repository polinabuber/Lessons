package factory;

public class SedanCar extends Car {
    SedanCar(){
        super(CarType.SEDAN);
        construct();
    }

    protected void construct() {
    }
}