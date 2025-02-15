package application;

import model.exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Primeiro valor: ");
        int primeiroValor = scanner.nextInt();

        System.out.print("Segundo valor: ");
        int segundoValor = scanner.nextInt();

        try {
            contar(primeiroValor, segundoValor);
        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void contar(int primeiroValor, int segundoValor) throws ParametrosInvalidosException {
        if (segundoValor < primeiroValor) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = segundoValor - primeiroValor;

        for (int i = 0; i < contagem; i++) {
            System.out.println("Imprimindo o número " + (i + 1));
        }
    }
}
