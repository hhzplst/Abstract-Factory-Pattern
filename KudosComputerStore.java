public class KudosComputerStore extends ComputerStore {

  public Computer createComputer(String quality) {
    Computer computer = null;
    if (quality.equals("high")) {

      computer = new Computer(highQualityComponent);
      computer.setName("Server from Kudos");

    } else if (quality.equals("medium")) {

      computer = new Computer(mediumQualityComponent);
      computer.setName("Laptop from Kudos");

    } else if (quality.equals("low")) {

      computer = new Computer(lowQualityComponent);
      computer.setName("Tablet from Kudos");

    }
    return computer;
  }
}