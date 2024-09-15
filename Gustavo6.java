/*6. Leia um conjunto de N números inteiros (N<=100). Faça a divisão destes números em dois outros conjuntos seguindo a regra: Conjunto 1 – Apenas números positivos e pares e Conjunto 2 – Apenas números ímpares e/ou negativos.*/

import java.util.Scanner;

public class Gustavo6{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    int Conjunto1[]=new int[100];
    int Conjunto2[]=new int[100];
    System.out.println("Quantos números terão no conjunto? ");
    int Qntd = scan.nextInt();
    if(Qntd<=100){
      int Numeros;
      System.out.println("Digite os números inteiros para serem organizados: ");
      int indice1 = 0;
      int indice2 = 0;
      for(int i = 0; i<Qntd; i++){
        Numeros=scan.nextInt();
        if(Numeros<=100){
          double div = Numeros%2;

          if(div!=0){
            Conjunto2[indice2]=Numeros;
            indice2++;
          }
          else if(Numeros<0){
            Conjunto2[indice2]=Numeros;
            indice2++;
          }
          else{
            Conjunto1[indice1]=Numeros;
            indice1++;
          }
        }
        else{
          System.out.println("Pode n");
        }
      }
      System.out.println("Números do Conjunto 1:");
      for(int i=0; i<indice1; i++){
        System.out.print(Conjunto1[i] + " ");
      }
      System.out.println("\nNúmeros do Conjunto 2:");
      for(int i=0; i<indice2; i++){
        System.out.print(Conjunto2[i] + " ");
      }
      System.out.println();
    }
    else{
      System.out.println("Pode n");
    }
  }
}