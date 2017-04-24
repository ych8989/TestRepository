package ch17.exam13;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class RootController implements Initializable {

    @FXML
    private Button btn1;
    @FXML
    private Button btn2;
    @FXML
    private Button btn3;
    @FXML
    private Button btn4;
    @FXML
    private Button btn5;
    @FXML
    private Button btn6;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        
        btn1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("버튼 1이 클릭됨");
            }
        });

        btn2.setOnAction(event -> {
            System.out.println("버튼2 클릭됨");
        });
    }

    public void btn3Handle(ActionEvent even) {
        System.out.println("버튼 3이 클릭됨");
    }
}
