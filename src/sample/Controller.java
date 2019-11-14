package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;


public class Controller {

    @FXML
    Button switchSceneButton1;
    @FXML
    Button switchSceneButton2;
    @FXML
    AnchorPane rootPane;


    public void switchToScene2(javafx.event.ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getClassLoader().getResource("sample/scene2.fxml"));

        rootPane.getChildren().setAll(pane);
    }

    public void switchToScene1(javafx.event.ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("/sample/scene1.fxml"));
        rootPane.getChildren().setAll(pane);
    }
}
