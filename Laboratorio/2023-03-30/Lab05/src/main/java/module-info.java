module it.unical.lab05.lab05 {
    requires javafx.controls;
    requires javafx.fxml;


    opens it.unical.lab05.lab05 to javafx.fxml;
    exports it.unical.lab05.lab05;
}