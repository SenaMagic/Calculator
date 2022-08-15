import java.awt.*;
import java.util.Scanner;

public class Calc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите выражение через пробел. Пример: 'II + III'");
        String dano = sc.nextLine();
        String[] dano1 = dano.split(" ", 3);
        String aaa = dano1[0];
        String bbb = dano1[2];
        String znak = dano1[1];
        int cc = Integer.MIN_VALUE;
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        int c = Integer.MIN_VALUE;
        switch (aaa) {
            case "I":
                a = 1;
                break;
            case "II":
                a = 2;
                break;
            case "III":
                a = 3;
                break;
            case "IV":
                a = 4;
                break;
            case "V":
                a = 5;
                break;
            case "VI":
                a = 6;
                break;
            case "VII":
                a = 7;
                break;
            case "VIII":
                a = 8;
                break;
            case "IX":
                a = 9;
                break;
            case "X":
                a = 10;
                break;
        }
        switch (bbb) {
            case "I":
                b = 1;
                break;
            case "II":
                b = 2;
                break;
            case "III":
                b = 3;
                break;
            case "IV":
                b = 4;
                break;
            case "V":
                b = 5;
                break;
            case "VI":
                b = 6;
                break;
            case "VII":
                b = 7;
                break;
            case "VIII":
                b = 8;
                break;
            case "IX":
                b = 9;
                break;
            case "X":
                b = 10;
                break;
        }
        switch (znak) {
            case "+":
                c = a + b;
                break;
            case "-":
                c = a - b;
                break;
            case "*":
                c = a * b;
                break;
            case "/":
                c = a / b;
                break;
        }
        String ccc = "";
        switch (c) {
            case 1:
                ccc = "I";
                break;
            case 2:
                ccc = "II";
                break;
            case 3:
                ccc = "III";
                break;
            case 4:
                ccc = "IV";
                break;
            case 5:
                ccc = "V";
                break;
            case 6:
                ccc = "VI";
                break;
            case 7:
                ccc = "VII";
                break;
            case 8:
                ccc = "VIII";
                break;
            case 9:
                ccc = "IX";
                break;
            case 10:
                ccc = "X";
                break;
            case 11:
                ccc = "XI";
                break;
            case 12:
                ccc = "XII";
                break;
            case 13:
                ccc = "XIII";
                break;
            case 14:
                ccc = "XIV";
                break;
            case 15:
                ccc = "XV";
                break;
            case 16:
                ccc = "XVI";
                break;
            case 17:
                ccc = "XVII";
                break;
            case 18:
                ccc = "XVIII";
                break;
            case 19:
                ccc = "XIX";
                break;
            case 20:
                ccc = "XX";
                break;
            case 21:
                ccc = "XXI";
                break;
            case 22:
                ccc = "XXII";
                break;
            case 23:
                ccc = "XXIII";
                break;
            case 24:
                ccc = "XXIV";
                break;
            case 25:
                ccc = "XXV";
                break;
            case 26:
                ccc = "XXVI";
                break;
            case 27:
                ccc = "XXVII";
                break;
            case 28:
                ccc = "XXVIII";
                break;
            case 29:
                ccc = "XXIX";
                break;
            case 30:
                ccc = "XXX";
                break;
            case 31:
                ccc = "XXXI";
                break;
            case 32:
                ccc = "XXXII";
                break;
            case 33:
                ccc = "XXXIII";
                break;
            case 34:
                ccc = "XXXIV";
                break;
            case 35:
                ccc = "XXXV";
                break;
            case 36:
                ccc = "XXXVI";
                break;
            case 37:
                ccc = "XXXVII";
                break;
            case 38:
                ccc = "XXXVIII";
                break;
            case 39:
                ccc = "XXXIX";
                break;
            case 40:
                ccc = "XL";
                break;
            case 41:
                ccc = "XLI";
                break;
            case 42:
                ccc = "XLII";
                break;
            case 43:
                ccc = "XLIII";
                break;
            case 44:
                ccc = "XLIV";
                break;
            case 45:
                ccc = "XLV";
                break;
            case 46:
                ccc = "XLVI";
                break;
            case 47:
                ccc = "XLVII";
                break;
            case 48:
                ccc = "XLVIII";
                break;
            case 49:
                ccc = "XLIX";
                break;
            case 50:
                ccc = "L";
                break;
            case 51:
                ccc = "LI";
                break;
            case 52:
                ccc = "LII";
                break;
            case 53:
                ccc = "LIII";
                break;
            case 54:
                ccc = "LIV";
                break;
            case 55:
                ccc = "LV";
                break;
            case 56:
                ccc = "LVI";
                break;
            case 57:
                ccc = "LVII";
                break;
            case 58:
                ccc = "LVIII";
                break;
            case 59:
                ccc = "LIX";
                break;
            case 60:
                ccc = "LX";
                break;
            case 61:
                ccc = "LXI";
                break;
            case 62:
                ccc = "LXII";
                break;
            case 63:
                ccc = "LXIII";
                break;
            case 64:
                ccc = "LXIV";
                break;
            case 65:
                ccc = "LXV";
                break;
            case 66:
                ccc = "LXVI";
                break;
            case 67:
                ccc = "LXVII";
                break;
            case 68:
                ccc = "LXVIII";
                break;
            case 69:
                ccc = "LXIX";
                break;
            case 70:
                ccc = "LXX";
                break;
            case 71:
                ccc = "LXXI";
                break;
            case 72:
                ccc = "LXXII";
                break;
            case 73:
                ccc = "LXXIII";
                break;
            case 74:
                ccc = "LXXIV";
                break;
            case 75:
                ccc = "LXXV";
                break;
            case 76:
                ccc = "LXXVI";
                break;
            case 77:
                ccc = "LXXVII";
                break;
            case 78:
                ccc = "LXXVIII";
                break;
            case 79:
                ccc = "LXXIX";
                break;
            case 80:
                ccc = "LXXX";
                break;
            case 81:
                ccc = "LXXXI";
                break;
            case 82:
                ccc = "LXXXII";
                break;
            case 83:
                ccc = "LXXXIII";
                break;
            case 84:
                ccc = "LXXXIV";
                break;
            case 85:
                ccc = "LXXXV";
                break;
            case 86:
                ccc = "LXXXVI";
                break;
            case 87:
                ccc = "LXXXVII";
                break;
            case 88:
                ccc = "LXXXVIII";
                break;
            case 89:
                ccc = "LXXXIX";
                break;
            case 90:
                ccc = "XC";
                break;
            case 91:
                ccc = "XCI";
                break;
            case 92:
                ccc = "XCII";
                break;
            case 93:
                ccc = "XCIII";
                break;
            case 94:
                ccc = "XCIV";
                break;
            case 95:
                ccc = "XCV";
                break;
            case 96:
                ccc = "XCVI";
                break;
            case 97:
                ccc = "XCVII";
                break;
            case 98:
                ccc = "XCVIII";
                break;
            case 99:
                ccc = "XCIX";
                break;
            case 100:
                ccc = "C";
                break;
        }
        if (ccc.equals("")) {
            int aa = Integer.parseInt(dano1[0]);
            int bb = Integer.parseInt(dano1[2]);
            if (aa>10 | bb>10){
                throw new NullPointerException("Значение операндов не может превышать 10");
            }
            switch (znak) {
                case "+":
                    cc = aa + bb;
                    break;
                case "-":
                    cc = aa - bb;
                    break;
                case "*":
                    cc = aa * bb;
                    break;
                case "/":
                    cc = aa / bb;
                    break;
            }
            System.out.println(cc);
        }
        System.out.println(ccc);
    }
}