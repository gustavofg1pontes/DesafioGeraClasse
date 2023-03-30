package application;

import entities.GeradorClasse;
import entities.Propriedade;
import views.MainFrame;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        // Novo frame principal
        new MainFrame();
        //testes de gerador de classe
        try {
            GeradorClasse meuGerador = new GeradorClasse("Classe");
            meuGerador.addPropriedadeAClasse(new Propriedade("String", "teste"));
            meuGerador.addPropriedadeAClasse(new Propriedade("int", "teste2"));
            meuGerador.escreverClasse();
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}