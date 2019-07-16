package src;

public class Funcao {

    public static void main(String[] args) {
        // CALCULAR BONUS DE UM FUNCIONARIO
        Funcao funcoes = new Funcao();
        funcoes.helloWorld();
        funcoes.hello("João", 18, true);

        System.out.println(funcoes.soma(2, 2));
    }

    private Integer soma(Integer a, Integer b) {
        return a + b;
    }

    private void helloWorld() {
        System.out.println("Olá Mundo !!!");
    }

    private void hello(String nome, Integer idade, Boolean status) {
        System.out.println("Olá " + nome + " Bem-vindo " + idade + " Seu Status é " + status);
    }

}