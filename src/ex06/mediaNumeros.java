package ex06;


public class mediaNumeros {
    public static void main(String[] args) {
        
        int [] numeros  = {50,60,80};
        
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        
      int media =  soma / numeros.length;

      System.out.println("A média dos números é: " + media);
    }
}
