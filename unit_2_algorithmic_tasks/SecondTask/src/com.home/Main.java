package SecondTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter str:");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String inputStr = reader.readLine();
        Map<Character, Integer> chars = charInStr(inputStr);
        System.out.println("Answer:");
        int i = 1;
        for (Map.Entry entry : chars.entrySet()) {
            System.out.println((i++) + ". " + entry.getKey() + " - "
                    + entry.getValue());
        }
    }
    public static Map<Character, Integer> charInStr (String inputStr) {
        Map<Character, Integer> chars = new HashMap<Character, Integer>();
        for (int i = 0; i < inputStr.length(); i++) {
            char c = inputStr.charAt(i);
            if (((c >= 'a')&&(c <= 'z')) || ((c >= 'A')&&(c <= 'Z')) ||
                    ((c >= 'а')&&(c <= 'я')) || ((c >= 'А')&&(c <= 'Я'))){
                chars.merge(c, 1, Integer::sum);
            }
        }
        return chars;
    }
}
