package Menus;

import java.util.Scanner;

public class TelaPrincipal {
    private static Scanner choose;

    public TelaPrincipal() {
        choose = new Scanner(System.in);
    }

    public String Exibirtela() {
        System.out.println("\nQual das opções abaixo deseja utilizar");
        System.out.println("\n1.Listar Cursos");
        System.out.println("2.Informações Cursos");
        System.out.println("3.Calcular Nota");
        System.out.println("4.Sair");
        System.out.print("\nEscolha uma das opções acima: ");
        return choose.nextLine();
    }

    public Scanner getScanner(){
        return choose;
    }
}
