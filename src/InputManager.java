import java.util.Scanner;

public class InputManager {
    //Data members
    private final Scanner scanner;

    public InputManager() {
        scanner = new Scanner(System.in);
    }

    //Constructor
    public void startProgram() {
        boolean keepRunning = true;
        String input;
        while (keepRunning) {
            String prompt =
                    """

                    What would you like to do? (enter 1, 2 or 3.)
                    1. Convert a decimal number to a roman numeral
                    2. Convert a roman numeral to a decimal number
                    3. Exit
                    """;
            input = getInputFromUserWith(prompt);
            switch (input) {
                case "1" -> System.out.println("convert to roman");
                case "2" -> System.out.println("convert to decimal");
                case "3" -> keepRunning = false;
                default -> System.out.println("Wrong Input. Please enter 1, 2 or 3.");
            }
        }

    }

    private String getInputFromUserWith(String prompt) {
        System.out.println(prompt);
        System.out.print(">>> ");
        return scanner.next();
    }
}