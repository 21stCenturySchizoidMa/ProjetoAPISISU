package Menus;

import java.util.Scanner;

public class MenuSecundario {
    private static Scanner choose;

    public MenuSecundario() {
        choose = new Scanner(System.in);
    }

    public String Exibirtela() {
        System.out.println("Qual das opções abaixo deseja utilizar");
        System.out.println("1.Listar Cursos");
        System.out.println("2.cadastrar informaçoes do usuario");
        System.out.println("3.informacoes do usuario");
        System.out.println("4.Sair");
        System.out.print("\nEscolha uma das opções acima: ");
        return choose.nextLine();
    }

    public Scanner getScanner(){
        return choose;
    }
}
