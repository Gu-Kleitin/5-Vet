/*7. Fazer um algoritmo que:
a. Leia um conjunto de valores inteiros correspondentes a 80 notas dos alunos de uma turma, notas estas que variam de 0 a 10 (valide as entradas);
b. Calcule a frequência absoluta e a frequência relativa de cada nota;
c. Imprima uma tabela contendo os valores das notas (de 0 a 10) e suas respectivas frequências absoluta e relativa.*/

import java.util.Scanner;

public class Gustavo7{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite as notas dos alunos: ");
    int Notas[]= new int[80];
    double FR[] = new double[80];
    int FA[] = new int[11];
    for(int i = 0; i<80; i++){
      Notas[i]= scan.nextInt();
      if(Notas[i]>10){
        System.out.println("Essa prova está anulada");
      }
      else{
        FA[Notas[i]]++;
      }
    }
    for (int i = 0; i <= 10; i++) {
      FR[i] = (double) FA[i]/80;
    }
    System.out.println("===================== Tabela de Frequências ======================");
    System.out.println("Nota | Frequência Absoluta | Frequência Relativa");
    System.out.println("-----|---------------------|---------------------");
    for (int i = 0; i <= 10; i++) {
      System.out.println(i + "    | " + FA[i] + "                   | " + FR[i]+"%");
    }
  }
}