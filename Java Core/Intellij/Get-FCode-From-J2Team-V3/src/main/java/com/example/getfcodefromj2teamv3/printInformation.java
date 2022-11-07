package com.example.getfcodefromj2teamv3;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class printInformation {
    @FXML
    private Label information;

    @FXML
    protected void onHelloButtonClick(){
        information.setText("Count " + Information.count);
        Processing.start();
    }
}