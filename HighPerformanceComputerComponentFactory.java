public class HighPerformanceComputerComponentFactory implements ComputerComponentFactory {

  public CPU createCPU() {
    return new HighPerformanceCPU();
  };

  public Memory createMemory() {
    return new HighPerformanceMemory();
  };

  public Motherboard createMotherboard() {
    return new HighPerformanceMotherboard();
  };

  public HardDrive createHardDrive() {
    return new HighPerformanceHardDrive();
  };
  
  public Case createCase() {
    return new HighPerformanceCase();
  };

}