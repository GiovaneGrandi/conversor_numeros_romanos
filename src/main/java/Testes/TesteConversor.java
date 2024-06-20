package Testes;

import com.mentoria.ConversorDeNumerosRomanos;
import java.util.Scanner;


public class TesteConversor {
    public static void main(String[] args) {
        ConversorDeNumerosRomanos converter = new ConversorDeNumerosRomanos();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número para converte-lo em algarismos romanos (1-3000) ou 'sair' para fechar: ");
            String input = scanner.next();

            if (input.equalsIgnoreCase("sair")) {
                System.out.println("Saindo...");
                break;
            }

            try {
                int number = Integer.parseInt(input);
                String romanNumeral = converter.toRoman(number);
                System.out.println(number + " Em algarismos romanos é: " + romanNumeral);
            } catch (NumberFormatException e) {
                System.out.println("Input inválido. Por favor insira um número válido ou 'sair' para fechar.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }

        scanner.close();
    }
}