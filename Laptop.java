public class Laptop extends Computer {
  public Laptop(ComputerComponentFactory componentFactory) {
    factory = componentFactory;
  }
  public void prepare(){
    cpu = factory.createCPU();
    memory = factory.createMemory();
    motherboard = factory.createMotherboard();
    hardDrive = factory.createHardDrive();
    deviceCase = factory.createCase();
  }
}