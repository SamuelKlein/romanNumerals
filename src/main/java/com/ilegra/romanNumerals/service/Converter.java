package com.ilegra.romanNumerals.service;

public class Converter {

    public String numberToRoman(short l) {
        StringBuilder roman = new StringBuilder();

        roman.append(find1000to3000(l));
        roman.append(find100to900(l));
        roman.append(find10to90(l));
        roman.append(find1to9(l));

        return roman.toString();
    }

    private String find1to9(short value) {
        int unit = value % 10;

        switch (unit) {
            case 1: return "I";
            case 2: return "II";
            case 3: return "III";
            case 4: return "IV";
            case 5: return "V";
            case 6: return "VI";
            case 7: return "VII";
            case 8: return "VIII";
            case 9: return "IX";
        }

        return "";
    }

    private String find1000to3000(short value) {
        int unit = value % 10000;
        unit = unit / 1000;

        switch (unit) {
            case 1: return "M";
            case 2: return "MM";
            case 3: return "MMM";
            case 4: return "MMMM";
        }

        return "";
    }

    private String find100to900(short value) {
        int unit = value % 1000;
        unit = unit / 100;

        switch (unit) {
            case 1: return "C";
            case 2: return "CC";
            case 3: return "CCC";
            case 4: return "CD";
            case 5: return "D";
            case 6: return "DC";
            case 7: return "DCC";
            case 8: return "DCCC";
            case 9: return "CM";
        }

        return "";
    }

    private String find10to90(short value) {
        int unit = value % 100;
        unit = unit / 10;

        switch (unit) {
            case 1: return "X";
            case 2: return "XX";
            case 3: return "XXX";
            case 4: return "XL";
            case 5: return "L";
            case 6: return "LX";
            case 7: return "LXX";
            case 8: return "LXXX";
            case 9: return "XC";
        }

        return "";
    }

}
