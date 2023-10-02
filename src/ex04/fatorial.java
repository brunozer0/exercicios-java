package ex04;

import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int num;
   

     System.out.println("Digite um número");
        num = scanner.nextInt();
    int fatorial = calculaFatorial(num);
    System.out.println("O fatorial do numero" + " "+ num+ " é " + fatorial);
    
    scanner.close();
}
public static int calculaFatorial(int num) {
    if(num == 0 || num == 1) {
        return 1;
    } else {
        return num * calculaFatorial(num -1);
    }
}
}
