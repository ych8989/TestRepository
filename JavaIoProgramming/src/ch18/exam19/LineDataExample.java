package ch18.exam19;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;

public class LineDataExample {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        /*
        FileOutputStream fis = new FileOutputStream("src/ch18/exam19/test.txt");
        OutputStreamWriter osw=new OutputStreamWriter(fos);
        fw.Write("abcde\r\n");
        fw.Write("12345\r\n");
        fw.Write("가나다라마");
        osw.flush();
        fos.flush();
        ows.close();
        fos.close();
         */
        FileOutputStream fos = new FileOutputStream("src/ch18/exam19/test.txt");
        PrintStream out = new PrintStream(fos);
       //PrintWriter out=new PrintWriter(fos);
        out.println("abcde");
        out.println("12345");
        out.println("가나다라마");
        out.flush();
        fos.flush();
        out.close();
        fos.close();
        
        FileInputStream fis = new FileInputStream("src/ch18/exam19/test.txt");
        InputStreamReader isr=new InputStreamReader(fis);
        BufferedReader br=new BufferedReader(isr);
        
        while(true){
            String line=br.readLine();
            if(line==null)break;
            System.out.println(line);
        }
        br.close();
        isr.close();
        fis.close();
    }
}
