/*9. Escreva um programa que leia um conjunto de 50 fichas correspondente à alunos e armazene-as em vetores, cada uma contendo, a altura e o código do sexo de uma pessoa (código = 1 se for masculino e 2 se for feminino), e calcule e imprima:
- A maior, menor e a médias das alturas da turma;
- As mulheres com altura acima da média da altura dos homens;
- Os homens com altura abaixo da média da altura das mulheres;
- As pessoas com altura abaixo da média da turma.*/

import java.util.Scanner;

public class Gustavo9{
  public static void main(String[]args){
    Scanner scan = new Scanner(System.in);

    //coisas para o código
    String Conjunto[] = new String[50];
    int Sexo[] = new int[50];
    double Altura[] = new double[50];
    double somaAlturaM= 0;
    double SomaAlturaF = 0;
    double SomaAltura=0;
    int QntdM = 0;
    int QntdF = 0;
    double MaiorAltura[] = new double[50];
    double MenorAltura[] = new double[50];
    double MediaM = 0; 
    double MediaF = 0; 
    double Media = 0; 
    
    System.out.println("Sexo:  Feminino | Masculino| \nCodigo:    2    |     1    |");
    System.out.println("Digite o código do sexo e a altura separados por vírgula. Ex:(1, 1.78)");
    for(int i=0; i<50; i++){
      Conjunto[i]=scan.nextLine();
    }
    //alocando os dados em seus vetores
    for(int i=0; i<50; i++){
      String[] partes = Conjunto[i].split(","); // Divide a string
      Sexo[i] = Integer.parseInt(partes[0]); //trás o código
      Altura[i] = Double.parseDouble(partes[1]); // trás a altura
      MenorAltura[i] = Altura[i];
      MaiorAltura[i] = Altura[i];
    }
    //fazendo a soma de altura masculina e feminina
    double SomaGeral= 0;
    int QntdAlunos = 0;
    for(int i=0; i<50; i++){
      QntdAlunos++;
      SomaGeral +=Altura[i];
      if(Sexo[i]==1){
        QntdM++;
        somaAlturaM += Altura[i];
      }
      if(Sexo[i]==2){
        QntdF++;
        SomaAlturaF += Altura[i];
      }
    }
    //verificação da menor altura
    for(int k = 0; k <50; k++){
      for(int j = k+1; j<50; j++){
        if(MenorAltura[k]>MenorAltura[j]){
          double AltAux = MenorAltura[k];
          MenorAltura[k] = MenorAltura[j];
          MenorAltura[j] = AltAux;
        }
      }
    }
    //verificação da maior altura
    for(int k = 0; k <50; k++) {
      for (int j = k + 1; j < 50; j++) {
        if (MaiorAltura[k] < MaiorAltura[j]) {
          double AltAux = MaiorAltura[k];
          MaiorAltura[k] = MaiorAltura[j];
          MaiorAltura[j] = AltAux;
        }
      }
    }
    Media = (SomaAlturaF+somaAlturaM)/QntdAlunos;
    MediaM= somaAlturaM/QntdM;
    MediaF = SomaAlturaF/QntdF;
    System.out.println("================Dados das Fichas================");
    System.out.println("A menor altura da turma tem: "+MenorAltura[0]+"cm");
    System.out.println("A maior altura da turma tem: "+MaiorAltura[0]+"cm");
    System.out.printf("A média de altura masculina da turma é: %.2f\n", MediaM, "cm");
    System.out.printf("A média de altura feminina da turma é: %.2f\n", MediaF, "cm");
    System.out.printf("A média de altura geral da turma é: %.2f\n", Media, "cm");
    double AlturaM[] = new double[QntdM];
    System.out.println("Os homens abaixo da média de altura feminina são:");
    int Abaixo = 0;
    for(int i=0; i<QntdM; i++){
      if(Sexo[i]==1) {
        AlturaM[i] = Altura[i];
        if(AlturaM[i] < MediaF){
          Abaixo++;
          for(int h=0; h<Abaixo; h++){
            System.out.print ( AlturaM[h] +" ");
            break;
          }
        }
        if(AlturaM[i]>MediaF){
          System.out.println("Não tem meninos abaixo da media feminina");
          break;
        }
      }
    }
    System.out.println("As pessoas abaixo da média da turma são: ");
    int Abaixo2 = 0;
    for(int i=0; i<50; i++){
      if(Altura[i]<Media){
        Abaixo2++;
        System.out.println(Altura[i]+" ");
      }
    }

  }
}