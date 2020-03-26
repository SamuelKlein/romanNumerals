package com.ilegra.romanNumerals.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class ConverterTest {

    Converter converter;

    String content;

    @Before
    public void init() throws IOException {
        converter = new Converter();
        content = new String(Files.readAllBytes(new File(getClass().getClassLoader().getResource("input.txt").getFile()).toPath()));
    }


    @Test
    public void numberToRoman() {
        for(String linha : content.split("\n")) {
            String[] d = linha.split(" = ");
            String num = d[0];
            String roman = d[1];

            Assert.assertEquals( linha, num + " = " +converter.numberToRoman(Short.valueOf(num)));
        }
    }

}