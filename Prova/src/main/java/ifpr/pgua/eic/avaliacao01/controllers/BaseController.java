package ifpr.pgua.eic.avaliacao01.controllers;

import ifpr.pgua.eic.avaliacao01.model.results.Result;
import ifpr.pgua.eic.avaliacao01.model.results.SuccessResult;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

public class BaseController {
    

    public void showMessage(Result msg){
        AlertType tipo = msg instanceof SuccessResult? AlertType.INFORMATION:AlertType.ERROR;
        
        Alert alert = new Alert(tipo, msg.getMsg());
        alert.showAndWait();
    }


}
