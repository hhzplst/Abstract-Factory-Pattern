public abstract class ComputerStore {

  protected abstract Computer createComputer(String quality);

  public Computer orderComputer(String quality) {
    Computer computer = createComputer(quality);
  }

}