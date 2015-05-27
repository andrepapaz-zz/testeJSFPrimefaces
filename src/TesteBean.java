import javax.faces.bean.ManagedBean;

/**
 * Created by andrepapazoglu on 25/05/15.
 */
@ManagedBean
public class TesteBean {
    private int numero;
    private String texto;
    private int maximo;
    private int numeroAleatorio;

    public String geraNumeroAleatorio() {
        this.numeroAleatorio = (int) (Math.random() * this.maximo);
        return "resposta";
    }

    public void incrementaNumero() {
        numero++;
    }

    public void transformarEmCaixaAlta() {
        texto = texto.toUpperCase();
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public int getMaximo() {
        return maximo;
    }

    public void setMaximo(int maximo) {
        this.maximo = maximo;
    }

    public int getNumeroAleatorio() {
        return numeroAleatorio;
    }

    public void setNumeroAleatorio(int numeroAleatorio) {
        this.numeroAleatorio = numeroAleatorio;
    }
}
