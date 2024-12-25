module ru.oreshnikova.oreshnikova_task3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens ru.oreshnikova.oreshnikova_task3 to javafx.fxml;
    exports ru.oreshnikova.oreshnikova_task3;
}