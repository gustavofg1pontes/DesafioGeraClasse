package entities;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class GeradorClasse {
    //nome da classe a ser criada
    private String nomeClasse;
    //lista de propriedades que vao ser criadas com a classe
    private ArrayList<Propriedade> propriedades = new ArrayList<>();
    //arquivo criado
    File file;

    //construtor que pode dar erro de arquivos (IOException), por isso o throws IOException
    public GeradorClasse(String nomeClasse) throws IOException {
        //define o valor do atributo da classe pelo valor passado como parametro
        this.nomeClasse = nomeClasse;
        //cria um novo arquivo .java com o nome da classe
        //seleciona o local a ser criado e o cria
        this.file = new File(System.getProperty("user.dir") + "/src/classescriadas/" + this.nomeClasse + ".java");
    }

    //metodo para adicionar propriedades na lista de propriedades do gerador de classe
    public void addPropriedadeAClasse(Propriedade propriedade){
        this.propriedades.add(propriedade);
    }

    //funcao usada para escrever todos os dados no arquivo .java criado
    public void escreverClasse() throws IOException {
        this.file.createNewFile();
        //try com recursos
        try (BufferedWriter bf = new BufferedWriter(new FileWriter(file))){
            bf.write("package classescriadas;");
            bf.newLine();
            bf.newLine();
            bf.write("public class " + this.nomeClasse+ "{");
            bf.newLine();
            for(Propriedade propriedade : this.propriedades){
                bf.write("    private " + propriedade.getTipoVariavel() + " " + propriedade.getNomeVariavel() + ";");
                bf.newLine();
            }
            bf.newLine();
            for(Propriedade propriedade : this.propriedades){
                bf.write(propriedade.construtorGetter());
                bf.newLine();
                bf.write(propriedade.construtorSetter());
                bf.newLine();
            }
            bf.newLine();
            bf.write("}");
        }catch (Exception er){
            System.out.println("erro");
        }
    }
}
