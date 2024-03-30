public class ConverterToRoman extends InputManager {
    //Members
    private final Table table = new Table();

    //Methods
    void run(){
        String input;
        while (true) {
            String prompt = "Enter the number you would like to convert to roman numeral (or enter x to exit):";

            input = getInputFromUserWith(prompt);
            if (input.equals("x")){
                break;
            }

            if (!isNumeric(input)){
                printErrorMessage("Please enter a number.");
                continue;
            }

            Integer inputAsInt = Integer.parseInt(input);

            if (inputAsInt > 3999 || inputAsInt < 1){
                printErrorMessage("Please enter a number between 1 and 3999.");
                continue;
            }
        }
    }


}
