module org.example.laba1rkp {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.laba1rkp to javafx.fxml;
    exports org.example.laba1rkp;
}