
/*14. Faça um algoritmo em JAVA que preencha dois vetores de 10 posições e exiba um terceiro vetor
resultante em que cada posição é a soma das posições dos outros vetores. Exemplo
vet1 = [10 27 3 -4 -6 -19 6 9 14 53 ]
vet2 = [ 0 -7 6 4 -5 15 -6 19 1 47 ]
vet3 = [10 20 9 0 -11 -4 0 28 15 100 ]*/

import java.util.Scanner;

public class Gustavo14 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Complete o vetor 1: ");
    int Vet1[] = new int[10];
    for(int i = 0; i < Vet1.length; i++){
      Vet1[i] = sc.nextInt();
    }
    System.out.println("Complete o vetor 2: ");
    int[] Vet2 = new int[10];
    for(int i = 0; i < Vet2.length; i++){
      Vet2[i] = sc.nextInt();
    }

    int[] Vet3 = new int[10];
    for(int i = 0; i < Vet3.length; i++){
      Vet3[i] = Vet1[i] + Vet2[i];
    }
    System.out.print("Vetor 3: [");
    for(int i = 0; i < Vet3.length; i++){
      System.out.print(Vet3[i] + " ");
    }
    System.out.println("]");
  }
}