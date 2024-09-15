/*
1. Uma turma possui 40 alunos. Faça um programa que leia o nome e a idade de todos os alunos e logo
em seguida imprima:
A. Total de alunos com idade menor ou igual a 16 anos check
B. Total de alunos com idade maior que 16 anos check
C. Média das idades check
D. Alunos com idade acima da média check
E. Nome e Idade do aluno mais novo check
F. Nome e Idade do aluno mais velho check
*/

import java.util.Scanner;

public class Gustavo1{
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int Maior16 = 0, Menor16 = 0, SomaIdades = 0, i, AcimaMedia = 0;
    int Media;
    String[] Nome = new String[40]; // Lista com todos os nomes
    int[] Idade = new int[40]; // Lista com todas as idades

    // lista para os mais novos e mais velhos 
    String[] NomeNovo = new String[40]; 
    String[] NomeVelho = new String[40];

    int[] IdadeCrescente = new int[40]; // Ordenação crescente
    int[] IdadeDecrescente = new int[40]; // Ordenação decrescente

    // Entrada de dados
    for (i = 0; i < 40; i++) {
      System.out.println("Digite o nome do aluno: ");
      Nome[i] = teclado.nextLine();
      System.out.println("Digite a idade do aluno: ");
      Idade[i] = teclado.nextInt();
      teclado.nextLine();

      // menores ou iguais a 16 anos
      if (Idade[i] <= 16){
        Menor16++;
      } 
      else {
        Maior16++;
      }

      // Soma de idades
      SomaIdades += Idade[i];

      IdadeCrescente[i] = Idade[i];
      IdadeDecrescente[i] = Idade[i];

      NomeNovo[i] = Nome[i];
      NomeVelho[i] = Nome[i];
    }

    Media = SomaIdades/40;

    //quantos alunos têm idade acima da média
    for (i = 0; i < 40; i++) {
      if (Idade[i] > Media) {
        AcimaMedia++;
      }
    }

    //idades em ordem crescente e decrescente com nomes
    for (i = 0; i < 40; i++) {
      for (int j = i + 1; j < 40; j++) {

        if (IdadeCrescente[i] > IdadeCrescente[j]) {
          // Troca de idade
          int auxIdade = IdadeCrescente[i];
          IdadeCrescente[i] = IdadeCrescente[j];
          IdadeCrescente[j] = auxIdade;

          // Troca de nomes correspondentes
          String auxNome = NomeNovo[i];
          NomeNovo[i] = NomeNovo[j];
          NomeNovo[j] = auxNome;
        }

        //decrescente
        if (IdadeDecrescente[i] < IdadeDecrescente[j]) {

          int auxIdade = IdadeDecrescente[i];
          IdadeDecrescente[i] = IdadeDecrescente[j];
          IdadeDecrescente[j] = auxIdade;

          String auxNome = NomeVelho[i];
          NomeVelho[i] = NomeVelho[j];
          NomeVelho[j] = auxNome;
        }
      }
    }


    System.out.println("===================== Infos ======================");
    System.out.println("A quantidade de alunos com mais de 16 anos é: " + Maior16);
    System.out.println("A quantidade de alunos com idade menor ou igual a 16 anos é: " + Menor16);
    System.out.println("Média da idade dos alunos: " + Media);
    System.out.println("Quantidade de alunos com idade acima da média: " + AcimaMedia);

    //metade mais nova da turma
    System.out.println("A metade mais nova da turma: ");
    for (i = 0; i < 20; i++) {
      System.out.println(NomeNovo[i] + " - " + IdadeCrescente[i] + " anos");
    }

    // Aluno mais novo
    System.out.println("O aluno mais novo é: " + NomeNovo[0] + " com " + IdadeCrescente[0] + " anos.");

    // Aluno mais velho
    System.out.println("O aluno mais velho é: " + NomeVelho[0] + " com " + IdadeDecrescente[0] + " anos.");
  }
}