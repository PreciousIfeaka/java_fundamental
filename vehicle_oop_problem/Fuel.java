package vehicle_oop_problem;

public class Fuel {
  private String name;
  private double fuelEfficiency;

  public Fuel(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setFuelEfficiency(double distance, double fuelAmount) {
    this.fuelEfficiency = fuelAmount / distance;
  }

  public String getName() {
    return name;
  }

  public double getFuelEfficiency() {
    return fuelEfficiency;
  }

  @Override
  public String toString() {
    return "(Fuel type: " + name + ", fuel efficiency: " + fuelEfficiency + "gallons/mile)";
  }
}
