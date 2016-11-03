public class MediumPerformanceComputerComponentFactory implements ComputerComponentFactory {

  public CPU createCPU() {
    return new MediumPerformanceCPU();
  };

  public Memory createMemory() {
    return new MediumPerformanceMemory();
  };

  public Motherboard createMotherboard() {
    return new MediumPerformanceMotherboard();
  };

  public HardDrive createHardDrive() {
    return new MediumPerformanceHardDrive();
  };
  
  public Case createCase() {
    return new MediumPerformanceCase();
  };

}