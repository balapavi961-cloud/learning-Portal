import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileService {

    public void displayFile(String resourcePath) {
        try {
            // Load file from classpath
            InputStream is = getClass().getClassLoader().getResourceAsStream(resourcePath);

            if (is == null) {
                System.out.println("Resource not found: " + resourcePath);
                return;
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
