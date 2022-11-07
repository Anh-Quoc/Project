package com.example.getfcodefromj2teamv3;

import javafx.application.Application;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

import javafx.stage.Stage;


public class GetFCodeApplication extends Application {
    @Override
    public void start(Stage stage){

        Label label = new Label("");
        Button startBt = new Button();
        startBt.setText("Start");

        startBt.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                final int delayTime = 2;
                Processing.start();

            }
        });


        FlowPane root = new FlowPane();
        root.getChildren().add(label);
        root.getChildren().add(startBt);
        Scene scene = new Scene(root, 200, 100);

        stage.setTitle("Get FCode From J2Team");
        stage.setScene(scene);
        stage.show();
    }

    public static void run(){

    }


    public static void main(String[] args){
        launch();
    }
}