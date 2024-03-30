import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Map;


class TableTest {
    Table table = Table.getInstance();
    @Test
    void getDecimalCorrect() {
        Integer result;
        result = table.getDecimal("M");
        assertEquals(1000, result);

        result = table.getDecimal("CD");
        assertEquals(400, result);

        result = table.getDecimal("XL");
        assertEquals(40, result);

        result = table.getDecimal("I");
        assertEquals(1, result);
    }

    @Test
    void getDecimalIncorrect() {
        Integer result;

        result = table.getDecimal("123");
        assertNull(result);

        result = table.getDecimal("hello");
        assertNull(result);

        result = table.getDecimal("**");
        assertNull(result);

        result = table.getDecimal("12  sdaf ");
        assertNull(result);
    }

    @Test
    void traverseInOrder() {
        //To check the order is traversed correctly.
        //Expected: first is M and final is I
        for (Map.Entry<String, Integer> row : table.getTable().entrySet()) {
            System.out.println(row.getKey() + " = " + row.getValue());
        }
    }
}