
package ch18.exam02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class ReadExample {
    public static void main(String[] args) throws FileNotFoundException, IOException {
      
        //test 의 경로 지정     
        String path = ReadExample.class.getResource("test.txt").getPath();
        //is 에  새로운 객체생성 
        InputStream is = new FileInputStream(path);
        //30크기의 배열 만들어줌
        byte[] data = new byte[30];
        // ?
        int readBytes = -1;
        String strData = " ";
        //값이 true 면 
        while (true) {
            readBytes = is.read(data); // read메소드의 매개변수 data를 받고 그 값을 readBytes 변수에 대입
            if (readBytes == -1) {
            break;
            }//출력
            System.out.println("읽은 바이트 수 :" + readBytes);
            System.out.println("읽은 바이트 값 :" + Arrays.toString(data));
           //strData에 새로운 객체를 생성 
            strData = new String(data, 0, readBytes);
        }
        //출력 ,strData 값을 출력
        System.out.print("------------------------------------");
        System.out.println(strData);
        //사용했던 시스템 자원을 풀어준다.
        is.close();
    }
}
