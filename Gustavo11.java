/*11. Faça um programa que carregue dois vetores de dez elementos e mostre um terceiro vetor resultante da
intercalação desses dois vetores.*/

import java.util.Scanner;

public class Gustavo11{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Você vai preencher dois vetores com 10 posições :)");
        System.out.println("Vetor 1:");
        double Vet1[] = new double[10];
        for(int i = 0; i<10; i++){
            Vet1[i] = scan.nextDouble();
        }
        System.out.println("Vetor 2:");
        double Vet2[] = new double[10];
        for(int i = 0; i<10; i++){
            Vet2[i] = scan.nextDouble();
        }
        //intercalando os vetores
        double Vet3[] = new double[10];
        for(int i=0; i<10; i++){
            if(i%2 == 0){
               Vet3[i]=Vet2[i];
            }
            else{
                Vet3[i]=Vet1[i];
            }
            System.out.println(Vet3[i]);
        }
    }
}

