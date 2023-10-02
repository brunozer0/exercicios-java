package ex03;


import java.util.Scanner;

public class calculadora {
    public static void main(String[] args)  {
        Scanner scanner = new Scanner(System.in);

    

          Double valorUm;
          Double valorDois;
          String operacao;
          System.out.println("digite o primeiro valor");
          valorUm = scanner.nextDouble();
  
          System.out.println("Digite a operacao(+, -, /,  *):");
  
          operacao = scanner.next();
  
          System.out.println("Digite o valor dois: ");
          valorDois = scanner.nextDouble();
          
          System.out.println("resultado: " + calculo(valorUm, valorDois, operacao));
        scanner.close();
    }
    public static Double calculo(Double valorUm, Double valorDois, String operacao) {
        

        Double resultado = 0.0;

        switch(operacao){
            case "+":
          resultado=  valorUm + valorDois;
            break;

            case "-":
          resultado=  valorUm - valorDois;
            break;

            case "*":
          resultado=  valorUm * valorDois;
            break;

             case "/":
          resultado=  valorUm / valorDois;
            break;

            default:
            System.out.println("nao foi possivel calcular");
        }
        return resultado;
    }
}
