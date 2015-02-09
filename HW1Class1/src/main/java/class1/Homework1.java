package class1;

import java.util.Arrays;

/**
 * Created by inna on 2/8/15.
 */

public class Homework1 {


    public static void main(String[] args) {

        caesarCipher("test test", 3);

    }

    //Реализовать алгоритм шифрования Цезаря
    public static void caesarCipher(String text, int k) {

        System.out.println("text = " + text);


        String[] alphab = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "v", "x", "y", "z"};


        String letter = "";
        String newText = "";
        String arrElement = "";


        for (int i = 0; i < text.length(); i++) {

            letter = Character.toString(text.charAt(i));
            // System.out.println("letter = " + letter);

            if (Arrays.asList(alphab).contains(letter)) {

                for (int j = 0; j < alphab.length; j++) {

                    if (alphab[j].equals(letter)) {
                        arrElement = alphab[i];
                        newText = newText + alphab[j + k];
                    }
                }

            }
        }
        System.out.print("newText = ");
        System.out.print(newText);

    }


}

