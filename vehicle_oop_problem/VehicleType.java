package vehicle_oop_problem;

public class VehicleType extends Vehicle {
  private String name;
  private Fuel fuelType;
  private Driver driver;

  public VehicleType(String name, Fuel fuelType, Driver driver) {
    this.name = name;
    this.driver = driver;
    this.fuelType = fuelType;
  }

  public VehicleType(String name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public String getFuelType() {
    return fuelType.toString();
  }

  public String getDriver() {
    return driver.toString();
  }

  @Override
  public void startVehicle() {
    System.out.println(name + "has started moving.");
  }

  @Override
  public void stopVehicle() {
    System.out.println(name + "Vehicle has stopped.");
  }

  @Override
  public String toString() {
    return "Vehicle: " + name + ".\nDriver: " + driver.toString() + ".\nFuel: " + fuelType.toString();
  }
}
