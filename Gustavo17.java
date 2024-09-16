/*17. Desenvolva um programa que identifique, armazene em um vetor e mostre os 100 primeiros números primos a partir de 1.
 O algoritmo fica muito mais eficiente utilizando o crivo de Eratóstenes. Como desafio, implemente o algoritmo utilizando a “forma tradicional” e depois utilizando o crivo de
Eratóstenes, compute os tempos de ambas implementações e verifique a diferença entre os mesmos.*/

public class Gustavo17 {
  public static void main(String[] args) {

    int numero = 1, QntdP = 1;

    int[] VetP = new int[100];
    while(QntdP!= VetP.length) {
      for(int i = 1; i < VetP.length; i++){

        if (Primo(numero)){
          VetP[QntdP] = numero;
          QntdP++;
        }
        numero++;
      }
    }

    for(int i = 1; i < VetP.length; i++){
      System.out.println(i+"° número primo: "+VetP[i] + " ");
    }
  }

  public static boolean Primo(int n) {
    if (n <= 1) {
      return false;
    }
    if (n == 2) {
      return true;
    }
    if (n % 2 == 0) {
      return false;
    }
    for (int i = 3; i <= Math.sqrt(n); i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}