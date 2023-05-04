package lesson15;

import lesson4.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Parking {

    public static final int MAX_PARKING_SIZE = 20;

    Map<ParkingTicket, String> parkingTickets = new HashMap<>();
    private final List<Car> cars = new ArrayList<>(0);

    public Parking() {

    }

    public List<Car> getCars() {
        return List.copyOf(cars);
    }

    public void setCars(List<Car> cars) {
        if (cars != null && cars.size() > 0)
            this.cars.addAll(cars);
        // this.cars = cars;
    }

    public ParkingTicket park(Car car) {
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null");
        }

        if (cars.size() >= MAX_PARKING_SIZE) {
            throw new IllegalStateException("No parking places");
        }

        ParkingTicket ticket = new ParkingTicket();
        parkingTickets.put(ticket, car.getPlateNumber());
        this.cars.add(car);
        return ticket;
    }

    public String checkCarOnParking(ParkingTicket ticket) {
        return parkingTickets.get(ticket);
    }
}
