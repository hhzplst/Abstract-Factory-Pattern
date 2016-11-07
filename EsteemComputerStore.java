public class EsteemComputerStore extends ComputerStore {

  public Computer createComputer(String quality) {
    Computer device = null;
    if (quality.equals("high")) {

      device = new Server(highQualityComponent);
      device.setName("Server from Esteem");

    } else if (quality.equals("medium")) {

      device = new Laptop(mediumQualityComponent);
      device.setName("Laptop from Esteem");

    } else if (quality.equals("low")) {

      device = new Tablet(lowQualityComponent);
      device.setName("Tablet from Esteem");

    }
    return device;
  }
}