module com.example.juego {
    requires javafx.controls;
    requires javafx.fxml;
            
            requires com.dlsc.formsfx;
                        
    opens com.example.juego to javafx.fxml;
    exports com.example.juego;
}