package ex08;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String palavra;
         System.out.println("Digite a palavra");
        palavra = scanner.next();
        boolean ehUmPalindromo = verificarPalindromo(palavra);

        if (ehUmPalindromo) {
            System.out.println("a palavra " + palavra + " é um palindromo ");
        } else {
            System.out.println("a palavra " + palavra + " não é um palindromo.");
        }
                scanner.close();

    }

    public static boolean verificarPalindromo(String palavra) {
       
        StringBuilder inverterPalavra = new StringBuilder(palavra).reverse();

        return palavra.equalsIgnoreCase(inverterPalavra.toString());
    }
    
}
