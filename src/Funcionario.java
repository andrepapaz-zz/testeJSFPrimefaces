import java.util.Date;

/**
 * Created by andrepapazoglu on 29/05/15.
 */
public class Funcionario {
    private Double salario;
    private Integer codigo;
    private Date aniversario;

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getAniversario() {
        return aniversario;
    }

    public void setAniversario(Date aniversario) {
        this.aniversario = aniversario;
    }
}
