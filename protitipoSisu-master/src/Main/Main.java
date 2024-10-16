package Main;

import Menus.Menuprincipal;
import Menus.TelaPrincipal;
import SistemaDeLogin.UsuariosCadastro;

public class Main {
    public static void main(String[] args) /*throws InterruptedException*/ {
        Menuprincipal menu = new Menuprincipal();
        TelaPrincipal tela = new TelaPrincipal();
        UsuariosCadastro sistema = new UsuariosCadastro();
        String opcao;

        do {
            opcao = menu.ExibirMenu();

            switch (opcao) {
                case "1":
                    System.out.print("\nDigite seu login: ");
                    String login = menu.getScanner().next();
                    System.out.print("\nDigite seu senha: ");
                    String senha = menu.getScanner().next();

                    if (sistema.verificarUsuario(login, senha)) {
                        System.out.println("\nBem vindo ao sistema!");
//                        Thread.sleep(5000);
//                        limparTela();
                        opcao = tela.Exibirtela();
                    } else {
                        System.out.println("\nusuario nao encontrado!");
                    }
                    menu.getScanner().nextLine();
                    break;

                case "2":
                    System.out.print("Cadastre  seu login: ");
                    String novoLogin = menu.getScanner().next();
                    System.out.print("\nDigite seu senha: ");
                    String novaSenha = menu.getScanner().next();

                    sistema.adicionarNovoUsuario(novoLogin, novaSenha);
                    menu.getScanner().nextLine();
                    break;

                case "3":
                    limparTela();
                    System.out.println("\nSaindo...");
                    break;

                default:
                    System.out.println("\nOpçao inválida!");
                    break;
            }
        }while (!opcao.equals("3"));
    }
    public static void limparTela() {
        for (int i = 0; i < 70; i++) {
            System.out.println();
        }
    }
}
