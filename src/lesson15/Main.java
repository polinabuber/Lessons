package lesson15;

import lesson4.Car;


public class Main {
    public static void main(String[] args) {

        try {
            Parking parking = new Parking();
            //add new car to parking

            ParkingTicket ticket1 = parking.park(new Car(20_000));
            ParkingTicket ticket2 = parking.park(new Car(30_000));


            for (Car car : parking.getCars()) {
                System.out.println(car);
            }

            ParkingTicket ticket3 = new ParkingTicket();

            System.out.println(parking.checkCarOnParking(ticket1));
            System.out.println(parking.checkCarOnParking(ticket2));
            System.out.println(parking.checkCarOnParking(ticket3));
            System.out.println(1/0);
        } catch (Exception e) {
            e.printStackTrace(); //print to log file
            System.exit(1); //error status
        } finally {
            System.exit(0); //normal exit
        }
    }
}
