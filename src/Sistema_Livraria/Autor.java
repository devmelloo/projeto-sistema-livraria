package Sistema_Livraria;

public class Autor {
    private int id;
    private String nome;

    public Autor(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public String toString(){
        return nome;
    };
}
