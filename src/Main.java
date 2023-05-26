//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    public void start(Stage stage) throws IOException {
        Parent root = (Parent)FXMLLoader.load(this.getClass().getResource("login.fxml"));
        stage.setTitle("Welcome to Library App");
        stage.setScene(new Scene(root, 500, 500));
        stage.show();
    }
}
