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

public class SettingSoundController implements Initializable {

    @FXML
    private Button btnBack;
    @FXML
    private Button btnBackHome;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnBack.setOnAction(e -> handleBtnBack(e));
        btnBackHome.setOnAction(e -> handleBtnBackHome(e));
    }

    private void handleBtnBack(ActionEvent e) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("SettingMain.fxml"));
            Scene scene = new Scene(parent);
            Stage primaryStage = (Stage) btnBack.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (IOException ex) {
        }
    }

    private void handleBtnBackHome(ActionEvent e) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("SettingMain.fxml"));
            Scene scene = new Scene(parent);
            Stage primaryStage = (Stage) btnBackHome.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (IOException ex) {
        }
    }
}
