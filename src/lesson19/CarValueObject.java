package lesson19;

import java.math.BigDecimal;

public class CarValueObject {


    private String model;
    private CarColor color;
    private BodyType bodytype;
    private short year;
    private int mileage;
    private String engineType;
    private byte maxSeats;
    private BigDecimal price;

    public CarValueObject() {
    }

    @Override
    public String toString() {
        return "CarValueObject{" +
                "model='" + model + '\'' +
                ", color=" + color +
                ", bodytype=" + bodytype +
                ", year=" + year +
                ", mileage=" + mileage +
                ", engineType='" + engineType + '\'' +
                ", maxSeats=" + maxSeats +
                ", price=" + price +
                '}';
    }

    public CarValueObject(String model, CarColor color, BodyType bodytype, short year, int mileage, String engineType, byte maxSeats, BigDecimal price) {
        this.model = model;
        this.color = color;
        this.bodytype = bodytype;
        this.year = year;
        this.mileage = mileage;
        this.engineType = engineType;
        this.maxSeats = maxSeats;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public CarColor getColor() {
        return color;
    }

    public void setColor(CarColor color) {
        this.color = color;
    }

    public BodyType getBodytype() {
        return bodytype;
    }

    public void setBodyType(BodyType bodytype) {
        this.bodytype = bodytype;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public byte getMaxSeats() {
        return maxSeats;
    }

    public void setMaxSeats(byte maxSeats) {
        this.maxSeats = maxSeats;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
