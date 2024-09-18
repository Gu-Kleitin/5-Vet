/*18. O desvio padrão de uma amostra de dados calcula o quanto de variação existe da amostra em relação à
média. Valores baixos indicam que os dados tendem a estar próximos à média, por outro lado, valores
altos indicam maior dispersão dos dados. O gerente de produção da Refrigerator Tabajará está
avaliando o processo de fabricação de seus refrigerantes em lata, especificamente a etapa de
preenchimento do conteúdo. As latas devem possuir 390 ml, com desvio padrão de + ou – 5 ml. Na
análise foram coletadas 20 amostras aleatórias da linha de produção, medindo-se a quantidade de
produto das mesmas. Você é o programador da empresa, e ficou incumbido de implementar um
programa que auxilie seu gerente, mostrando ao mesmo a média e o desvio padrão entre os elementos
das amostras. Além disso, exiba se o processo deve ou não ser revisado.*/

import java.util.Scanner;

public class Gustavo18 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double DPE = 5;
    System.out.println("Vamos calcular o desvio padrão do enchimento das latas");
    System.out.println("Nossa amostra contém 20 latas, preencha quantos mL cada uma tem: ");
    int[] mLs = new int[20];
    for (int i = 0; i < 20; i++) {
      mLs[i] = sc.nextInt();
    }
    double Media = 0;
    int Somatorio=0;
    for (int i = 0; i < mLs.length; i++) {
      Somatorio += mLs[i];
      Media = Somatorio/20;
    }
    //cálculo da diferença dos valores
    double diferenca=0;
    for (int i = 0; i < mLs.length; i++) {
      diferenca += Math.pow((mLs[i]-Media), 2);
    }
    double Varianca = diferenca/mLs.length;
    double DP = Math.sqrt(Varianca);

    //prints
    System.out.format("A média das amostras é de %.2f",Media);
    System.out.printf("\nO desvio padrão das amostras é de %.2f",DP);
    if(DP>4.6 && DP<5.5){
      System.out.println("\nO processo não precisa ser revisado");
    }
    else{
      System.out.println("\nPrecisa revisar o processo");
    }
  }
}