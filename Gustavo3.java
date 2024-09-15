/*3. Faça um programa em JAVA que carregue em um vetor os N primeiros valores da serie de Fibonacci.
Fibonacci = [1, 1, 2, 3, 5, 8, 13, 21, ....].*/

import java.util.Scanner;

public class Gustavo3{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Quantos números de Fibonacci você quer ver? ");
    int Nums = scan.nextInt();
    int num1=1, num2 = 0;
    long Fibonacci[] = new long[Nums];
    System.out.println("Se liga na mágica: \n");
    System.out.println(1);
    for(int i = 2; i<Nums; i++){
      Fibonacci[0]=1;
      Fibonacci[1]=1;
      Fibonacci[i]= Fibonacci[i-1]+Fibonacci[i-2];
      System.out.println(Fibonacci[i]);
    }
  }
}