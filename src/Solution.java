import java.io.*;
import java.net.*;

public class Solution {

  public static void main(String args[]) throws IOException {
    String stringUrl = "http://82.131.160.241:92/developer_478f3a4c51824ad23cb50c1c60670c0f";
    String stringEnd = ".aspx";

    for (int i = 0x0000; i < 0xFFFF; i++) {
      URL url = new URL(stringUrl + i + stringEnd);
      URLConnection uc = url.openConnection();
      if (!uc.getHeaderField(null).equals("HTTP/1.1 404 Not Found")) {
        System.out.println("Woohoo, such hacking: " + i);
        break;
      }
      System.out.println(Integer.parseInt(String.valueOf((i)), 16));
    }
  }
}
