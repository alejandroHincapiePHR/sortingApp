import org.apache.commons.io.IOUtils;

import java.util.ArrayList;
import java.util.Scanner;

public class SortingAppMain {

    public static void main(String[] args) {
        System.out.println("Please enter up to 10 Integers separated by space to order");
        System.out.println("");

        Scanner scanner = new Scanner(System.in);
        String line = new String();
        if (scanner.hasNextLine()) {
            line = scanner.nextLine();
        }
        scanner.close();
        System.out.println(sortingFunction(line));
    }

    public static String sortingFunction(String line) {
        ArrayList<Integer> integerArray = new ArrayList<>();
        String[] tokens = line.split("\\s+");

        if(tokens.length>=10){
            return "Error";
        }

        for (String token : tokens) {
            try {
                integerArray.add(Integer.parseInt(token));
            }catch (NumberFormatException e){
                return "Error";
            }

        }
        integerArray.sort((a, b) -> a.compareTo(b));

        String result = "";

        for (Integer number : integerArray) {
            result += number.toString()+" ";
        }
        return result.trim();
    }


}
