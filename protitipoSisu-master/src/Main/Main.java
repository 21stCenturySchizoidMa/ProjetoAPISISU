package Main;

import SistemaDeLogin.UsuariosCadastro;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UsuariosCadastro sistema = new UsuariosCadastro();
        String opcao;

        do {
            System.out.println("ola!, bem vindo ao programa.");
            System.out.println("\nqual das opçoes abaixo deseja utilizar ?");
            System.out.println("\n1.fazer login");
            System.out.println("2.criar uma conta");
            System.out.println("\nescolha uma das opçoes acima:");
            opcao = sc.nextLine();

            switch (opcao) {
                case "1":
                    System.out.print("Digite seu login: ");
                    String login = sc.next();
                    sc.nextLine();
                    System.out.print("\nDigite seu senha: ");
                    String senha = sc.next();

                    if (sistema.verificarUsuario(login, senha)) {
                        System.out.println("\nBem vindo ao sistema!");
                    } else {
                        System.out.println("\nusuario nao encontrado!");
                    }
                    break;

                case "2":
                    System.out.print("Cadastre  seu login: ");
                    String novoLogin = sc.next();
                    System.out.print("\nDigite seu senha: ");
                    String novaSenha = sc.next();

                    sistema.adicionarNovoUsuario(novoLogin, novaSenha);
                    break;

                default:
                    System.out.println("opçao invalida!");
            }
        }while (!opcao.equals("4"));

    }
}
