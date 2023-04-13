package lesson11;

public class RenaultLogan extends Machine implements CarDriving {

    public RenaultLogan() {
       this("Renault Logan");
    }

    public RenaultLogan(String brand) {
        setBrandName(brand);
        //...
    }

    @Override
    public void startEngine() {
        startEngine("", 0, false);
    }


    //Method overloading(переггрузка)
    public void startEngine(String key) {
        startEngine(key, 0, false);
    }

    public void startEngine(String key, int delay, boolean remote) {
        System.out.println(getBrandName() + " start engine ");
        if (key != null && !key.equals("")) {
            System.out.print("with " + key);
        }
        if (delay != 0) {
            System.out.print(" delay " + delay);
        }
        if (remote) {
            System.out.println(" remotely");
        }
    }

    private int mileage;

    public int drive(int km) {
        mileage += km;
        System.out.println(getBrandName() + " runs distance: " + km + " mileage: " + mileage);
        return mileage;
    }
}
