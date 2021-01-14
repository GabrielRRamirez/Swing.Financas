
package Models;


public class ModelEvento {
    private int id;
    private String descricao;
    private int situacaoCadastro;

    public ModelEvento() {
    }

    public ModelEvento(int id, String descricao, int situacaoCadastro) {
        this.id = id;
        this.descricao = descricao;
        this.situacaoCadastro = situacaoCadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getSituacaoCadastro() {
        return situacaoCadastro;
    }

    public void setSituacaoCadastro(int situacaoCadastro) {
        this.situacaoCadastro = situacaoCadastro;
    }
    
    
    
}
