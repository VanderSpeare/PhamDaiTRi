module com.william_vanderspeare.test {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.william_vanderspeare.test to javafx.fxml;
    exports com.william_vanderspeare.test;
}