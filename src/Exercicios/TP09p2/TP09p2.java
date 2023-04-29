package Exercicios.TP09p2;

import java.util.Scanner;
import java.security.SecureRandom;

public class TP09p2 {
        private static final int TAM = 10;
        // Método para criar o array bidimensional
        public static int[][] getArray2D(){
            // Criar uma matriz de inteiros 3x3
            int[][] matriz = new int[TAM][TAM];

            // Criar o fluxo de entrada
            Scanner entrada = new Scanner(System.in);

            SecureRandom sorteio = new SecureRandom();

            // Inicializar com entrada de dados dos usuários
            System.out.printf("Digite os elementos das %d linhas e as %d colunas da matriz 3x3:\n\n", matriz.length, matriz[0].length);

            for (int linha = 0; linha < matriz.length; linha++) {
                for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                    // System.out.printf("Digite o elemento %dx%d: ", linha, coluna);
                    matriz[linha][coluna] = sorteio.nextInt(100) +1;
                } // Fim do for interno
                System.out.printf("\n"); // Quebra de linha da matriz
            } // Fim do for externo

            entrada.close(); // Fechar o fluxo de entrada

            return matriz; // Retornar o array criado
        } // Fim do método getArray2D

        // Método para somar os elementos da matriz
        public static int somarElementos(int[][] matriz){
            int total = 0;
            for (int linha = 0; linha < matriz.length; linha++) {
                for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                    total += matriz[linha][coluna];
                } // Fim do for interno
            } // Fim do for externo
            return total;
        } // Fim do método somar

        // Criar método para exibir a matriz na tela
        public static void exibir(int[][] matriz){
            for(int i = 0; i < matriz.length; i++) {
                for(int j = 0; j < matriz[i].length; j++) {
                    System.out.printf("%d ", matriz[i][j]);
                } // For interno
                System.out.printf("%n");
            } // For externo
        } // Fim do método exibir

        // Criar o método para exibir a soma das colunas
        public static void somarColunas(int[][] matriz){
            for (int linha = 0; linha < matriz.length; linha++) {
                int total = 0;
                for (int coluna = 0; coluna < matriz[linha].length; coluna++) {
                    total += matriz[coluna][linha];
                } // Fim do for interno
                System.out.printf("Soma da coluna %d é: %d\n", linha, total);
            } // Fim do for externo
        } // Fim do método somarColunas

        // Criar método para exibir a matriz reversa na tela
        public static void exibirReversa(int[][] matriz){
            for(int linha = matriz.length - 1; linha >=0; linha--) {
                for(int coluna = matriz[linha].length - 1; coluna >=0; coluna--) {
                    System.out.printf("%d ", matriz[linha][coluna]);
                } //For interno
                System.out.printf("\n");
            } // For externo
        } // Fim do método exibir

        public static void main(String[] args) {
            int[][] novaMatriz = getArray2D();
            System.out.printf("A soma dos elementos da matriz é igual a: %d\n\n", somarElementos(novaMatriz));
            somarColunas(novaMatriz);
            System.out.printf("\nA matriz é:\n");
            exibir(novaMatriz);
            System.out.printf("\nA matriz reversa é:\n");
            exibirReversa(novaMatriz);
        } // Fim do main
    } // Fim da classe
