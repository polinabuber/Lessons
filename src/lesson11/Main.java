package lesson11;

public class Main {

    public static void main(String[] args) {
        CarDriving[] cars = {
                new KiaRio(),
                new RenaultLogan(),
                new VwPolo()
        };

        FleetManager fleetManager = new FleetManager();
        fleetManager.setCarDrivings(cars);
        fleetManager.driveAll();

        fleetManager.setCarDrivings(new CarDriving[]{
                new CarDriving() {
                    private int km;

                    @Override
                    public int drive(int distance) {
                        return km += distance;
                    }
                }
        });


        MachineDriver driver = new MachineDriver();
        driver.setMachine(new VwPolo());
        driver.startDriving();

        RenaultLogan renaultLogan = new RenaultLoganKupe();
        driver.setMachine(renaultLogan);
        driver.startDriving();

        renaultLogan.startEngine("123456", 15, true);
        renaultLogan.startEngine("123456");

    }
}
