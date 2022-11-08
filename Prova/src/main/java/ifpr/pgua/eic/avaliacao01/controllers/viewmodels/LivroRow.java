package ifpr.pgua.eic.avaliacao01.controllers.viewmodels;

import ifpr.pgua.eic.avaliacao01.model.entities.Livro;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class LivroRow {
    
    private Livro livro;
    
    public LivroRow(Livro livro){
        this.livro = livro;
    }

    public Livro getLivro(){
        return livro;
    }


    /**
     * Propriedade para representar o atributo id do livro.
     * 
     * @return SimpleStringProperty com o valor do id do livro.
     */
    public StringProperty idProperty(){
        return new SimpleStringProperty(String.valueOf(livro.getId()));
    }

    /**
     * Propriedade para representar o atributo titulo do livro.
     * 
     * @return SimpleStringProperty com o valor do titulo do livro.
     */

    public StringProperty tituloProperty(){
        return new SimpleStringProperty(livro.getTitulo());
    }

    /**
     * Propriedade para representar o atributo editora do livro.
     * 
     * @return SimpleStringProperty com o valor do editora do livro.
     */
    public StringProperty editoraProperty(){
        return new SimpleStringProperty(livro.getEditora());
    }

    /**
     * Propriedade para representar o atributo paginas do livro.
     * 
     * @return SimpleStringProperty com o valor do paginas do livro.
     */
    public StringProperty paginasProperty(){
        return new SimpleStringProperty(String.valueOf(livro.getPaginas()));
    }

    /**
     * Propriedade para representar o atributo anoPublicacao do livro.
     * 
     * @return SimpleStringProperty com o valor do anoPublicacao do livro.
     */
    public StringProperty anoPublicacaoProperty(){
        return new SimpleStringProperty(String.valueOf(livro.getAnoPublicacao()));
    }


}
