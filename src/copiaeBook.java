import jdk.nashorn.internal.parser.Token;

import java.time.Instant;

public class copiaeBook {
    private eBook eBook;
    private int idCopia;

    public copiaeBook(eBook _eBook, int _idCopia){
        this.eBook = _eBook;
        this.idCopia = _idCopia;
    }

    public String getSignature(){ //nao sei se faz sentido a copia ter a assinatura do livro original
        return this.eBook.getSignature();
    }

    public eBook geteBook() {
        return eBook;
    }
}
