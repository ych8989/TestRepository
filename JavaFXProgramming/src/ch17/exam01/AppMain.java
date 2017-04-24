package ch17.exam01;

import java.util.Map;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.stage.Stage;

public class AppMain extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        System.out.println(Thread.currentThread().getName());
        stage.show();
    }

    @Override
    public void init() throws Exception {
        System.out.println("init");
        Parameters params = getParameters();
        //        List<String> list = params.getRaw();
        //        for (String param : list) {
        //            System.out.println(param);
        //        }

        //java Appmain --ip192.168.3.24 --port 50001F
        Map<String, String> map = params.getNamed();
        String ip = map.get("ip");
        String port = map.get("port");
        System.out.println(ip);
        System.out.println(port);

    }

    public static void main(String[] args) {
        launch(args);
        Platform.exit();
    }
}
