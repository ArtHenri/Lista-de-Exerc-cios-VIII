package ListadeExercíciosVIII;

import java.util.Scanner;

public class ImprimePadrao {
        
    // Função que imprime o padrão até n
    public static void imprimirPadrao(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Pula para a próxima linha
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro n: ");
        int n = scanner.nextInt();

        imprimirPadrao(n); // Chamada da função

        scanner.close();
    }
} 
