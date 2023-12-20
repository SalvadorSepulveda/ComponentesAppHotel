module es.ieslosmontecillos.componentesapphotel {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.componentesapphotel to javafx.fxml;
    exports es.ieslosmontecillos.componentesapphotel;
}