import org.junit.jupiter.api.Assertions;

import java.util.Map;


class TableTest {
    Table table = new Table();
    @org.junit.jupiter.api.Test
    void getDecimalCorrect() {
        Integer result;
        result = table.getDecimal("M");
        Assertions.assertEquals(1000, result);

        result = table.getDecimal("CD");
        Assertions.assertEquals(400, result);

        result = table.getDecimal("XL");
        Assertions.assertEquals(40, result);

        result = table.getDecimal("I");
        Assertions.assertEquals(1, result);
    }

    @org.junit.jupiter.api.Test
    void getDecimalIncorrect() {
        Integer result;

        result = table.getDecimal("123");
        Assertions.assertNull(result);

        result = table.getDecimal("hello");
        Assertions.assertNull(result);

        result = table.getDecimal("**");
        Assertions.assertNull(result);

        result = table.getDecimal("12  sdaf ");
        Assertions.assertNull(result);
    }

    @org.junit.jupiter.api.Test
    void traverseInOrder() {
        //To check the order is traversed correctly.
        //Expected: first is M and final is I
        for (Map.Entry<String, Integer> row : table.getTable().entrySet()) {
            System.out.println(row.getKey() + " = " + row.getValue());
        }
    }
}