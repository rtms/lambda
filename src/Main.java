import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args) {

    Runnable greeter = () -> System.out.println("- - - - - - - - - - - - - - - - - - - - - -");
    greeter.run();

    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    List<String> words = Arrays.asList(
        "dog",
        "apple",
        "wertheim",
        "docker",
        "moretti",
        "savonarola",
        "salad"
    );

    numbers.stream()
        .filter(a -> a % 2 == 0)
        .forEach(a -> System.out.println(a));

    greeter.run();

    words.stream()
        .filter(w -> w.contains("a"))
        .forEach(w -> System.out.println(w));

    greeter.run();

    words.stream()
        .sorted()
        .forEach(w -> System.out.println(w));

    greeter.run();

    words.stream()
        .filter(w -> w.length() > 5)
        .forEach(System.out::println);

    greeter.run();

    words.stream()
        .sorted(Comparator.comparing(String::length).reversed())
        .forEach(w -> System.out.println(w));

    greeter.run();

    words.stream()
        .sorted((String s1, String s2) -> new Compare().compare(s1, s2))
        .forEach(w -> System.out.println(w));

    greeter.run();
  }
}
