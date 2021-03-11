package firstTask;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class First {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter str:");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String inputStr = reader.readLine();
        System.out.println("Answer: " + numInStr(inputStr));
    }
    public static int numInStr(String inputStr) {
        int returnNum = 0;
        String [] numberOnly= inputStr.replaceAll("[^0-9]", " ")
                .trim().replaceAll(" +", " ").split(" ");
        try {
            for (String x: numberOnly) {
                returnNum += Integer.parseInt(x);
            }
        } catch (NumberFormatException ex) {
            System.out.println("No num in str");
        }
        return returnNum;
    }
}
