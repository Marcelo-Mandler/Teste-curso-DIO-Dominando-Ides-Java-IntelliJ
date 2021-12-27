package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato cat = new Gato();
        cat.setNome("Chana");
        cat.setCor("Caramelo");
        cat.setIdade(5);

        System.out.println("O nome da minha gata é " + cat.getNome() + " , ela é da cor " + cat.getCor() + " e tem " + cat.getIdade() + " anos de idades.");
    }
}
