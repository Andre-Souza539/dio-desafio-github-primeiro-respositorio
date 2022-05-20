package br.com.dio.metodos;

public class Main {

    public static void main(String[] args) {


        System.out.println("Exercício calculadora");
        System.out.println(Calculadora.soma(3, 6));
        System.out.println(Calculadora.subtracao(9, 1.8));
        System.out.println(Calculadora.multiplicacao(7, 8));
        System.out.println(Calculadora.divisao(5, 2.5));

        System.out.println("Exercício mensagem");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        System.out.println("Exercício empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }
}
