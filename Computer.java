public abstract class Computer {
  String name;

  void setName(String name) {
    this.name = name;
  }

  String getName() {
    return name;
  }

  void buildCase() {
    System.out.println("Building case...");
  }

  void addMotherboard() {
    System.out.println("Adding Motherboard...");
  }

  void addCPU() {
    System.out.println("Adding CPU...");
  }

  void addMemory() {
    System.out.println("Adding Memory...");
  }

  void addHardDrive() {
    System.out.println("Adding Hard Drive...");
  }
}