package SistemaDeLogin;

import java.io.*;
import java.util.ArrayList;

public class UsuariosCadastro {
    private static final String FILE_NAME = "USUARIOS.txt";
    private static ArrayList<UsuariosCadastro> usuario;

    private String login;
    private String senha;

    public UsuariosCadastro(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public UsuariosCadastro(){
        usuario = new ArrayList<>();
        carregarDados();
    }

    public String toString() {
        return login + " " + senha;
    }

    public void adicionarNovoUsuario(String login, String senha) {
        if(verificarUsuarioExistente(login)) {
            System.out.println("Usuario existente!");
        }else{
            UsuariosCadastro NovoUsuario = new UsuariosCadastro(login, senha);
            usuario.add(NovoUsuario);
            salvarDados();
            System.out.println("conta cadastrada com sucesso!");
        }
    }

    public boolean verificarUsuario(String login, String senha) {
        for (UsuariosCadastro user : usuario) {
            if (user.login.equals(login) && user.senha.equals(senha)) {
                return true;
            }
        }
        return false;
    }

    public boolean verificarUsuarioExistente(String login) {
        for (UsuariosCadastro user : usuario) {
            if (user.login.equals(login)) {
                return true;
            }
        }
        return false;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login){
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha){
        this.senha = senha;
    }

    private static void carregarDados() {
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String linha;
            while ((linha = reader.readLine()) != null) {
                String[] dados = linha.split("\\s+");
                if (dados.length == 2) {
                    UsuariosCadastro usuarioNovo = new UsuariosCadastro(dados[0], dados[1]);
                    usuario.add(usuarioNovo);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao carregar dados: " + e.getMessage());
        }
    }


    private static void salvarDados() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (UsuariosCadastro dado : usuario) {
                writer.write(dado.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar dados: " + e.getMessage());
        }
    }
}
