/*8. Construa um programa JAVA que preenche dois vetores reais de 10 posições, depois crie um terceiro vetor cujo conteúdo de cada posição é: 1, se o número armazenado em uma posição do vetor é o mesmo armazenado na posição respectiva do 2°, e 0, caso contrário.*/

import java.util.Scanner;

public class Gustavo8{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Preencha o vetor 1: ");
    double Vet1[] = new double[10];
    for(int i = 0; i<10; i++){
      Vet1[i] = scan.nextDouble();
    }
    System.out.println("Preencha o vetor 2: ");
    double Vet2[] = new double[10];
    for(int i = 0; i<10; i++){
      Vet2[i] = scan.nextDouble();
    }
    int Vet3[] = new int[10];
    for(int i=0; i<10; i++){
      if(Vet1[i]==Vet2[i]){
        Vet3[i] = 1;
      }
      else{
        Vet3[i] = 0;
      }
    }
    for(int i= 0; i<10; i++){
      System.out.print(Vet3[i]+" ");
    }
  }
}