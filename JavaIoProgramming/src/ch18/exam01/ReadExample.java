package ch18.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class ReadExample {
//예외처리
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = ReadExample.class.getResource("test.txt").getPath();
        //새로운 객체를 생성 
        InputStream is = new FileInputStream(path);

        /*while(true){
        int v1 =is.read();
        if(v1==-1)break;
        System.out.print((char)v1); }
         */
        
        
        // 정수타입 변수 v2 에 -1는 넣는다
        int v2 = -1;
        //while문을 돌리는데 괄호안의 내용이 true일때만 중괄호 안의 내용을 실행
        
        while ((v2 = is.read()) != -1) {
            System.out.print((char) v2);
        }
        //닫아준다
        is.close();
    }
}
