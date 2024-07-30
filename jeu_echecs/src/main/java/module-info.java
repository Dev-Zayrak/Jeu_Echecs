module fr.perso.jeu_echecs {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens fr.perso.jeu_echecs to javafx.fxml;
    exports fr.perso.jeu_echecs;
}