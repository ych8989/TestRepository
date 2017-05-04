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


public class SettingScreenController implements Initializable {

    @FXML
    private Button btnBackHome;
    @FXML
    private Button btnBack;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnBackHome.setOnAction(e -> handleBackHome(e));
        btnBack.setOnAction(e -> handleBack(e));
    }

    private void handleBack(ActionEvent e) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("SettingMain.fxml"));
            Scene scene = new Scene(parent);
            Stage primaryStage = (Stage) btnBack.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (IOException ex) {
        }
    }

    private void handleBackHome(ActionEvent e) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("SettingMain.fxml"));
            Scene scene = new Scene(parent);
            Stage primaryStage = (Stage) btnBack.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (IOException ex) {

        }
    }
}
