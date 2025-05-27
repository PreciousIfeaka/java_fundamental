package vehicle_oop_problem;

interface VehicleInterface {
  void startVehicle();
  void stopVehicle();
}

public class Vehicle implements VehicleInterface {
  public void startVehicle() {
    System.out.println("Vehicle is currently in motion");
  }

  public void stopVehicle() {
    System.out.println("Vehicle has stopped");
  }
}