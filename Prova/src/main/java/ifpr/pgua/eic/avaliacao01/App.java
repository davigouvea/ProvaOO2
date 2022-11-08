package ifpr.pgua.eic.avaliacao01;

import ifpr.pgua.eic.avaliacao01.controllers.TelaLivros;
import ifpr.pgua.eic.avaliacao01.controllers.TelaPrincipal;
import ifpr.pgua.eic.avaliacao01.controllers.viewmodels.TelaLivrosViewModel;
import ifpr.pgua.eic.avaliacao01.utils.Navigator.BaseAppNavigator;
import ifpr.pgua.eic.avaliacao01.utils.Navigator.ScreenRegistryFXML;



/**
 * JavaFX App
 */
public class App extends BaseAppNavigator {


    @Override
    public void init() throws Exception {
        // TODO Auto-generated method stub
        super.init();
        
    }

    @Override
    public void stop() throws Exception {
        super.stop();

    }



    @Override
    public String getHome() {
        // TODO Auto-generated method stub
        return "PRINCIPAL";
    }

    @Override
    public String getAppTitle() {
        // TODO Auto-generated method stub
        return "Livros";
    }

    @Override
    public void registrarTelas() {
        registraTela("PRINCIPAL", new ScreenRegistryFXML(getClass(), "fxml/principal.fxml", (o)->new TelaPrincipal()));
        registraTela("LIVROS", new ScreenRegistryFXML(getClass(), "fxml/livros.fxml", (o)->new TelaLivros(new TelaLivrosViewModel())));  
    
    }


}