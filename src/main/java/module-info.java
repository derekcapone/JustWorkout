module com.justworkout.desktopapp.ui.justworkout {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires org.apache.logging.log4j;
    requires javafx.base;

    opens com.justworkout.desktopapp.ui.justworkout to javafx.fxml;
    opens com.justworkout.desktopapp.ui.justworkout.windowcontrollers to javafx.fxml;
    exports com.justworkout.desktopapp.ui.justworkout;
    exports com.justworkout.desktopapp.ui.justworkout.windowcontrollers;
}