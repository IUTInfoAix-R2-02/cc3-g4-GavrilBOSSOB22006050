package fr.amu.iut.cc3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ToileApp extends Application {

    private Button Tracer;

    public ToileApp(){

        Tracer = new Button();
    }

    public void start(Stage primaryStage) throws IOException {


        Tracer.addEventHandler(MouseEvent.MOUSE_CLICKED, actionEvent -> {
        });

        Parent root = FXMLLoader.load(getClass().getResource("toile.fxml"));
        primaryStage.setResizable(false);
        primaryStage.setTitle("Résultats aux différentes compétences du BUT");
        primaryStage.setScene( new Scene(root) );
        primaryStage.show();
    }

}

