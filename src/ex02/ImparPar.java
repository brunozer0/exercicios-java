package ex02;

import java.util.Scanner;

public class ImparPar {
    
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numeroDigitado;
    System.out.println("digite o numero");
    numeroDigitado = scanner.nextInt();
    
        if(numeroDigitado %2 == 0) {
            System.out.println("seu numero é par");
        }else {
            System.out.println("seu numero é ímpar");
        }
        scanner.close();
    }
    
}
