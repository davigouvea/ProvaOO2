package ifpr.pgua.eic.avaliacao01.model.dao;

import java.util.List;

import ifpr.pgua.eic.avaliacao01.model.entities.Livro;
import ifpr.pgua.eic.avaliacao01.model.results.Result;

public interface LivroDAO {
    Result inserir(Livro livro);
    List<Livro> buscarTodos();
}