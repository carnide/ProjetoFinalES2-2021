public class copiaeBook {
    private eBook eBook;
    private int idCopia;

    public copiaeBook(eBook _eBook, int _idCopia){
        eBook = _eBook;
        this.idCopia = _idCopia;
    }

    public eBook geteBook() {
        return eBook;
    }
}
