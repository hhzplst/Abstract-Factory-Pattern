public class Tablet extends Computer {
  public Tablet(ComputerComponentFactory componentFactory) {
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