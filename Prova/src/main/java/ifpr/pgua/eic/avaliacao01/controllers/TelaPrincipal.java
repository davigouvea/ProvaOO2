package ifpr.pgua.eic.avaliacao01.controllers;

import ifpr.pgua.eic.avaliacao01.App;
import ifpr.pgua.eic.avaliacao01.utils.Navigator.BorderPaneRegion;
import javafx.fxml.FXML;

public class TelaPrincipal extends BaseController {
    

    @FXML
    private void carregarLivros(){
        App.changeScreenRegion("LIVROS", BorderPaneRegion.CENTER);
    }

}
