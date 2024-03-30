import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ConverterToDecimalTest {
    private ConverterToDecimal converter = new ConverterToDecimal();
    @Test
    void convertToDecimalJustSums() {
        Integer result;

        result = converter.convertToDecimal("M");
        assertEquals(1000, result);

        result = converter.convertToDecimal("MD");
        assertEquals(1500, result);

        result = converter.convertToDecimal("MDCLXVI");
        assertEquals(1666, result);

    }
}