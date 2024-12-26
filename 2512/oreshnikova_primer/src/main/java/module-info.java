module ru.oreshnikova.oreshnikova_primer {
    requires javafx.controls;
    requires javafx.fxml;


    opens ru.oreshnikova.oreshnikova_primer to javafx.fxml;
    exports ru.oreshnikova.oreshnikova_primer;
    exports ru.oreshnikova.oreshnikova_primer.controller;
    opens ru.oreshnikova.oreshnikova_primer.controller to javafx.fxml;
}