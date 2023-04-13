package lesson11;

public class KiaRio extends Machine implements CarDriving {
    public KiaRio() {
        setBrandName("Kia Rio");
    }
    @Override
    public void startEngine() {
        System.out.println(getBrandName()+" start engine");

    }
    private int km;

    public int drive(int distance) {
        km += distance;
        System.out.println(getBrandName()+" drives distance: " + distance + " total: " + km);
        return km;
    }


}
