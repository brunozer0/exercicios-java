package ex07;

import java.util.Scanner;

public class Taboada {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int num;
    
    System.out.println("digite o numero da taboada");
    num = scanner.nextInt();
    for(int i=1; i <=10; i ++) {
        int soma = num * i;
        System.out.println(num+"x"+ i +" =" + soma);   
    }
    scanner.close();
 }
}
