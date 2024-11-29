module com.mycompany.t19.parrafos {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.t19.parrafos to javafx.fxml;
    exports com.mycompany.t19.parrafos;
}
