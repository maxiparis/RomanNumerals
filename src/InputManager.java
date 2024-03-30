import java.util.Scanner;

public class InputManager {
    private final Scanner scanner = new Scanner(System.in);

    String getInputFromUserWith(String prompt) {
        System.out.println(prompt);
        System.out.print(">>> ");
        return scanner.next();
    }

    boolean isNumeric(String input){
        return input.matches("-?\\d+");
    }

    boolean onlyContainsRomanCharacters(String input){
        return input.matches("[mdcxvilMDCLXVI]+");
    }

    void printErrorMessage(String message){
        System.out.println("**** Error: " + message);
    }


}
