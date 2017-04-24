package ch17.exam22;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class RootController implements Initializable {

    @FXML
    private TableView<Phone> tableView;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TableColumn tc0 = tableView.getColumns().get(0);
        TableColumn tc1 = tableView.getColumns().get(1);
        TableColumn tc2 = tableView.getColumns().get(2);

        tc0.setCellValueFactory(new PropertyValueFactory<Phone, String>("name"));
        tc1.setCellValueFactory(new PropertyValueFactory<Phone, String>("image"));
        tc2.setCellValueFactory(new PropertyValueFactory<Phone, String>("content"));

        ObservableList<Phone> list = FXCollections.observableArrayList();
        list.add(new Phone("phone01.png", "갤렉시1", "첫번째 모델입니다."));
        list.add(new Phone("phone02.png", "갤렉시2", "두번째 모델입니다."));
        list.add(new Phone("phone03.png", "갤렉시3", "세번째 모델입니다."));
        tableView.setItems(list);

    }
}
