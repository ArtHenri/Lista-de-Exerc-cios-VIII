package ListadeExercíciosVIII;

import java.util.Scanner;
public class Soma {

    public static void main(String[] args) {
       
        double soma = 0.0;

        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i <= 3; i++) {
            System.out.println("Digite o " + i + "º número: ");
            Double numero = scanner.nextDouble();
            soma += numero;
        }
        scanner.close();
        System.out.println("A soma é: " + soma);
    }
}

