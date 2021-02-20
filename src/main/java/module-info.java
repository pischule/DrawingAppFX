module by.bsu.tp {
    requires javafx.controls;
    requires javafx.fxml;

    opens by.bsu.tp to javafx.fxml;
    exports by.bsu.tp;
}