package br.com.dio;

import br.com.dio.model.gato;

public class PrimeiroPrograma {

    public static void main (String[] args) {

        gato gato = new gato();

        System.out.println(gato);

        Livro Livro1 = new Livro("Hobbit", 300);

        System.out.println(Livro1);


       /* int a = 5;
        int b = 3;
        System.out.println("Hello, World" + (a+b));*/


    }

    static class Livro {

        private String nome;
        private Integer numPaginas;

        public Livro(String nome, Integer numPaginas) {
            this.nome = nome;
            this.numPaginas = numPaginas;

        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(Integer numPaginas) {
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }
    }


}
