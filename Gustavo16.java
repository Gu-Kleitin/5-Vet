/*16. Escreva um algoritmo que leia preencha e mostre um vetor de 10 posições, cada posição é composta
pelo fatorial da mesma.
vet = [0 1 2 6 24 120 720 5040 40320 362880]*/

public class Gustavo16 {
  public static void main(String[] args) {
    int[] Vet = new int[10];
    int Fatorial = 1;
    for (int i = 1; i < 10 ; i++){
      Fatorial = i;
      Vet[i] = 1;
      for (int j = 0 ; j < i ; j++){
        Vet[i] = Vet[i] * (Fatorial-j);
      }
    }
    System.out.print("Vet: [");
    for (int j = 0 ; j < 10 ; j++){
      System.out.print(Vet[j] + " ");
    }
    System.out.println("]");
  }
}
