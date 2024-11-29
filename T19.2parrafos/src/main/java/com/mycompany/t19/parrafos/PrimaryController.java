package com.mycompany.t19.parrafos;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class PrimaryController {

    @FXML
    private TextArea txt1;
    @FXML
    private TextArea txt2;

    @FXML
    void cambiarParrafo1(ActionEvent event) {
        txt1.setText("Hello, good morning.");
    }
    @FXML
    void cambiarParrafo2(ActionEvent event) {
        txt2.setText("Good afternoon.");
    }

    
}
