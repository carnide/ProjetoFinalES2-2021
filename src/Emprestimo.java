import java.time.LocalDate;

public class Emprestimo {
    private int id_emprestimo;
    private LocalDate DataHoraEmp;
    private LocalDate DataHoraEmpPrevista;
    private int extensao;
    private copiaeBook livro;
    private Utilizador user;
    private TermoResponsabilidade TR;

    public Emprestimo(int id_emprestimo, copiaeBook livro, Utilizador user) {
        this.id_emprestimo = id_emprestimo;
        this.DataHoraEmp = LocalDate.now();
        this.DataHoraEmpPrevista = LocalDate.now().plusDays(livro.geteBook().getTempoEmprestimo());
        this.extensao = 0;
        this.livro = livro;
        this.user = user;
        TR = new TermoResponsabilidade(livro.geteBook().getEditora(), false);
    }

    public int getExtensao() {
        return extensao;
    }

    public void setExtensao(int extensao) {
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