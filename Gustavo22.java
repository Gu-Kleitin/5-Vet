/*22. Um experimento biológico utiliza uma fita de papel branco especial, na qual algumas gotas de um
reagente são colocadas em posições específicas. Inicialmente a gota de reagente faz com que o papel
se torne preto na posição em que foi colocada. A cada dia o reagente se propaga pelo papel, em todas
as direções, com velocidade de 1 posição por dia, colorindo a região em que o reagente se propagou. A
figura abaixo mostra um experimento com uma fita de 13 posições, com três gotas de reagente
inicialmente, colocadas nas posições 2, 6 e 13 (a posição 1 é a primeira mais à esquerda da fita). Ao
final do terceiro dia, a fita está completamente tomada pelo reagente.

Você foi contratado para escrever um programa que, dados o comprimento da fita de papel e as posições das
gotas de reagente no início do experimento, determine quantos dias serão necessários para a fita de papel ficar
completamente tomada pelo reagente.
Entrada
A primeira linha contém dois inteiros F e R, indicando respectivamente o comprimento da fita de papel, em
números de posições, e o número de gotas no início do experimento. A segunda linha contém R inteiros,
indicando as posições das gotas de reagente, que são dadas em ordem crescente.
Saída
Seu programa deve produzir uma única linha, contendo um único inteiro, o número de dias necessários
para que a fita de papel fique totalmente tomada pelo reagente.*/

import java.util.Scanner;

public class Gustavo22 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o comprimento da fita e o número de gotas pingadas nela");
    int comprimentoFita = scanner.nextInt();
    int numeroGotas = scanner.nextInt();

    System.out.println("Escreva a posição das gotas");
    int[] posicoesGotas = new int[numeroGotas];
    for (int i = 0; i < numeroGotas; i++) {
      posicoesGotas[i] = scanner.nextInt();
    }

    int dias = 0;
    int cobertas = numeroGotas; //número de posições cobertas é igual ao número de gotas

    int[] fita = new int[comprimentoFita];

    // Marca as posições das gotas como 1 (cobertas)
    for (int posicao : posicoesGotas) {
      fita[posicao - 1] = 1; // Ajusta o índice para começar em 0
    }

    // Enquanto a fita não estiver totalmente coberta
    while (cobertas < comprimentoFita) {
      dias++;

      // Cria um novo array para armazenar as novas posições cobertas
      boolean[] novasPosicoes = new boolean[comprimentoFita];

      // Percorre a fita e verifica se a posição está coberta (valor 1)
      for (int i = 0; i < comprimentoFita; i++) {
        if (fita[i] == 1) {
          // Se a posição está coberta, verifica as posições adjacentes
          if (i > 0 && fita[i - 1] == 0) {
            novasPosicoes[i - 1] = true; // Marca a posição à esquerda como coberta
          }
          if (i < comprimentoFita - 1 && fita[i + 1] == 0) {
            novasPosicoes[i + 1] = true; // Marca a posição à direita como coberta
          }
        }
      }

      // Atualiza o array da fita com as novas posições cobertas
      for (int i = 0; i < comprimentoFita; i++) {
        if (novasPosicoes[i]) {
          fita[i] = 1; // Marca a posição como coberta
          cobertas++;
        }
      }
    }

    // Imprime o número de dias
    System.out.println(dias);
  }
}