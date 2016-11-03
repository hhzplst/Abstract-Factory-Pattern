public interface ComputerComponentFactory {

  public CPU createCPU();
  public Memory createMemory();
  public Motherboard createMotherboard();
  public HardDrive createHardDrive();
  public Case createCase();

}