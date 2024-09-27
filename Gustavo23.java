/*23. Uma das atividades de recreação preferidas de Letícia é compor desenhos com linhas coloridas
esticadas entre preguinhos numa base de madeira. Quanto mais cruzamentos entre pares de linhas,
mais interessante fica a figura. Neste problema temos N pregos na vertical e N pregos na horizontal,
como na figura abaixo. Os pregos na vertical possuem uma numeração fixa, de 1 a N, de baixo para
cima. Os pregos na horizontal também são numerados de 1 a N, mas a ordem pode ser qualquer uma.
Letícia vai sempre esticar uma linha entre cada par de pregos que tiverem o mesmo número. Dada a
ordem dos pregos horizontais, seu programa deve computar o número total de cruzamentos entre pares
de linhas no desenho de Letícia. Por exemplo, os três desenhos da figura possuem, respectivamente, 0,
6 e 15 cruzamentos.

Entrada
A primeira linha da entrada contém um número natural N. A segunda linha contém N números naturais
distintos de 1 a N, representando a ordem dos pregos na horizontal.
Saída
Seu programa deve escrever uma linha na saída, contendo o número de cruzamentos entre pares de
linhas, conforme a descrição anterior.*/

import java.util.Scanner;

public class Gustavo23 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Número de pregos:");
    int N = scanner.nextInt();

    // Lê a ordem dos pregos horizontais
    int[] ordemHorizontal = new int[N];
    for (int i = 0; i < N; i++) {
      ordemHorizontal[i] = scanner.nextInt();
    }

    // Inicializa o contador de cruzamentos
    int cruzamentos = 0;

    // Percorre todas as linhas verticais
    for (int i = 0; i < N - 1; i++) {
      // Percorre as linhas verticais à direita da linha atual
      for (int j = i + 1; j < N; j++) {
        // Verifica se as linhas verticais i e j se cruzam
        // **Comparação correta:**
        if (ordemHorizontal[i] > ordemHorizontal[j]) {
          cruzamentos++;
        }
      }
    }

    // Imprime o número de cruzamentos
    System.out.println("Número de cruzamentos: " + cruzamentos);
  }
}