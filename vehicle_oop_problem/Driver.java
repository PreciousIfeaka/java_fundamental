package vehicle_oop_problem;

public class Driver {
  final String name;
  final String licenseType;
  final int yearsOfExperience;

  public Driver(String name, String licenseType, int yearsOfExperience) {
    this.name = name;
    this.licenseType = licenseType;
    this.yearsOfExperience = yearsOfExperience;
  }

  public String getName() {
    return name;
  }

  public String getLicenseType() {
    return licenseType;
  }

  public int getYearsOfEperience() {
    return yearsOfExperience;
  }

  @Override
  public String toString() {
    return "(Driver's name: " + name + ", license type: " + licenseType + ", years of experience: " + yearsOfExperience + ")";
  }
}
