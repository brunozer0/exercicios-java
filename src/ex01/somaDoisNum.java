package ex01;

import java.util.Scanner;

public class somaDoisNum {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    

    int valorUm;
    int valorDois;
    int soma;
    System.out.println("digite o primeiro valor");
    valorUm = scanner.nextInt();


    System.out.println("Digite o segundo valor: ");
    valorDois = scanner.nextInt();
    soma = valorUm + valorDois;
    System.out.println("a soma é: " + soma);
    scanner.close();
}

}
