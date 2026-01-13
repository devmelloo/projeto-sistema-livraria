package Sistema_Livraria;

public class Livro {
    private int id;
    private String titulo;
    private Autor autor;
    private boolean disponivel;

    public Livro(int id, String titulo, Autor autor, boolean disponivel){
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponivel = disponivel;
    }

    public int getId() {
        return id;
    };

    public String getTitulo() {
        return titulo;
    };

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public String toString(){
        return "ID: " + id +
                " |Título: " + titulo +
                " |Autor: " + autor;
    };
}
