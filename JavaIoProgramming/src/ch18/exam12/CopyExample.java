package ch18.exam12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fis = new FileInputStream("src/ch18/exam12/Jellyfish.jpg");
        FileOutputStream fos = new FileOutputStream("src/ch18/exam12/jellyfish2.jpg");

        byte[] data = new byte[1024];
        int r = -1;
        while (true) {
            r = fis.read(data);
            if (r == -1) {
                break;
            }
            fos.write(data, 0, r);
        }

        fos.flush();
        fos.close();
        fis.close();

    }
}
