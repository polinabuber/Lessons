package factory;

public abstract class Car {
    public Car(CarType model) {
        this.model = model;
    }

    protected abstract void construct();

    private CarType model;

    public CarType getModel() {
        return model;
    }

    public void setModel(CarType model) {
        this.model = model;
    }
}