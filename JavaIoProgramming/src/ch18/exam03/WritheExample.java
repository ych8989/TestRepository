package ch18.exam03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WritheExample {

    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
        //String path = ReadExample.class.getResource("test.txt").getPath();
        //InputStream is = new FileInputStream(path);
        OutputStream os = new FileOutputStream("src/ch18/exam03/test.txt");
        for (int i = 0; i < 20; i++) {
            os.write(97);

        }
        os.flush();
        os.close();
    }
}
