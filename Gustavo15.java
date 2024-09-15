/*15. Faça um programa que carregue um vetor de 5 posições, calcule e mostre o somatório e o produtório
do mesmo.*/

import java.util.Scanner;

public class Gustavo15 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Preencha o vetor: ");
    int[] Vet = new int[5];
    int Somatorio = 0;
    int Produtorio = 1;
    for (int i = 0; i < Vet.length; i++) {
      Vet[i] = sc.nextInt();
      Somatorio += Vet[i];
      Produtorio *= Vet[i];
    }
    System.out.println(Somatorio);
    System.out.println(Produtorio);
  }
}