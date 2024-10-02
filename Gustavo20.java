/*20. Faça um programa que simule um controle bancário. O sistema bancário tem a capacidade de
armazenar as informações somente de 50 usuários e contém as opções de cadastrar usuário; efetuar
depósito; efetuar saque; consultar saldo em conta e finalizar o programa. O seguinte menu deverá
aparecer o seguinte menu na tela para o usuário: (Desafio: fazer com interface gráfica)
----Menu de Operações----
1-Efetuar depósito
2-Efetuar saque
3-Consultar saldo em conta;
4-Finalizar o programa
- Na opção de cadastrar usuário devem ser lidos os seguintes dados: nome do usuário (vetor de String
com 50 posições); número da conta (vetor inteiro de 50 posições); saldo da conta (vetor float com 50
posições). O número da conta devem ser armazenados em um vetor de números inteiros (não pode
haver mais de uma conta com o mesmo código) e os saldos devem ser armazenados em um vetor de
números reais. O saldo deverá ser cadastrado na mesma posição do código. Por exemplo, se a conta
504 foi armazenada na quinta posição do vetor de número de contas, seu saldo deverá ficar na quinta
posição do vetor de saldos.
- Para efetuar o depósito, deve-se solicitar o número da conta e o valor a ser depositado. Se a conta não
estiver cadastrada, deverá aparecer a mensagem “Conta não encontrada!” e voltar ao menu inicial. Se a
conta existir, atualizar e exibir o novo saldo;
- Para efetuar saque, deve-se solicitar o código da conta e o valor a ser sacado. Se a conta não estiver
cadastrada, deverá aparecer a mensagem “Conta não encontrada!” e voltar ao menu. Se a conta existir,
verificar se o seu saldo é suficiente para cobrir o saque. (Suponha que a conta não possa ficar com
saldo negativo). Se o saldo for suficiente, realizar o saque, exibir o novo saldo e voltar ao menu. Caso
contrário, mostrar a mensagem “Saldo insuficiente!” e voltar ao menu.
-Para consultar saldo em conta, deve-se solicitar o número da conta a ser pesquisada. Se a conta não
estiver cadastrada, deverá aparecer a mensagem “Conta não encontrada!”; senão, mostrar a conta com
seu respectivo saldo e voltar ao menu;
O programa termina quando for digitada a opção 4 – Finalizar o programa.*/

import java.util.Scanner;

public class Gustavo20 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Define o tamanho máximo de usuários
    int MAX_USUARIOS = 50;

    // Declara os vetores para armazenar os dados dos usuários
    String[] nomes = new String[MAX_USUARIOS];
    int[] contas = new int[MAX_USUARIOS];
    float[] saldos = new float[MAX_USUARIOS];

    // Inicializa o contador de usuários
    int numUsuarios = 0;

    // Loop principal do programa
    while (true) {
      // Exibe o menu
      System.out.println("Menu de Operações");
      System.out.println("1. Cadastrar Usuário"); // Adiciona opção de cadastro
      System.out.println("2. Efetuar depósito");
      System.out.println("3. Efetuar saque");
      System.out.println("4. Consultar saldo em conta");
      System.out.println("5. Finalizar o programa"); // Ajusta o número da opção Finalizar
      System.out.print("Digite a opção desejada: ");

      // Lê a opção do usuário
      int opcao = scanner.nextInt();

      switch (opcao) {
        case 1: // Cadastrar Usuário
          if (numUsuarios < MAX_USUARIOS) {
            System.out.print("Digite o nome do usuário: ");
            scanner.nextLine(); // Consome o \n da entrada anterior
            nomes[numUsuarios] = scanner.nextLine();

            System.out.print("Digite o número da conta: ");
            contas[numUsuarios] = scanner.nextInt();

            // Verifica se a conta já existe
            boolean contaExistente = false;
            for (int i = 0; i < numUsuarios; i++) {
              if (contas[i] == contas[numUsuarios]) {
                contaExistente = true;
                break;
              }
            }

            if (!contaExistente) {
              System.out.print("Digite o saldo inicial: ");
              saldos[numUsuarios] = scanner.nextFloat();

              numUsuarios++;
              System.out.println("Usuário cadastrado com sucesso!");
            } else {
              System.out.println("Conta já existente!");
            }
          } else {
            System.out.println("Limite de usuários atingido!");
          }
          break;

        case 2: // Efetuar depósito
          System.out.print("Digite o número da conta: ");
          int contaDeposito = scanner.nextInt();
          // Procura a conta no vetor de contas
          int posicaoConta = -1;
          for (int i = 0; i < numUsuarios; i++) {
            if (contas[i] == contaDeposito) {
              posicaoConta = i;
              break;
            }
          }
          // Verifica se a conta foi encontrada
          if (posicaoConta != -1) {
            System.out.print("Digite o valor a ser depositado: ");
            float valorDeposito = scanner.nextFloat();
            // Atualiza o saldo da conta
            saldos[posicaoConta] += valorDeposito;
            System.out.println("Depósito realizado com sucesso! Novo saldo: " + saldos[posicaoConta]);
          } else {
            System.out.println("Conta não encontrada!");
          }
          break;

        case 3: // Efetuar saque
          System.out.print("Digite o número da conta: ");
          int contaSaque = scanner.nextInt();
          // Procura a conta no vetor de contas
          posicaoConta = -1;
          for (int i = 0; i < numUsuarios; i++) {
            if (contas[i] == contaSaque) {
              posicaoConta = i;
              break;
            }
          }
          // Verifica se a conta foi encontrada
          if (posicaoConta != -1) {
            System.out.print("Digite o valor a ser sacado: ");
            float valorSaque = scanner.nextFloat();
            // Verifica se o saldo é suficiente
            if (saldos[posicaoConta] >= valorSaque) {
              // Realiza o saque
              saldos[posicaoConta] -= valorSaque;
              System.out.println("Saque realizado com sucesso! Novo saldo: " + saldos[posicaoConta]);
            } else {
              System.out.println("Saldo insuficiente!");
            }
          } else {
            System.out.println("Conta não encontrada!");
          }
          break;

        case 4: // Consultar saldo em conta
          System.out.print("Digite o número da conta: ");
          int contaConsulta = scanner.nextInt();
          // Procura a conta no vetor de contas
          posicaoConta = -1;
          for (int i = 0; i < numUsuarios; i++) {
            if (contas[i] == contaConsulta) {
              posicaoConta = i;
              break;
            }
          }
          // Verifica se a conta foi encontrada
          if (posicaoConta != -1) {
            System.out.println("Saldo da conta " + contaConsulta + ": " + saldos[posicaoConta]);
          } else {
            System.out.println("Conta não encontrada!");
          }
          break;

        case 5: // Finalizar o programa
          System.out.println("Finalizando o programa.");
          return; // Encerra a execução do programa

        default:
          System.out.println("Opção inválida!");
      }
    }
  }
}
