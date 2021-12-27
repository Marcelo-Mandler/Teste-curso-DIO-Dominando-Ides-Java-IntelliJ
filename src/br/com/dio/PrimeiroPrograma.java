package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato cat = new Gato();
        cat.setNome("Chana");
        cat.setCor("Caramelo");
        cat.setIdade(5);

        System.out.println("O nome da minha gata é " + cat.getNome() + " , ela é da cor " + cat.getCor() + " e tem " + cat.getIdade() + " anos de idades.");

        Livros book = new Livros("Trilogia O Senhos dos Anéis", 1300);
        System.out.println("Meus livros favoritos são a " + book.getNome() + " que tem " + book.getNrpag() + " páginas.");

    }
}

class Livros{
    private String nome;
    private Integer nrpag;

    public Livros(String nome, Integer nrpag) {
        this.nome = nome;
        this.nrpag = nrpag;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNrpag() {
        return nrpag;
    }

    public void setNrpag(Integer nrpag) {
        this.nrpag = nrpag;
    }

    @Override
    public String toString() {
        return "Livros{" +
                "nome='" + nome + '\'' +
                ", nrpag=" + nrpag +
                '}';
    }
}
