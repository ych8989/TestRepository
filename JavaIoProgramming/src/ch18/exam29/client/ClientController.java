package ch18.exam29.client;

import ch18.exam29.server.ServerController;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class ClientController implements Initializable {

	@FXML
	private Button btnConn;
	@FXML
	private TextField txtInput;
	@FXML
	private Button btnSend;
	@FXML
	private TextArea txtDisplay;
	
	private Socket socket;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnConn.setOnAction(e->handleBtnConn(e));
		btnSend.setOnAction(e->handleBtnSend(e));
	}	

	private void handleBtnConn(ActionEvent e) {
		if(btnConn.getText().equals("연결")) {
			startClient();
		} else if(btnConn.getText().equals("끊기")) {
			stopClient();
		}
	}

	private void handleBtnSend(ActionEvent e) {
		send(txtInput.getText());
	}

	private void startClient() {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					//소켓 생성
					socket = new Socket();					
					//서버와 연결하기
					socket.connect(new InetSocketAddress("192.168.3.35", 50001));
					//연결 성공 출력하기
					Platform.runLater(()->{ 
						display("[연결 성공]"); 
						btnConn.setText("끊기");
					});
					//데이터 받기
					receive();
				} catch (Exception ex) {
					Platform.runLater(()->display("[연결 실패]"));
					stopClient();
					return;
				}
			}
		};
		thread.start();
	}

	private void stopClient() {
		try {
			socket.close();
		} catch (IOException ex) {}
		Platform.runLater(()-> {
			btnConn.setText("연결");
			display("연결 끊김");
		});
	}
	
	private void display(String text) {
		txtDisplay.appendText(text + "\n");
	}
	
	private void receive() {
		try {
			while(true) {
				InputStream inputStream = socket.getInputStream();
				byte[] byteArr = new byte[100];
				int readBytes = inputStream.read(byteArr);
				if(readBytes == -1) throw new Exception();
				String strData = new String(byteArr, 0, readBytes);
				Platform.runLater(()->display(strData));
			}
		} catch(Exception e) {
			Platform.runLater(()->display("[연결 끊김]"));
			stopClient();
		}
	}
	
	private void send(String message) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					OutputStream os = socket.getOutputStream();
					byte[] byteArr = message.getBytes();
					os.write(byteArr);
					os.flush();
				} catch (IOException ex) {
					try { socket.close(); } catch (IOException ex1) {}
					stopClient();
				}
			}
		};
		thread.start();
	}
	
}
