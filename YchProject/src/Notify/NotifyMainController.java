package Notify;

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
import javafx.scene.control.TableView;
import javafx.stage.Stage;

public class NotifyMainController implements Initializable {

    @FXML
    private TableView<?> tableView;
    @FXML
    private Button btnHome;
    @FXML
    private Button btnBack;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        btnHome.setOnAction(e -> handleBtnHome(e));
        btnBack.setOnAction(e -> handleBtnBack(e));
    }

    private void handleBtnHome(ActionEvent e) {
        try {
            Parent parent = FXMLLoader.load(getClass().getResource("Main.fxml"));
            Scene scene = new Scene(parent);
            Stage primaryStage = (Stage) btnHome.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (IOException ex) {
        }

    }

    private void handleBtnBack(ActionEvent e) {
        try {

            Parent parent = FXMLLoader.load(getClass().getResource("Main.fxml"));
            Scene scene = new Scene(parent);
            Stage primaryStage = (Stage) btnBack.getScene().getWindow();
            primaryStage.setScene(scene);
        } catch (IOException ex) {
        }
    }
}
