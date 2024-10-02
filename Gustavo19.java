/*Implemente um algoritmo que preencha com valores inteiros um vetor de 10 posições. Em seguida
solicite o usuário que digite um valor qualquer e pesquise se o valor informado pelo usuário pertence
ou não ao vetor preenchido inicialmente. Caso não, mostre a mensagem “O valor X não está presente
no vetor”; caso sim, mostre a mensagem “O valor X está na posição Y do vetor”. Exemplo:
Vetor preenchido: 50; 60; 15; 22; 33; 84; 100
Valor digitado pelo usuário: 30 -> Mensagem: “Valor 30 não está presente no vetor”
Valor digitado pelo usuário: 84 -> Mensagem: “Valor 84 está na posição 5 no vetor”*/

import java.util.Scanner;

public class Gustavo19 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Cria o vetor de 10 posições
    int[] vetor = new int[10];

    // Preenche o vetor com valores inteiros
    System.out.println("Preenchendo o vetor com valores inteiros:");
    for (int i = 0; i < vetor.length; i++) {
      System.out.print("Digite o valor para a posição " + i + ": ");
      vetor[i] = scanner.nextInt();
    }

    // Solicita ao usuário que digite um valor
    System.out.print("\nDigite um valor para pesquisar no vetor: ");
    int valorPesquisa = scanner.nextInt();

    // Pesquisa o valor no vetor
    boolean encontrado = false;
    int posicao = -1;
    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] == valorPesquisa) {
        encontrado = true;
        posicao = i;
        break;
      }
    }

    // Exibe a mensagem de resultado
    if (encontrado) {
      System.out.println("O valor " + valorPesquisa + " está na posição " + posicao + " do vetor.");
    } else {
      System.out.println("O valor " + valorPesquisa + " não está presente no vetor.");
    }
  }
}