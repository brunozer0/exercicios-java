package ex10;

import java.util.Random;
import java.util.Scanner;

public class jogoAdvinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroDigitado;
        
       
        System.out.println("Advinhe o numero, de 1 ate 100");

      

        int minimo = 1;
        int maximo = 100;

        int numeroAleatorio = random.nextInt(maximo - minimo + 1) + minimo;
       
        do{
                    
        System.out.println("Digite seu palpite:");
        numeroDigitado = scanner.nextInt();

          if(numeroDigitado == numeroAleatorio) {
            System.out.println("voce acertou");
        }else if(numeroAleatorio > numeroDigitado) {
           System.out.println("voce errou, dica: o numero é maior"); 
        }else {
            System.out.println("Voce errou, dica: o numero é menor");
        }
        } while(numeroDigitado != numeroAleatorio);
        scanner.close();
        System.out.println("numero aleatório era: " + numeroAleatorio);
    }
}
