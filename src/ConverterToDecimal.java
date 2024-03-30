public class ConverterToDecimal extends TerminalManager {
    //Members
    private final Table table = Table.getInstance(); //TODO: tests this singleton is working (address)

    //Methods
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


    Integer convertToDecimal(String romanNumeral) {
        Integer decimal = 0;
        char letter;
        char nextLetter;

        Integer valueLetter;
        Integer valueNextLetter;

        if (SomeDigitRepeatsTooMuch(romanNumeral)){
            return null;
        }

        //Traverse through each character in the roman numeral
        for (int i = 0; i < romanNumeral.length()-1; i++) {
            letter = romanNumeral.charAt(i);
            nextLetter = romanNumeral.charAt(i+1);
            valueLetter = table.getDecimal(String.valueOf(letter));
            valueNextLetter = table.getDecimal(String.valueOf(nextLetter));

            if (valueLetter < valueNextLetter){
                if (valueNextLetter > (valueLetter*10)) {
                    return null;
                } else if (String.valueOf(letter).equals("V") || String.valueOf(letter).equals("L")
                        || String.valueOf(letter).equals("D")) {
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

    boolean SomeDigitRepeatsTooMuch(String romanNumeral) { // M M M M
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
