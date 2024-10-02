module com.example.cst4finalproject {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires java.desktop;

    opens com.example.cst4finalproject to javafx.fxml;
    exports com.example.cst4finalproject;
}