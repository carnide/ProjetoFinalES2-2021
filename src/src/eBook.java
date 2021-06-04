import java.time.LocalDate;
import java.util.Date;

public class eBook {
    private int ISBN;
    private String Autor;
    private String Titulo;
    private String Editora;
    private String formato;
    private Float FileSize;
    private long TempoEmprestimo;

    public eBook(int ISBN, String autor, String titulo, String editora, String formato, Float fileSize, long tempoemprestimo) {
        this.ISBN = ISBN;
        Autor = autor;
        Titulo = titulo;
        Editora = editora;
        this.formato = formato;
        FileSize = fileSize;
        TempoEmprestimo = tempoemprestimo;
    }

    public int getISBN() {
        return ISBN;
    }


    public String getAutor() {
        return Autor;
    }


    public String getTitulo() {
        return Titulo;
    }


    public String getEditora() {
        return Editora;
    }


    public String getFormato() {
        return formato;
    }


    public Float getFileSize() {
        return FileSize;
    }

    public long getTempoEmprestimo() {
        return TempoEmprestimo;
    }
}