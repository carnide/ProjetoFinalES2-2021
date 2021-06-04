import java.util.ArrayList;
import java.util.HashMap; // import the HashMap class

public class Biblioteca {
    ArrayList<Utilizador> Utilizadores = new ArrayList<Utilizador>();
    ArrayList<copiaeBook> Livros = new ArrayList<copiaeBook>();
    HashMap<Utilizador, ArrayList<copiaeBook>> Emprestimos = new HashMap<Utilizador, ArrayList<copiaeBook>>();


    Biblioteca(){

    }

    void addEmprestimo(Emprestimo _emprestimo){
        if(Utilizadores.contains(_emprestimo.getUser())){
            ArrayList<copiaeBook> listacopia = Emprestimos.get(_emprestimo.getUser());
            listacopia.add(_emprestimo.getLivro());
            Emprestimos.put(_emprestimo.getUser(),listacopia);
        }
    }

    void extendEmprestimo(Emprestimo _emprestimo){
        //eBook livro = _emprestimo.getLivro().geteBook();
        ArrayList<copiaeBook> listacopia = Emprestimos.get(_emprestimo.getUser());
        if(listacopia.equals(_emprestimo.getLivro())){
            _emprestimo.setExtensao(_emprestimo.getLivro().geteBook().getTempoEmprestimo());
        }
    }

    void cancelUtilizador(Utilizador _Utilizador){
        _Utilizador.estado = false;
    }
    
}