public abstract class Computer {
  String name;

  public void setName(String name) {
    this.name = name;
  }

  String getName() {
    return name;
  }

  private void buildCase() {
    System.out.println("Building case...");
  }

  private void addMotherboard() {
    System.out.println("Adding Motherboard...");
  }

  private void addCPU() {
    System.out.println("Adding CPU...");
  }

  private void addMemory() {
    System.out.println("Adding Memory...");
  }

  private void addHardDrive() {
    System.out.println("Adding Hard Drive...");
  }

  public void assemble() {
    buildCase();
    addMotherboard();
    addCPU();
    addMemory();
    addHardDrive();
  }
}