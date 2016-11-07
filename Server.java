public class Server extends Computer {
  public Server(ComputerComponentFactory componentFactory) {
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