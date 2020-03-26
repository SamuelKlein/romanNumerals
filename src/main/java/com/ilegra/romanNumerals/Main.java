package com.ilegra.romanNumerals;

import com.ilegra.romanNumerals.service.Converter;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("                | _ \\  ___   _ __    __ _   _ _     | \\| |  _  _   _ __    ___   _ _   __ _  (_)  ___\n" +
                           "                |   / / _ \\ | '  \\  / _` | | ' \\    | .` | | || | | '  \\  / -_) | '_| / _` | | | (_-<\n" +
                           "                |_|_\\ \\___/ |_|_|_| \\__,_| |_||_|   |_|\\_|  \\_,_| |_|_|_| \\___| |_|   \\__,_| |_| /__/\n");


        System.out.println("Conversor de Numero Inteiros para Numero Romano.");
        System.out.println("Informe o numero inteiro no intervalo de 1 a 4999:");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextShort()) {
            short value = scanner.nextShort();
            if (value == 0) {
                System.out.println("Valor ZERO não posssui em numeros romanos");
            } else if (value >= 5000) {
                System.out.println("Valor acima de 4999 não possui em numeros romanos");
            } else {
                Converter converter = new Converter();
                System.out.println("O VALOR EM NUMERO ROMANO É " + converter.numberToRoman(value));
            }
        } else {
            System.out.println("O '" + scanner.next() + "' não é um valor inteiro.");
        }
    }
}
