/*10. Faça um programa que preencha um vetor A de 10 posições e calcule o valor de S da seguinte forma:
S = (a[0] - a[9]) 2 + (a[1] - a[8])2 + (a[2] - a[7])2 + (a[3] - a[6])2 + (a[4] - a[5])2*/

import java.util.Scanner;

public class Gustavo10 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Preencha o vetor com números inteiros: ");
        int a[] = new int[10];
        int S = 0;
        for(int i=0; i<10; i++){
            a[i] = scan.nextInt();
            S = ((a[0]-a[9])*2+(a[1]-a[8])*2+(a[2]-a[7])*2+(a[3]-a[6])*2+(a[4]-a[5])*2);
        }
        System.out.println(S);
    }
}