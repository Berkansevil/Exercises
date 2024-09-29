package InputOutput;

import java.io.*;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        FileOutputStream output;

        {
            try {
                String data = "Text dosyasına veri ekleniyor...";
                byte [] array=data.getBytes();
                output = new FileOutputStream("test/berkan.txt");
                output.write(array);
                output.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
