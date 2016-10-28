package pft32.speltuin;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Natallia on 27/10/16.
 */
public class Collections {
    public static void main(String[] args) {
        String[] langs = {"Java", "C#", "Python", "PHP"}; //массив
        List<String> languages = Arrays.asList("Java", "C#", "Python", "PHP"); //список

        for (String l : languages) {
            System.out.println("Я хочу выучить " + l);
        }
    }
}
