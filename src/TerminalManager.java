import java.util.Scanner;

public class TerminalManager {
    //Class in charge of the terminal input and output.
    private final Scanner scanner = new Scanner(System.in);
    String redColor = "\u001B[31m"; //Color formatting for errors
    String greenColor = "\u001B[32m"; //Color formatting for input
    String blueColor = "\u001B[34m"; //Color formatting for results
    String resetColor = "\u001B[0m"; //Color restarter

    /**
     * Takes input from the user with the prompt.
     * @param prompt to be displayed to the user.
     * @return the input from the user.
     */
    String getInputFromUserWith(String prompt) {
        System.out.println(prompt);
        System.out.print(greenColor + ">>> ");
        String input = scanner.nextLine();
        System.out.print(resetColor);
        return input ;
    }

    /**
     * Determines if a string contains only real numbers.
     * @param input string to be checked.
     * @return true if string is only digits, false otherwise.
     */
    boolean isNumeric(String input){
        return input.matches("-?\\d+");
    }

    /**
     * Determines if a string contains only roman numerals M D C L X V or I. They could be lowercase or uppercase.
     * @param input string to be checked.
     * @return true if input contains only roman numerals M D C L X V or I, false otherwise.
     */
    boolean onlyContainsRomanCharacters(String input){
        return input.matches("[mdcxvilMDCLXVI]+");
    }

    /**
     * Prints an error message with red color.
     * @param message to be included, feedback for the user.
     */
    void printErrorMessage(String message){
        System.out.println(redColor +  "Error: " + message + resetColor + "\n");
    }

    /**
     * Prints the result of a conversion using blue color.
     * @param input the conversion input
     * @param result the conversion result
     */
    void printResult(String input, String result) {
        System.out.println(blueColor + "Result: " + input + " = " + result + "\n" + resetColor);
    }

    /**
     * Prints roman rules to be used by the ConverterToDecimal class.
     */
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
