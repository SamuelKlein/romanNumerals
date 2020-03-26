package com.ilegra.romanNumerals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class MainTest {

    private final InputStream systemIn = System.in;
    private final PrintStream systemOut = System.out;

    ByteArrayOutputStream testOut;

    @Before
    public void init() {
        testOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOut));
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        System.setOut(systemOut);
    }

    private void provideInput(String data) {
        System.setIn(new ByteArrayInputStream(data.getBytes()));
    }

    private String getOutput() {
        return testOut.toString();
    }

    @Test
    public void testMain() {
        provideInput("1");
        Main.main(null);
        assertEquals(getMsgDefault("I"), getOutput());
    }

    @Test
    public void testMainString() {
        provideInput("Samuel");
        Main.main(null);
        assertEquals(getMsgErro("Samuel"), getOutput());
    }

    @Test
    public void testMianZero() {
        provideInput("0");
        Main.main(null);
        assertEquals(getMsgZero(), getOutput());
    }

    @Test
    public void testMianMaoir() {
        provideInput("5910");
        Main.main(null);
        assertEquals(getMsgMaior4999(), getOutput());
    }

    private String getMsgDefault(String romanValue) {
        return "                | _ \\  ___   _ __    __ _   _ _     | \\| |  _  _   _ __    ___   _ _   __ _  (_)  ___\n" +
                "                |   / / _ \\ | '  \\  / _` | | ' \\    | .` | | || | | '  \\  / -_) | '_| / _` | | | (_-<\n" +
                "                |_|_\\ \\___/ |_|_|_| \\__,_| |_||_|   |_|\\_|  \\_,_| |_|_|_| \\___| |_|   \\__,_| |_| /__/\n" +
                "\n" +
                "Conversor de Numero Inteiros para Numero Romano.\n" +
                "Informe o numero inteiro no intervalo de 1 a 4999:\n" +
                "O VALOR EM NUMERO ROMANO É " + romanValue + "\n";
    }

    private String getMsgErro(String input) {
        return "                | _ \\  ___   _ __    __ _   _ _     | \\| |  _  _   _ __    ___   _ _   __ _  (_)  ___\n" +
                "                |   / / _ \\ | '  \\  / _` | | ' \\    | .` | | || | | '  \\  / -_) | '_| / _` | | | (_-<\n" +
                "                |_|_\\ \\___/ |_|_|_| \\__,_| |_||_|   |_|\\_|  \\_,_| |_|_|_| \\___| |_|   \\__,_| |_| /__/\n" +
                "\n" +
                "Conversor de Numero Inteiros para Numero Romano.\n" +
                "Informe o numero inteiro no intervalo de 1 a 4999:\n" +
                "O '" + input + "' não é um valor inteiro.\n";
    }

    private String getMsgZero() {
        return "                | _ \\  ___   _ __    __ _   _ _     | \\| |  _  _   _ __    ___   _ _   __ _  (_)  ___\n" +
                "                |   / / _ \\ | '  \\  / _` | | ' \\    | .` | | || | | '  \\  / -_) | '_| / _` | | | (_-<\n" +
                "                |_|_\\ \\___/ |_|_|_| \\__,_| |_||_|   |_|\\_|  \\_,_| |_|_|_| \\___| |_|   \\__,_| |_| /__/\n" +
                "\n" +
                "Conversor de Numero Inteiros para Numero Romano.\n" +
                "Informe o numero inteiro no intervalo de 1 a 4999:\n" +
                "Valor ZERO não posssui em numeros romanos\n";
    }

    private String getMsgMaior4999() {
        return "                | _ \\  ___   _ __    __ _   _ _     | \\| |  _  _   _ __    ___   _ _   __ _  (_)  ___\n" +
                "                |   / / _ \\ | '  \\  / _` | | ' \\    | .` | | || | | '  \\  / -_) | '_| / _` | | | (_-<\n" +
                "                |_|_\\ \\___/ |_|_|_| \\__,_| |_||_|   |_|\\_|  \\_,_| |_|_|_| \\___| |_|   \\__,_| |_| /__/\n" +
                "\n" +
                "Conversor de Numero Inteiros para Numero Romano.\n" +
                "Informe o numero inteiro no intervalo de 1 a 4999:\n" +
                "Valor acima de 4999 não possui em numeros romanos\n";
    }


}