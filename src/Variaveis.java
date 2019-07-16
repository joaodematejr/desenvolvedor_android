package src;

public class Variaveis {
    // ENTRY POINT
    public static void main(String[] args) {
        System.out.println("Inicio do Programa");

        Integer idade = 41;
        Double valor = 10.1;
        Boolean status = true;
        String nome = "João";
        Character character = 'G';

        // TIPO DO DADO //NOME DA VARIAVEL / = / VALOR DA VARIAVEL
        System.out.println("Double: Max: " + Double.MAX_VALUE + " - Double: " + Double.MIN_VALUE);
        System.out.println("Float: Max: " + Float.MAX_VALUE + " - Min: " + Float.MIN_VALUE);
        System.out.println("Long: Max: " + Long.MAX_VALUE + " - Long: " + Long.MIN_VALUE);
        System.out.println("Integer: Max: " + Integer.MAX_VALUE + " - Min: " + Integer.MIN_VALUE);
        System.out.println("Short: Max: " + Short.MAX_VALUE + " - Min: " + Short.MIN_VALUE);
        System.out.println("Byte: Max: " + Byte.MAX_VALUE + " - Min: " + Byte.MIN_VALUE);
    }

}