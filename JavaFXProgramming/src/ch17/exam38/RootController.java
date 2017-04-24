package ch17.exam38;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;

public class RootController implements Initializable {

	@FXML
	private ProgressBar progressBar;
	@FXML
	private Label lblWorkDone;
	@FXML
	private Button btnStart;
	@FXML
	private Button btnStop;
	@FXML
	private Label lblResult;
	private Task<Integer> task;

	@FXML

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnStart.setOnAction(e -> handleBtnStart(e));
		btnStop.setOnAction(e -> handleBtnStop(e));
	}

	private void handleBtnStart(ActionEvent e) {
		task = new Task<Integer>() {
			@Override
			protected Integer call() throws Exception {
				int result = 0;
				for (int i = 0; i <= 100; i++) {
					result += i;
					//how1
					//updateProgress(i, 100);
					//updateMessage(String.valueOf(i));

					//	updateMessage(String.valueOf(i));
					//	System.out.println(i);
					//how2
					double value = i;
					Platform.runLater(() -> {
						progressBar.setProgress(value / 100);
						System.out.println(String.valueOf(value));
						lblWorkDone.setText(String.valueOf(value));
					});
					if (isCancelled()) {
						break;
					}
					try {
						Thread.sleep(200);
					} catch (Exception e) {
						break;
					}
				}

				return result;
			}

			@Override
			protected void succeeded() {
				int result = getValue();
				lblResult.setText(String.valueOf(result));
			}

			@Override
			protected void cancelled() {
				lblResult.setText("작업하기 싫음");
			}

			@Override
			protected void failed() {

			}

		};
//how1
		//progressBar.progressProperty().bind(task.progressProperty());
		//lblWorkDone.textProperty().bind(task.messageProperty());

		Thread thread = new Thread(task);
		thread.setDaemon(true);
		thread.start();
	}

	private void handleBtnStop(ActionEvent e) {
		task.cancel();
	}
}
