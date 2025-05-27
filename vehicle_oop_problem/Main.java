package vehicle_oop_problem;

public class Main {
  public static void main(String[] args) {
    Driver driver = new Driver("Bosun", "NIN Licence", 22);
    Fuel fuel = new Fuel("Diesel");
    fuel.setFuelEfficiency(50, 20);

    VehicleType vehicle = new VehicleType("Motor Cycle", fuel, driver);

    System.out.println(vehicle.toString());
  }
}
