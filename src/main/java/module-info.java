module com.example.turing_machine_test {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.turing_machine_test to javafx.fxml;
    exports com.example.turing_machine_test;
}