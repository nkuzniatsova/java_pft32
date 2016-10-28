package pft32.speltuin;

import static java.lang.Character.isDigit;

/**
 * Created by Natallia on 27/10/16.
 */
public class Oefening5 {

    public static int maxLengteGetal(String s) {
        int currentLenthDigit = 0;
        int maxLenthDigit = 0;
        for (int i=0; i< s.length(); i++) {
            if (isDigit(s.charAt(i))){
                currentLenthDigit = currentLenthDigit + 1;
            } else {
                currentLenthDigit = 0;
            }
            if (currentLenthDigit > maxLenthDigit) {
                maxLenthDigit = currentLenthDigit;
            }
        }
        return maxLenthDigit;

    }
}
