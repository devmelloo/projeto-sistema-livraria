package Sistema_Livraria;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Livro> livros = new ArrayList<>();
    private List<Autor> autores = new ArrayList<>();

    public boolean listarLivrosDisponiveis(){

        boolean temDisponivel = false;

        for (Livro livro : livros){
            if (livro.isDisponivel()){
                System.out.println(livro);
                temDisponivel = true;
            }
        }

        return temDisponivel;
    };

    public Livro buscarLivro(int id){
        for (Livro livro : livros){
            if(livro.getId() == id){
                return livro;
            }
        }
        return null;
    }



    public Biblioteca(){
        Autor autor1 = new Autor(1, "George Orwell");
        Autor autor2 = new Autor(2, "J.K. Rowling");
        Autor autor3 = new Autor(3, "Robert C. Martin");

        livros.add(new Livro(1, "Revolução dos Bichos", autor1, true));
        livros.add(new Livro(2, "Harry Potter", autor2, true));
        livros.add(new Livro(3, "Código Limpo", autor3, true));
        livros.add(new Livro(4, "1984", autor1, true));
    }
}
