package Sistema_Livraria;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Sistema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean rodando = true;

        Biblioteca biblioteca = new Biblioteca();

        while (rodando){
            System.out.println("Olá, você deseja solicitar um livro? Favor responder com SIM/NÃO");
            String resposta = scanner.nextLine();

            if(resposta.equalsIgnoreCase("SIM")){

                boolean temLivros = biblioteca.listarLivrosDisponiveis();


                if (temLivros) {
                    System.out.println("Digite o ID do livro desejado:");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    Livro livroEscolhido = biblioteca.buscarLivro(id);

                    if (livroEscolhido == null) {
                        System.out.println("ID inválido!");
                    } else {
                        livroEscolhido.setDisponivel(false);

                        System.out.println("Digite seu nome:");
                        String nomeCliente = scanner.nextLine();

                        System.out.println("Emprestimo do livro '"
                                + livroEscolhido.getTitulo() +
                                "' realizado com sucesso para o cliente "
                                + nomeCliente + "!"
                        );
                    }
                    ;
                } else {
                    System.out.println("Infelizmente não há mais livros disponíveis. Volte novamente mais tarde!");
                    rodando = false;
                }
            }else{
                System.out.println("Ok, até mais!");
                rodando = false;
            }
        }
    };
}
