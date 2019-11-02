package lesson09.io;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class BinaryReadApp {
  public static void main(String[] args) throws IOException {
    URL url = new URL("http://www.yahoo.com/image_to_read.jpg");
    byte[] response;
    try (
        InputStream in = new BufferedInputStream(url.openStream());
        ByteArrayOutputStream out = new ByteArrayOutputStream();
    ) {
      byte[] buf = new byte[1024];
      int n = 0;
      while (-1 != (n = in.read(buf)) ) {
        out.write(buf, 0, n);
      }
      response = out.toByteArray();
    }

  }
}
