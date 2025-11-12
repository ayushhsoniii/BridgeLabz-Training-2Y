import java.util.*;

class Vehicle {}
class Truck extends Vehicle { public String toString() { return "Truck"; } }
class Bike extends Vehicle { public String toString() { return "Bike"; } }

class FleetManager<T extends Vehicle> {
    List<T> fleet = new ArrayList<>();
    void addVehicle(T v) { fleet.add(v); }
    void showFleet() { fleet.forEach(System.out::println); }

    public static void main(String[] args) {
        FleetManager<Truck> fm = new FleetManager<>();
        fm.addVehicle(new Truck());
        fm.showFleet();
    }
}

