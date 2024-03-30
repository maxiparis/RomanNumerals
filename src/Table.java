import java.util.LinkedHashMap;

public class Table {
    //Data member
    private LinkedHashMap<String, Integer> table = new LinkedHashMap<>();

    //Constructor
    public Table() {
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
