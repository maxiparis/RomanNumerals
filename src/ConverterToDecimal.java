
public class ConverterToDecimal extends TerminalManager {
    //Members
    private final Table table = Table.getInstance();

    //Methods

    /**
     * Prompts the user with instructions and retrieve their input. Validates the input and executes the instruction
     * accordingly. Calls convertToDecimal if input as been given correctly and prints its result.
     */
    void run(){
        while (true){
            String input;
            String prompt = "Enter the roman numeral you would like to convert to decimal " +
                    "(enter e to exit or r to see roman numeral rules):";
            input = getInputFromUserWith(prompt);

            if (input.equals("e")){
                break;
            } else if (input.equals("r")){
                printRomanRules();
                continue;
            }

            if (!onlyContainsRomanCharacters(input)){
                printErrorMessage("Please enter only roman characters containing M, D, C, L, X, V or I. See rules.");
                continue;
            }

            String romanNumeral = input.toUpperCase();
            Integer decimal = convertToDecimal(romanNumeral);
            if (decimal != null) {
                printResult(romanNumeral, decimal.toString());
            } else {
                printErrorMessage("Invalid input. See rules by entering r.");
            }

        }
    }


    /**
     * Converts the romanNumeral passed as argument into an integer.
     * @param romanNumeral to be converted into integer.
     * @return an integer if the conversion was successful, null otherwise.
     */
    Integer convertToDecimal(String romanNumeral) {
        Integer decimal = 0;
        char letter;
        char nextLetter;
        Integer valueLetter;
        Integer valueNextLetter;

        //Checks if there is any digits that repeats more than 3 times
        if (SomeDigitRepeatsTooMuch(romanNumeral)){
            return null;
        }

        //Traverse through each character in the roman numeral and determines if it needs to add or subtract its value
        //to the total decimal number.
        for (int i = 0; i < romanNumeral.length()-1; i++) {
            letter = romanNumeral.charAt(i);
            nextLetter = romanNumeral.charAt(i+1);
            valueLetter = table.getDecimal(String.valueOf(letter));
            valueNextLetter = table.getDecimal(String.valueOf(nextLetter));

            if (valueLetter < valueNextLetter){
                if (valueNextLetter > (valueLetter*10)) {
                    //Invalid case, subtraction is invalid (numbers have too much difference)
                    return null;
                } else if (String.valueOf(letter).equals("V") || String.valueOf(letter).equals("L")
                        || String.valueOf(letter).equals("D")) {
                    //Invalid case, V, L, or D cannot be subtracted.
                    return null;
                } else {
                    decimal-=valueLetter;
                    continue;
                }
            }

            decimal += valueLetter;
        }

        char lastLetter = romanNumeral.charAt(romanNumeral.length() - 1);
        decimal += table.getDecimal(String.valueOf(lastLetter));

        return decimal;
    }

    /**
     * Determines if there is any character in the roman numeral that repeats more than 3 times.
     * @param romanNumeral string to be analyzed.
     * @return true if there is any character that repeats more than 3 times, false otherwise.
     */
    boolean SomeDigitRepeatsTooMuch(String romanNumeral) {
        int timesRepeated = 1;
        char currentChar;
        char nextChar;
        for (int i = 0; i < romanNumeral.length()-1; i++) {
            currentChar = romanNumeral.charAt(i);
            nextChar = romanNumeral.charAt(i + 1);

            if(currentChar == nextChar){
                timesRepeated++;
            } else {
                timesRepeated = 1;
            }

            if(timesRepeated > 3){
                return true;
            }
        }
        return false;
    }

}
