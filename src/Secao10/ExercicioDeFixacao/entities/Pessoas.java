package Secao10.ExercicioDeFixacao.entities;

public class Pessoas {
    private String nome;
    private int idade;
    private double altura;
    private char sexo;

    public Pessoas(double altura, char sexo) {
        this.altura = altura;
        this.sexo = sexo;
    }

    public Pessoas(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public Pessoas(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
