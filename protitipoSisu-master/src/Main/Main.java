package Main;

import Menus.Menuprincipal;
import Menus.MenuSecundario;
import Notas.CalcularNotas;
import SistemaDeLogin.UsuariosCadastro;

public class Main {
    public static void main(String[] args) /*throws InterruptedException*/ {
        Menuprincipal menu = new Menuprincipal();
        MenuSecundario tela = new MenuSecundario();
        UsuariosCadastro sistema = new UsuariosCadastro();
        CalcularNotas calc = new CalcularNotas();
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
                        opcao = tela.Exibirtela();
                        switch (opcao) {
                            case "1":
                                System.out.println("lista de cursos e suas informacoes:");
                                System.out.printf(
                                        "Medicina (Campus Caruaru): 859,08 - Vagas: 40 - Duração: 12 semestres%n" +
                                                "Medicina (Campus Recife): 827,78 - Vagas: 250 - Duração: 12 semestres%n" +
                                                "Ciência da Computação (Campus Recife): 802,68 - Vagas: 60 - Duração: 8 semestres%n" +
                                                "Sistemas de Informação (Campus Recife): 798,97 - Vagas: 60 - Duração: 8 semestres%n" +
                                                "Engenharia da Computação (Campus Recife): 786,12 - Vagas: 60 - Duração: 10 semestres%n" +
                                                "Direito (Campus Recife) Matutino: 760,16; Noturno: 745,24 - Vagas: 90 - Duração: 10 semestres%n" +
                                                "Engenharia Biomédica: 743,67 - Vagas: 40 - Duração: 10 semestres%n" +
                                                "Artes Visuais: 740,95 - Vagas: 40 - Duração: 8 semestres%n" +
                                                "Odontologia: 739,65 - Vagas: 50 - Duração: 10 semestres%n"
                                );
                                break;
                            case "2":
                                System.out.println("cadastramento de informaçoes do usuario");
                                sistema.informacoesDoUsuario();
                                System.out.println("cadastrado com sucesso!");
                                break;
                            case "3":
                                System.out.println("informacoes do usuario");
                                System.out.println("nome:" + sistema.getNome());
                                System.out.println("email:" + sistema.getEmail());
                                System.out.println("idade" + sistema.getIdade());
                                System.out.println("endereco:" + sistema.getEndereco());
                                System.out.println("telefone:" + sistema.getTelefone());
                                System.out.println("cpf:" + sistema.getCpf());
                                System.out.println("nota:" + calc.getMedia());
                                break;
                        }

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
                    System.out.println("calcule sua media");
                    double media = calc.calcularNotas(0, 0, 0, 0, 0);
                    System.out.println("sua media do enem foi de " + media);
                    break;
                case "4":
                    limparTela();
                    System.out.println("\nSaindo...");
                    break;

                default:
                    System.out.println("\nOpçao inválida!");
                    break;
            }
        } while (!opcao.equals("3"));
    }

    public static void limparTela() {
        for (int i = 0; i < 70; i++) {
            System.out.println();
        }
    }
}
