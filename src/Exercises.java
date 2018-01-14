
public class Exercises {

  public static void main(String args[]) {

  Runnable greeter = () -> System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
  greeter.run();

  String reversed = ".eslaf eb t'ndluow ecnetnes siht ,dehctiws erew eslaf dna eurt fo sgninaem eht fI";

  StringBuilder text = new StringBuilder(reversed);
    System.out.println(text.reverse());
  }

}
