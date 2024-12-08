package org.example.laba1rkp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Menumain extends Application {
    @Override
    public void start(Stage stage) {
        try {
            FXMLLoader loader = new FXMLLoader(Menumain.class.getResource("menu.fxml"));
            Parent root = loader.load();
            stage.setTitle("Главное меню");
            stage.setScene(new Scene(root));

            stage.show();
        } catch (IOException e) {
            System.err.println("Ошибка загрузки FXML: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        launch();
    }
}
