import java.util.Map;

public class ConverterToRoman extends InputManager {
    //Members
    private final Table table = Table.getInstance();

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

            String romanString = convertToRoman(inputAsInt);
            System.out.println("Result: " + input + " = " + romanString + "\n");
        }
    }

    String convertToRoman(Integer decimalNumber) {
        StringBuilder romanString = new StringBuilder();
        while (decimalNumber != 0) {
            for (Map.Entry<String, Integer> row : table.getTable().entrySet()) {
                if (row.getValue() <= decimalNumber) {
                    decimalNumber -= row.getValue();
                    romanString.append(row.getKey());
                    break;
                }
            }
        }
        return romanString.toString();
    }


}
