/*5. Em uma competição somente atletas que possuem altura maior ou igual a média geral das alturas dos inscritos podem participar. Sabe-se que a organização recebeu 20 inscrições. Faça um programa que identifique e mostre quais atletas podem participar da competição.*/

import java.util.Scanner;

public class Gustavo5{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Digite a altura dos atletas: ");
    double Altura[] = new double[20];
    double Somatorio = 0;
    int contador = 0;
    for(int i=0; i<20; i++){
      Altura[i] = scan.nextDouble();
      Somatorio +=Altura[i];
    }
    double Media = Somatorio/20;
    for(int i=0; i<20; i++){
      if(Altura[i]>Media){
        contador++;
        System.out.println("O atleta n° "+i+" com "+Altura[i]+"cm está apto para participar da competição");
      }
    }
  }
}