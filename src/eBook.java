public class eBook {
    private int ISBN;
    private String Autor;
    private String Titulo;
    private String Editora;
    private String formato;
    private Float FileSize;
    private String Signature;

    public eBook(int ISBN, String autor, String titulo, String editora, String formato, Float fileSize, String signature) {
        this.ISBN = ISBN;
        Autor = autor;
        Titulo = titulo;
        Editora = editora;
        this.formato = formato;
        FileSize = fileSize;
        Signature = signature;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getEditora() {
        return Editora;
    }

    public void setEditora(String editora) {
        Editora = editora;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public Float getFileSize() {
        return FileSize;
    }

    public void setFileSize(Float fileSize) {
        FileSize = fileSize;
    }

    public String getSignature() {
        return Signature;
    }

    public void setSignature(String signature) {
        Signature = signature;
    }
}
