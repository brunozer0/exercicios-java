package ex05;

import java.util.Scanner;

public class Contagem {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num;
    System.out.println("digite o numero para contagem regresiva");
    num = scanner.nextInt();
    
    if (num <=0) {
        System.out.println("digite um numero valido");
    } else {
        System.out.println("contagem regressiva de "+ num + " ate 1: ");
        for(int i = num; i>= 1; i--){
            System.out.println(i);
        }
    }
    scanner.close();
    
    }
}
