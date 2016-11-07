public class Test {
  public static void main(String[] args) {

    ComputerStore e = new EsteemComputerStore();
    ComputerStore k = new KudosComputerStore();

    Computer device = e.orderComputer("high");
    device = e.orderComputer("medium");
    device = e.orderComputer("low");

    device = k.orderComputer("high");
    device = k.orderComputer("medium");
    device = k.orderComputer("low");

  }
}