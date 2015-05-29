import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by andrepapazoglu on 29/05/15.
 */
@ManagedBean
@SessionScoped
public class FuncionarioBean {

    Funcionario funcionario = new Funcionario();

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public void cadastrar() {
        System.out.println("funcionario = " + funcionario);
    }
}
