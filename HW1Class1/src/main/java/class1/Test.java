package class1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ifilipenko on 2/9/2015.
 */
public class Test {

    public static void main(String[] args) {

        //http://howtodoinjava.com/2012/11/21/how-to-print-the-content-of-array-in-java/ 

   /*     int offset = 50 % 26;
        System.out.println(offset);
        int next = offset + 26;
        System.out.println(next);*/

        List<Character> alphabet = new ArrayList<Character>();
        for (char c = 'a'; c <'z'; c++) {
            alphabet.add(c);
        }

        System.out.println(alphabet);




    }
}
