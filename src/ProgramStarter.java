public class ProgramStarter extends TerminalManager {
    /**
     * This class is in charge of starting the program, by transitioning to the first input loop, where the user
     * will select the conversion they would like to do.
     */
    //Data Members
    private final ConverterToRoman converterToRoman = new ConverterToRoman();
    private final ConverterToDecimal converterToDecimal = new ConverterToDecimal();

    //Methods

    /**
     * Starts the program by giving a prompt to the user and obtaining input. Validates the input and executes the
     * user instruction.
     */
    public void startProgram() {

        boolean keepRunning = true;
        String input;
        while (keepRunning) {
            String prompt =
                    """
                    
                    What would you like to do? (enter 1, 2 or 3.)
                    1. Convert a decimal number to a roman numeral
                    2. Convert a roman numeral to a decimal number
                    3. Exit""";
            input = getInputFromUserWith(prompt);
            switch (input) {
                case "1" -> converterToRoman.run();
                case "2" -> converterToDecimal.run();
                case "3" -> keepRunning = false;
                default -> printErrorMessage("Wrong Input. Please enter 1, 2 or 3.");
            }
        }
    }

}
