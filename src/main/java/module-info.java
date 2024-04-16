module com.skytracks.skytracks {
    requires javafx.controls;
    requires javafx.fxml;

    requires javafx.graphics;
    requires java.sql;
    requires java.desktop;
    requires org.controlsfx.controls;
    requires javafx.swing;

    opens com.skytracks.skytracks.controller;
    opens com.skytracks.skytracks.models;
    opens com.skytracks.skytracks to javafx.fxml;

    exports com.skytracks.skytracks;
}