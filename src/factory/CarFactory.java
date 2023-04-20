package factory;

public class CarFactory {
    public static Car buildCar(CarType model) {
        Car car = null;
        car = new SmallCar();
        car = new SedanCar();
        car = new LuxuryCar();
        return car;
    }
}