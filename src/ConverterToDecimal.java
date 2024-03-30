public class ConverterToDecimal extends InputManager {
    //Members
    private final Table table = Table.getInstance(); //TODO: tests this singleton is working (address)

    //Methods
    void run(){
        while (true){
            String input;
            String prompt = "Enter the roman numeral you would like to convert to decimal (or enter x to exit):";
            input = getInputFromUserWith(prompt);

            if (input.equals("x")){
                break;
            }

            if (!onlyContainsRomanCharacters(input)){
                printErrorMessage("Please only enter a roman numeral containing M, D, C, L, X, V or I");
            }

            String romanNumeral = input.toUpperCase();
            Integer decimal = convertToDecimal(romanNumeral);
            if (decimal != null){
                System.out.println("Result: " + romanNumeral + " = " + decimal + "\n");
            } else {
                printErrorMessage("Invalid input.");
            }

        }
    }

    Integer convertToDecimal(String romanNumeral) {
        Integer decimal = 0;
        char letter;
        char nextLetter;

        Integer valueLetter;
        Integer valueNextLetter;


        //Traverse through each character in the roman numeral
        for (int i = 0; i < romanNumeral.length()-1; i++) {
            letter = romanNumeral.charAt(i);
            nextLetter = romanNumeral.charAt(i+1);
            valueLetter = table.getDecimal(String.valueOf(letter));
            valueNextLetter = table.getDecimal(String.valueOf(nextLetter));

            if (valueLetter < valueNextLetter){
                decimal -= valueLetter;
                continue;
            }

            decimal += valueLetter;
        }

        char lastLetter = romanNumeral.charAt(romanNumeral.length() - 1);
        decimal += table.getDecimal(String.valueOf(lastLetter));

        return decimal;
    }

}
