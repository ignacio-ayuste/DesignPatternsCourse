package interpreter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InterpreterJavaApi {

    public static void main(String[] args) {

        String input = "elephants and cebras, and tigers";

        Pattern pattern = Pattern.compile("lion|elephants|cebras|human|wolf");
        Matcher matcher = pattern.matcher(input);

        while(matcher.find()){
            System.out.println("Found a " + matcher.group() + ".");
        }

    }

}