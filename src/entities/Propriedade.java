package entities;

public class Propriedade {
    //atributos das propriedades, tipo da propriedade e o nome da propriedade da classe a ser criada
    private String tipoVariavel;
    private String nomeVariavel;

    //construtor da classe propriedade passando todos os atributos(nome e tipo da variavel)
    public Propriedade(String tipoVariavel, String nomeVariavel) {
        this.tipoVariavel = tipoVariavel;
        this.nomeVariavel = nomeVariavel;
    }

    //alt + insert
    //constroi o metodo get da propriedade atual
    public String construtorGetter() {
        return "    public " + this.tipoVariavel + " get" + this.nomeVariavel + "(){\n" +
                "        return this." + this.nomeVariavel + ";\n" +
                "    }";
    }

    //constroi o metodo set da propriedade atual
    public String construtorSetter() {
        return "    public void set" + this.nomeVariavel + "(" + this.tipoVariavel + " " + this.nomeVariavel + ") {\n" +
                "        this." + this.nomeVariavel + " = " + this.nomeVariavel + ";\n" +
                "    }";
    }

    //getters e setters
    public String getTipoVariavel() {
        return tipoVariavel;
    }

    public void setTipoVariavel(String tipoVariavel) {
        this.tipoVariavel = tipoVariavel;
    }

    public String getNomeVariavel() {
        return nomeVariavel;
    }

    public void setNomeVariavel(String nomeVariavel) {
        this.nomeVariavel = nomeVariavel;
    }
}
