import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by andrepapazoglu on 25/05/15.
 */
@ManagedBean
public class CursoBean {
    List<Curso> cursos = new ArrayList<Curso>();
    Curso curso = new Curso();

    public String adicionaCurso() {
        cursos.add(curso);
        curso = new Curso();
        return "manterCursos";
    }

    public List<Curso> getCursos() {
        return cursos;
    }

    public List<Curso> getTodosCursos() {

        cursos.clear();
        for (int i = 0; i < 10; i++) {
            Curso cursoInt = new Curso();
            cursoInt.setNome("curso" + i);
            cursoInt.setSigla("sigla" + i);

            this.cursos.add(cursoInt);
        }
        return cursos;
    }

    public void setCursos(List<Curso> cursos) {
        this.cursos = cursos;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
