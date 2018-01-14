import java.util.Comparator;

public class Compare implements Comparator<String> {

  @Override
  public int compare(String o1, String o2) {
    return o1.charAt(1) - o2.charAt(1);
  }
}
