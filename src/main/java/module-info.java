module com.justworkout.desktopapp.ui.justworkout {
    requires javafx.controls;
    requires javafx.fxml;
            
        requires org.controlsfx.controls;
                        requires org.kordamp.bootstrapfx.core;
            
    opens com.justworkout.desktopapp.ui.justworkout to javafx.fxml;
    exports com.justworkout.desktopapp.ui.justworkout;
}