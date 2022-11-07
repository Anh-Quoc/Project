module com.example.getfcodefromj2teamv3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires jsoup;
    requires java.desktop;


    opens com.example.getfcodefromj2teamv3 to javafx.fxml;
    exports com.example.getfcodefromj2teamv3;
}