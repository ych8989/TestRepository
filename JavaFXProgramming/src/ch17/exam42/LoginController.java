package ch17.exam42;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.util.Duration;

public class LoginController implements Initializable {

	@FXML
	private BorderPane login;
	@FXML
	private Button btnMain;

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		btnMain.setOnAction(e -> handleBtnMain(e));
	}

	private void handleBtnMain(ActionEvent e) {
		StackPane rootPane = (StackPane) btnMain.getScene().getRoot();

		login.setOpacity(1);//초기값:1

		KeyValue keyValue = new KeyValue(login.opacityProperty(), 0);//무었을 :translateX,종료값:0
		KeyFrame keyFrame = new KeyFrame(
						Duration.millis(500),
						event->rootPane.getChildren().remove(login),
						keyValue
		);//애니매이션 진행 시간:0.1초

		Timeline timeline = new Timeline();
		timeline.getKeyFrames().add(keyFrame);
		timeline.play();
	}
}
