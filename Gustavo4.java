/*4. Faça um programa em JAVA que gere um vetor com 10 posições onde cada elemento coresponde ao quadrado de sua posição. Imprima o vetor resultante.*/

public class Gustavo4{
  public static void main(String[]args){
    int vet[] = new int[10];
    for(int i=0; i<10; i++){
      double n = i;
      double n2= Math.pow(n,2);
      int n22 = (int)n2;
      vet[i]=n22;
      System.out.println(vet[i]);
    }
  }
}