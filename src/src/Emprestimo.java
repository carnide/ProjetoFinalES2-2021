import java.time.LocalDate;

public class Emprestimo {
    private int id_emprestimo;
    private LocalDate DataHoraEmp;
    private LocalDate DataHoraEmpPrevista;
    private long extensao;
    private copiaeBook livro;
    private Utilizador user;
    private TermoResponsabilidade TR;

    public Emprestimo(int id_emprestimo, copiaeBook _livro, Utilizador _user) {
        this.id_emprestimo = id_emprestimo;
        this.DataHoraEmp = LocalDate.now();
        this.DataHoraEmpPrevista = LocalDate.now().plusDays(_livro.geteBook().getTempoEmprestimo());
        this.extensao = 0;
        livro = _livro;
        user = _user;
        TR = new TermoResponsabilidade(_livro.geteBook().getEditora(), false);
    }

    public long getExtensao() {
        return extensao;
    }

    public void setExtensao(long extensao) {
        this.extensao = extensao;
    }

    public int getId_emprestimo() {
        return id_emprestimo;
    }

    public LocalDate getDataHoraEmp() {
        return DataHoraEmp;
    }

    public LocalDate getDataHoraEmpPrevista() {
        return DataHoraEmpPrevista;
    }

    public copiaeBook getLivro() {
        return livro;
    }

    public Utilizador getUser() {
        return user;
    }
}