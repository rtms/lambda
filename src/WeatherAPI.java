
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class WeatherAPI {

  public static void main(String args[]) throws IOException {
    URL url = new URL(
        "http://api.openweathermap.org/data/2.5/weather?APPID=5849fc6c087a700bba64d873a94a2300&q=London");
    HttpURLConnection uc = (HttpURLConnection) url.openConnection();
    uc.setRequestMethod("GET");
    System.out.println(uc.getHeaderField(0));
  }
}
