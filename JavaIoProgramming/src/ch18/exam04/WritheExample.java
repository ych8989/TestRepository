package ch18.exam04;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class WritheExample {

    public static void main(String[] args) throws FileNotFoundException, IOException, InterruptedException {
        //String path = ReadExample.class.getResource("test.txt").getPath();
        //InputStream is = new FileInputStream(path);
        OutputStream os = new FileOutputStream("src/ch18/exam04/test.txt");
    
        byte[]data={97,98,99};

        os.write(data);
        os.flush();
        os.close();
    }
}
