/*13. Intercalação é o processo utilizado para construir uma tabela ordenada, de tamanho n+m, a partir de
duas tabelas já ordenadas de tamanhos n e m. Por exemplo, a partir das tabelas A = {1,3,6,7} e B =
{2,4,5}, construímos a tabela C = {1,2,3,4,5,6,7}. Faça um algoritmo que:
a. Leia NA, número de elementos do conjunto A (NA<=100);
b. Leia, em seguida, os elementos do conjunto A;
c. Leia, após o valor de NB, número de elementos do conjunto B(NB<=100);
d. Leia, finalmente, os elementos do conjunto B;
e. Crie e imprima um conjunto C, ordenado, de tamanho NA + NB, a partir dos conjuntos originais A eB.
Obs: Considere os elementos de A e B como inteiros e já ordenados.*/

import java.util.*;

public class Gustavo13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Sarve! Vamos fazer uma intercalação de tabelas");
        System.out.println("Digite qual o será o tamanho da Tabela A: ");
        int num = sc.nextInt();
        while(num > 100){
            System.out.println("É você quem vai preencher a tabela, então me ajude e se ajude, o tamanho não pode exceder a 100");
            sc.nextLine();
            num = sc.nextInt();
        }
        int[] CA = new int [num];
        System.out.println("É isso, agora digite os números (tem que ser inteiro)");
        for(int i = 0; i < num; i++){
            CA[i]=sc.nextInt();
        }

        System.out.println("Digite o tamanho da tabela B: ");
        num = sc.nextInt();
        while(num > 100){
            System.out.println("É você quem vai preencher a tabela, então me ajude e se ajude, o tamanho não pode exceder a 100");
            sc.nextLine();
            num = sc.nextInt();
        }
        int[] CB = new int [num];
        System.out.println("É isso, agora digite os números (tem que ser inteiro)");
        for(int i = 0; i < num; i++){
            CB[i]=sc.nextInt();
        }

        //ordenando:
        for(int k = 0; k < num; k++){
            for(int j = 0; j < num; j++){
                if(CA[k]<CA[j]){
                    int CAux = CA[k];
                    CA[k]=CA[j];
                    CA[j]=CAux;
                }
            }
            for(int j = 0; j < num; j++){
                if(CB[k]<CB[j]){
                    int CBux = CB[k];
                    CB[k]=CB[j];
                    CB[j]=CBux;
                }
            }
        }

        int[] CC = new int[CB.length+CA.length];

        int TamA = 0;
        int TamB = 0;
        for(int i = 0 ; i < CC.length ; i++){
            if(TamA<CA.length && TamB<CB.length) {
                if (CA[TamA] <= CB[TamB]) {
                    CC[i] = CA[TamA];
                    TamA++;
                } else{
                    CC[i] = CB[TamB];
                    TamB++;
                }
            }
            else {
                if(TamA<CA.length){
                    CC[i] = CA[TamA];
                    TamA++;
                }
                else if(TamB<CB.length){
                    CC[i] = CB[TamB];
                    TamB++;
                }
            }
        }
        System.out.println("Hora da verdade");
        System.out.print("Conjunto/Tabela C: [");
        for(int i = 0 ; i < CC.length ; i++){
            System.out.print(CC[i] + " ");
        }
        System.out.println("]");
    }
}