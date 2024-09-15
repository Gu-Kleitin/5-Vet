/*12. Faça um programa que preencha um vetor com 10 números digitados pelo usuário e em seguida crie e
mostre um vetor ordenado de forma crescente e outro vetor ordenado de forma decrescente.*/

import java.util.*;

public class Gustavo12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 10 números inteiros: ");
        int Vet[]=new int[10];
        int VetCres[] = new int[10];
        int VetDecres[] = new int[10];
        for(int i=0; i<10; i++){
            Vet[i]=scan.nextInt();

            VetCres[i]=Vet[i];
            VetDecres[i]=Vet[i];
        }
        //ordenação
        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                if(VetCres[i]<VetCres[j]){
                    int VetAux = VetCres[i];
                    VetCres[i] = VetCres[j];
                    VetCres[j] = VetAux;
                }
                if(VetDecres[i]>VetDecres[j]){
                    int VetAux = VetDecres[i];
                    VetDecres[i] = VetDecres[j];
                    VetDecres[j] = VetAux;
                }
            }
        }
        System.out.print("Vetor Crescente [");
        for(int i=0; i<10; i++){
            System.out.print(VetCres[i]+" ");
        }
        System.out.println("]");
        System.out.print("Vetor Decrescente [");
        for(int i=0; i<10; i++){
            System.out.print(VetDecres[i]+" ");
        }
        System.out.println("]");
    }
}
