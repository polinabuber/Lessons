package lesson11;

public class VwPolo  extends Machine implements CarDriving {

    public VwPolo() {
        setBrandName("Vw Polo");
    }
    @Override
    public void startEngine() {
        System.out.println(getBrandName()+" start engine");

    }
    private int kilometers;

    public int drive(int kilometer) {

        kilometers += kilometer;
        System.out.println(getBrandName()+" goes: " + kilometer + " total: " + kilometers);
        return kilometers;
    }
}
