public abstract class ComputerStore {

  protected HighPerformanceComputerComponentFactory highQualityComponent = 
  new HighPerformanceComputerComponentFactory();

  protected MediumPerformanceComputerComponentFactory mediumQualityComponent = 
  new MediumPerformanceComputerComponentFactory();

  protected LowPerformanceComputerComponentFactory lowQualityComponent = 
  new LowPerformanceComputerComponentFactory();

  protected abstract Computer createComputer(String quality);

  public Computer orderComputer(String quality) {
    Computer computer = createComputer(quality);
  }

}