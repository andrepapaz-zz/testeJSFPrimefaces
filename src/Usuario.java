import javax.faces.bean.ManagedBean;

/**
 * Created by andrepapazoglu on 25/05/15.
 */
@ManagedBean
public class Usuario {
    private String nome;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
