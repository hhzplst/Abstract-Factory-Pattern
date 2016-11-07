public class KudosComputerStore extends ComputerStore {

  public Computer createComputer(String quality) {
    Computer device = null;
    if (quality.equals("high")) {

      device = new Server(highQualityComponent);
      device.setName("Server from Kudos");

    } else if (quality.equals("medium")) {

      device = new Laptop(mediumQualityComponent);
      device.setName("Laptop from Kudos");

    } else if (quality.equals("low")) {

      device = new Tablet(lowQualityComponent);
      device.setName("Tablet from Kudos");

    }
    return device;
  }
}