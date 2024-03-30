import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConverterToRomanTest {
    private final ConverterToRoman converterToRoman = new ConverterToRoman();
    @Test
    void convertToRoman() {
        String result;
        result = converterToRoman.convertToRoman(1);
        assertEquals("I", result);

        result = converterToRoman.convertToRoman(145);
        assertEquals("CXLV", result);

        result = converterToRoman.convertToRoman(555);
        assertEquals("DLV", result);

        result = converterToRoman.convertToRoman(999);
        assertEquals("CMXCIX", result);

        result = converterToRoman.convertToRoman(1001);
        assertEquals("MI", result);

        result = converterToRoman.convertToRoman(1001);
        assertEquals("MI", result);

        result = converterToRoman.convertToRoman(1499);
        assertEquals("MCDXCIX", result);

        result = converterToRoman.convertToRoman(2345);
        assertEquals("MMCCCXLV", result);

        result = converterToRoman.convertToRoman(3499);
        assertEquals("MMMCDXCIX", result);

        result = converterToRoman.convertToRoman(3499);
        assertEquals("MMMCDXCIX", result);

        result = converterToRoman.convertToRoman(3603);
        assertEquals("MMMDCIII", result);

        result = converterToRoman.convertToRoman(3998);
        assertEquals("MMMCMXCVIII", result);

    }
}