import java.util.LinkedHashMap;

public class Table {
    /**
     * Class that holds the roman numeral characters and values. Designed as a singleton so that both converter class
     * can access the same instance.
     */

    //Data member
    private static Table instance;

    //table of data type LinkedHashMap to preserve descending order (useful to ConverterToRoman) and preserve key-value
    //pairs.
    private final LinkedHashMap<String, Integer> table = new LinkedHashMap<>();

    //Constructor
    public static Table getInstance() {
        if (instance == null){
            instance = new Table();
            instance.initializeTable();
            return instance;
        }
        return instance;
    }

    /**
     * Populates the table in descending order. It includes the subtracting pairs as well. These pairs are used to avoid
     * creating roman numerals with more than 3 repeating digits/characters.
     */
    private void initializeTable() {
        table.put("M", 1000);
        table.put("CM", 900);
        table.put("D", 500);
        table.put("CD", 400);
        table.put("C", 100);
        table.put("XC", 90);
        table.put("L", 50);
        table.put("XL", 40);
        table.put("X", 10);
        table.put("IX", 9);
        table.put("V", 5);
        table.put("IV", 4);
        table.put("I", 1);
    }

    //Methods - getters
    public LinkedHashMap<String, Integer> getTable() {
        return table;
    }

    /**
     * Finds the romanLetter passed in the table hashMap and returns its value.
     * @param romanLetter to find in the hashMap
     * @return the Integer if is valid, null otherwise.
     */
    public Integer getDecimal(String romanLetter){
        return table.get(romanLetter);
    }
}
