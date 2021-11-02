package br.com.dio.model;

import java.util.Objects;

public class Gato {

    private String mome;
    private String cor;
    private Integer idade;

    public Gato() {}

    public Gato(String mome, String cor, Integer idade) {
        this.mome = mome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getMome() {
        return mome;
    }

    public void setMome(String mome) {
        this.mome = mome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gato gato = (Gato) o;
        return Objects.equals(mome, gato.mome) && Objects.equals(cor, gato.cor) && Objects.equals(idade, gato.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mome, cor, idade);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "mome='" + mome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }
}
