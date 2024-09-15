/*2. Faça um programa que solicite o preenchimento de um vetor com 10 posições chamado VetorOriginal. Em seguida, o programa deve armazenar os números digitados de maneira invertida em vetor chamado VetorInvertido.*/

import java.util.Scanner;

public class Gustavo2{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    int[] VetorOriginal = new int[10];
    System.out.println("Digite números para preencher o vetor: ");
    for(int i = 0; i <10; i++){
      VetorOriginal[i] = scan.nextInt();
    }
    System.out.println("Agora vamos inverter seu vetor");
    int[] VetorInvertido = new int[10];
    for(int i = 0; i<10; i++){
      VetorInvertido[i] = VetorOriginal[9-i];
      System.out.println(VetorInvertido[i]);
    }
    
  }
}