package Setting;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class SettingMainController implements Initializable {

    @FXML
    private Button btnSound;
    @FXML
    private Button btnScreen;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnSound.setOnAction(e -> handleBtnSound(e));
        btnScreen.setOnAction(e -> handleBtnScreen(e));
    }

    private void handleBtnSound(ActionEvent e) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("SettingSound.fxml"));
            Scene scene = new Scene(parent);
            Stage primaryStage = (Stage) btnSound.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (IOException ex) {
        }

    }

    private void handleBtnScreen(ActionEvent e) {
        try {
            //System.out.println("버튼클릭");
            Parent parent = FXMLLoader.load(getClass().getResource("SettingScreen.fxml"));
            Scene scene = new Scene(parent);
            Stage primaryStage = (Stage) btnScreen.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (IOException ex) {
        }

    }

}

