package InputOutput;



import javax.imageio.IIOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Fıle {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("test/berkan.txt");
            int i = fileInputStream.read();
            while (i != -1){
                System.out.print("Kullanılabir byte sayısı : " + fileInputStream.available());
            }
            fileInputStream.close();
        } catch (Exception e) {
            throw new RuntimeException(e.getMessage());
        }
    }
}
