package ifpr.pgua.eic.avaliacao01.controllers.viewmodels;

import ifpr.pgua.eic.avaliacao01.model.entities.Livro;
import ifpr.pgua.eic.avaliacao01.model.results.Result;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class TelaLivrosViewModel {

    private StringProperty tituloProperty = new SimpleStringProperty();
    private StringProperty editoraProperty = new SimpleStringProperty();
    private StringProperty paginasProperty = new SimpleStringProperty();
    private StringProperty anoPublicacaoProperty = new SimpleStringProperty();
    private ObjectProperty<Result> alertProperty = new SimpleObjectProperty<>();

    private ObservableList<LivroRow> livros = FXCollections.observableArrayList();

    public StringProperty tituloProperty() {
        return tituloProperty;
    }

    public StringProperty editoraProperty() {
        return editoraProperty;
    }

    public StringProperty anoPublicacaoProperty() {
        return anoPublicacaoProperty;
    }

    public StringProperty paginasProperty() {
        return paginasProperty;
    }


    public ObjectProperty<Result> alertProperty() {
        return alertProperty;
    }

    public void updateList() {
        livros.clear();
        
        alertProperty.setValue(Result.fail("BUSCAR DO BANCO DE DADOS"));

    }

    public void cadastrar() {

        String titulo = tituloProperty.getValue();
        String editora = editoraProperty.getValue();
        String sPaginas = paginasProperty.getValue();
        String sAnoPublicacao = anoPublicacaoProperty.getValue();

        Integer paginas = Integer.valueOf(sPaginas);
        Integer anoPublicacao = Integer.valueOf(sAnoPublicacao);

        

        limpar();

        alertProperty.setValue(Result.fail("INSERIR NO BANCO DE DADOS!!!"));
    }

    public void limpar() {
        tituloProperty.setValue("");
        editoraProperty.setValue("");
        anoPublicacaoProperty.setValue("");
        paginasProperty.setValue("");
    }

    public ObservableList<LivroRow> getLivros() {
        return livros;
    }
    
}
