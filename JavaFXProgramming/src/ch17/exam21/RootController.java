package ch17.exam21;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.util.Callback;

public class RootController implements Initializable {

    @FXML
    private ListView<Food> listView;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        listView.setCellFactory(new Callback<ListView<Food>, ListCell<Food>>() {
            @Override
            public ListCell<Food> call(ListView<Food> param) {
                ListCell<Food> listCell = new ListCell<Food>() {
                    @Override
                    protected void updateItem(Food item, boolean empty) {
                        super.updateItem(item, empty);
                        if (empty) {
                            return;
                        }
                        try {
                            HBox hbox = (HBox) FXMLLoader.load(getClass().getResource("item.fxml"));
                            ImageView foodImage = (ImageView) hbox.lookup("#image");
                            Label foodName = (Label) hbox.lookup("#name");
                            ImageView foodScore = (ImageView) hbox.lookup("#score");
                            Label foodDescription = (Label) hbox.lookup("#description");

                            foodImage.setImage(new Image(getClass().getResource("images/" + item.getImage()).toString()));
                            foodName.setText(item.getName());
                            foodScore.setImage(new Image(getClass().getResource("images/star" + item.getScore() + ".png").toString()));
                            foodDescription.setText(item.getDescription());

                            // 셀의 내용으로 설정
                            setGraphic(hbox);

                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                };
                return listCell;
            }
        }
        );
        //선택 속성 감시
        listView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Food>() {
            @Override
            public void changed(ObservableValue<? extends Food> observable, Food oldValue, Food newValue) {
                System.out.println(newValue.getName() + " : " + newValue.getImage());
            }
        });
        
        //클릭 이벤트 처리
        listView.setOnMouseClicked(e -> {
            Food food = listView.getSelectionModel().getSelectedItem();
            System.out.println(food.getName());
        });

        //데이타 세팅
        ObservableList<Food> value = FXCollections.observableArrayList();
        value.add(new Food("food01.png", "삼겹살", 7, "먹고싶다....."));
        value.add(new Food("food02.png", "장어구이(양념)", 8, "이것도 먹고싶다....."));
        value.add(new Food("food03.png", "장어구이(소금)", 9, "이거도......먹고싶다....."));
        value.add(new Food("food04.png", "육회비빔밥", 10, "다 먹고싶다!!!"));
        value.add(new Food("food05.png", "새우볶음밥", 6, "내놔라!!!!!!"));
        value.add(new Food("food06.png", "떡볶이", 3, "......."));
        listView.setItems(value);
    }
}
