package ifpr.pgua.eic.avaliacao01.controllers;

import java.net.URL;
import java.util.ResourceBundle;

import ifpr.pgua.eic.avaliacao01.controllers.viewmodels.LivroRow;
import ifpr.pgua.eic.avaliacao01.controllers.viewmodels.TelaLivrosViewModel;
import ifpr.pgua.eic.avaliacao01.model.results.Result;
import javafx.beans.value.ChangeListener;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;

public class TelaLivros extends BaseController implements Initializable{

    @FXML
    private TextField tfTitulo;

    @FXML
    private TextField tfPaginas;

    @FXML
    private TextField tfEditora;

    @FXML
    private TextField tfAnoPublicacao;


    @FXML
    private TableColumn<LivroRow,String> tbcTitulo;

    @FXML
    private TableColumn<LivroRow, String> tbcPaginas;

    @FXML
    private TableColumn<LivroRow, String> tbcEditora;

    @FXML
    private TableColumn<LivroRow, String> tbcAnoPublicacao;


    @FXML
    private TableView<LivroRow> tbLivros;

    
    @FXML
    private Button btCadastrar;
    
    @FXML
    private Button btLimpar;


    private TelaLivrosViewModel viewModel;


    public TelaLivros(TelaLivrosViewModel viewModel){
        this.viewModel = viewModel;
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        

        //define quais serão as propriedades que servirão para preencher
        //o valor da coluna. Note que o nome da propriedade deve possuir
        //um get equivalente no modelo que representa a linha da tabela.
        tbcTitulo.setCellValueFactory(new PropertyValueFactory<>("titulo"));
        tbcPaginas.setCellValueFactory(new PropertyValueFactory<>("paginas"));
        tbcEditora.setCellValueFactory(new PropertyValueFactory<>("editora"));
        tbcAnoPublicacao.setCellValueFactory(new PropertyValueFactory<>("anoPublicacao"));
        
        //liga o conjunto de itens da tabela com a lista de clientes do viewmodel
        tbLivros.setItems(viewModel.getLivros());

        viewModel.alertProperty().addListener((ChangeListener<Result>) (observable, oldVal, newVal) -> {
            // TODO Auto-generated method stub
            showMessage(newVal);
        });


        //liga a propriedade texto do textfield nome com a propriedade do viewmodel
        tfTitulo.textProperty().bindBidirectional(viewModel.tituloProperty());
        
        tfEditora.textProperty().bindBidirectional(viewModel.editoraProperty());
        
        tfAnoPublicacao.textProperty().bindBidirectional(viewModel.anoPublicacaoProperty());
        tfPaginas.textProperty().bindBidirectional(viewModel.paginasProperty());

        viewModel.updateList();

    }

    @FXML
    private void cadastrar(){
        viewModel.cadastrar();
    }

    @FXML
    private void limpar(){
        viewModel.limpar();
    }

}
