public class LowPerformanceComputerComponentFactory implements ComputerComponentFactory {

  public CPU createCPU() {
    return new LowPerformanceCPU();
  };

  public Memory createMemory() {
    return new LowPerformanceMemory();
  };

  public Motherboard createMotherboard() {
    return new LowPerformanceMotherboard();
  };

  public HardDrive createHardDrive() {
    return new LowPerformanceHardDrive();
  };
  
  public Case createCase() {
    return new LowPerformanceCase();
  };

}