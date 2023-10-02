package ex09;

import java.util.Scanner;

public class conversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temperatura;
        int escolha;

        System.out.println("Escolha a opcao de conversao: ");
        System.out.println("1 => Celsius para Fahrenheit");
        System.out.println("2 => Fahrenheit para Celsius");
        escolha = scanner.nextInt();

        if(escolha == 1) {

            System.out.println("Digite a temperatura em celsius, ex: 25");
            temperatura = scanner.nextInt();
            scanner.close();
            int temperaturaFahrenheit = (temperatura * 9/5) + 32;
    
            System.out.println(temperatura + "°C equivale a " + temperaturaFahrenheit + "°F");
        
        } else if (escolha == 2){
            System.out.println("Digite a temperatura em Fahrenheit:");
            temperatura = scanner.nextInt();
            int temperaturaCelsius = (temperatura - 32) * 5/9;
            System.out.println(temperatura + "°F equivale a " + temperaturaCelsius + "°C");
        } else {
            System.out.println("escolha invalida invalido");
        }
    }
}
