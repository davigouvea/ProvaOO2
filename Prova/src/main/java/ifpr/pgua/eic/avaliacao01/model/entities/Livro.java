package ifpr.pgua.eic.avaliacao01.model.entities;

public class Livro {
    
    private Integer id;
    private String titulo;
    private String editora;
    private Integer paginas;
    private Integer anoPublicacao;
    
    public Livro(Integer id, String titulo, String editora, Integer paginas, Integer anoPublicacao) {
        this.id = id;
        this.titulo = titulo;
        this.editora = editora;
        this.paginas = paginas;
        this.anoPublicacao = anoPublicacao;
    }

    public Livro(String titulo, String editora, Integer paginas, Integer anoPublicacao) {
        this(-1, titulo, editora, paginas, anoPublicacao);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    public Integer getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(Integer anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }
    
}
