import java.util.Scanner;

public class TerminalManager {
    private final Scanner scanner = new Scanner(System.in);
    String redColor = "\u001B[31m"; //For errors
    String greenColor = "\u001B[32m"; //For input
    String blueColor = "\u001B[34m"; //For result

    String resetColor = "\u001B[0m";

    String getInputFromUserWith(String prompt) {
        System.out.println(prompt);
        System.out.print(greenColor + ">>> ");
        String input = scanner.nextLine();
        System.out.print(resetColor);
        return input ;
    }

    boolean isNumeric(String input){
        return input.matches("-?\\d+");
    }

    boolean onlyContainsRomanCharacters(String input){
        return input.matches("[mdcxvilMDCLXVI]+");
    }

    void printErrorMessage(String message){
        System.out.println(redColor +  "Error: " + message + resetColor + "\n");
    }

    void printResult(String input, String result) {
        System.out.println(blueColor + "Result: " + input + " = " + result + "\n" + resetColor);
    }

    void printRomanRules() {
        System.out.println(
                            """
                            Rules to write roman numerals:
                            - Only enter roman numerals (M, D, C, L, X, V, or I)
                            - A symbol can be repeated only for three times
                            - Symbols D, L and V cannot be subtracted
                            - Symbol I can be subtracted from V and X only
                            - Symbol X can be subtracted from symbols L and C only
                            """
        );
    }

}
