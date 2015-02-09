package class1;

/**
 * Created by inna on 2/8/15.
 */
public class ClassWork {


    public static void main(String[] args) {

        String text = "a";
        System.out.println(text);
        encryptAndUnencryptLine(text);
        System.out.println();

    }


    public static void encryptAndUnencryptLine(String line) {

        int[] res = new int[100];

        for (int i = 0; i < line.length(); i++) {

            res[i] = (int) line.charAt(i);
        }

        System.out.println(res);

        String lineBack = "";

        for (int i = 0; i < res.length; i++) {

            lineBack = Character.toString((char) res[i]);
            System.out.print(lineBack);

        }


    }


    public static String encryptLine1(String line) {

        String[] alphab = {"a", "b", "c", "d", "f", "g", "h", "i", "k",
                "l", "m", "n", "o", "p", "q", "r", "s", "t", "v", "x", "y", "z"};
        String[] codes = {"01", "02", "03", "04", "05", "06",
                "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22"};

        String result = line;

        for (int i = 0; i < alphab.length; i++) {
            result = result.replaceAll(alphab[i], codes[i]);
        }


        return result;
    }

    public static String unencryptLine1(String line) {

        String[] alphab = {"a", "b", "c", "d", "f", "g", "h",
                "i", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "v", "x", "y", "z"};
        String[] codes = {"01", "02", "03", "04",
                "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22"};

        String result = line;

        for (int i = 0; i < alphab.length; i++) {
            result = result.replaceAll("codes[i]]", alphab[i]);
        }

        return result;
    }

}

