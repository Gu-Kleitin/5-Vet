/*O comitê olímpico está testando uma nova forma de pontuar as competições de arco e flecha, baseada
em penalidades. O atleta vai atirar N flechas no alvo, em sequência. A penalidade da K-ésima flecha
atirada é computada imediatamente após ela atingir o alvo, antes do próximo lançamento, e é igual ao
número de flechas que estão no alvo naquele momento cuja distância ao centro do alvo é menor ou
igual à distância da K-ésima flecha ao centro, excluindo a própria K-ésima flecha. Quer dizer, a
penalidade é o número das K - 1 flechas lançadas antes da K-ésima flecha que estão mais próximas ou
à mesma distância do centro do alvo, comparadas com a K-ésima flecha. A penalidade total é a soma
das penalidades das N flechas. Ganha o atleta que tiver a menor penalidade total ao final. Veja que a
penalidade total pode ser zero, se o atleta for bom o bastante para acertar numa sequência estritamente
decrescente de distâncias ao centro do alvo.
Neste problema, o centro do alvo está na origem (0; 0). Dada a
sequência de coordenadas dos pontos em que as sucessivas flechas
atingiram o alvo, seu programa deve computar a penalidade total final
do atleta.
Entrada
A primeira linha da entrada contém um inteiro N, representando a
quantidade de flechas lançadas. Cada uma das N linhas seguintes
contém dois inteiros, X e Y , indicando as coordenadas do ponto em
que cada flecha atingiu o alvo, definindo a sequência de lançamentos.
Saída
Imprima uma linha contendo um inteiro representando a penalidade total do atleta.*/

import java.util.Scanner;

public class Gustavo24 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Lê o número de flechas
    int N = scanner.nextInt();

    // Cria um array para armazenar as coordenadas das flechas
    int[][] flechas = new int[N][2];

    // Lê as coordenadas das flechas
    for (int i = 0; i < N; i++) {
      flechas[i][0] = scanner.nextInt();
      flechas[i][1] = scanner.nextInt();
    }

    // Calcula a penalidade total
    int penalidadeTotal = 0;
    for (int i = 0; i < N; i++) {
      int penalidadeFlecha = 0;
      for (int j = 0; j < i; j++) {
        // Calcula a distância ao centro do alvo para a flecha atual
        double distanciaFlechaAtual = Math.sqrt(flechas[i][0] * flechas[i][0] + flechas[i][1] * flechas[i][1]);

        // Calcula a distância ao centro do alvo para a flecha anterior
        double distanciaFlechaAnterior = Math.sqrt(flechas[j][0] * flechas[j][0] + flechas[j][1] * flechas[j][1]);

        // Se a flecha anterior está mais próxima ou na mesma distância do centro, incrementa a penalidade
        if (distanciaFlechaAnterior <= distanciaFlechaAtual) {
          penalidadeFlecha++;
        }
      }
      penalidadeTotal += penalidadeFlecha;
    }

    // Imprime a penalidade total
    System.out.println(penalidadeTotal);
  }
}