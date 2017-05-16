package ch18.exam27.server;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerExample {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(100);
        
        ServerSocket serverSocket = null;
        try {
            //ServerSocket 생성
            serverSocket = new ServerSocket();
            //포트와 바인딩
            serverSocket.bind(new InetSocketAddress(50001));
            //연결 기다리기
            System.out.println("[클라이언트의 연결 기다림]");
            while(true) {
                Socket socket = serverSocket.accept();
                Runnable task = () -> {
                    try {
                        //통신 하기
                        InputStream is = socket.getInputStream();
                        byte[] data = new byte[100];
                        int readBytes = is.read(data);
                        if(readBytes == -1) {
                            throw new IOException("클라이언트가 정상 종료됨");
                        }
                        String strData = new String(data, 0, readBytes, "UTF-8");
                        System.out.println("받은 데이터: " + strData);

                        OutputStream os = socket.getOutputStream();
                        data = strData.getBytes("UTF-8");
                        os.write(data);
                        os.flush();
                        System.out.println("데이터 보내기 성공");
                        //연결 끊기
                        socket.close();
                    } catch(IOException e) { }
                };
                executorService.submit(task);
            }
        } catch (IOException ex) { }
        
        //ServerSocket이 포트 50001번을 현재 사용하고 있는냐?
        if(!serverSocket.isClosed()) {
            //ServerSocket 닫기(포트 50001번을 해제한다.)
            try { serverSocket.close(); } catch (IOException ex1) {}
        }
    }
}
