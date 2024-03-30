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

        result = converter.convertToDecimal("MDDDCLXVI");
        assertEquals(2666, result);

    }

    @Test
    void convertToDecimalValidSubstractions() {
        Integer result;
        //2 letters
        result = converter.convertToDecimal("CM");
        assertEquals(900, result);

        result = converter.convertToDecimal("CD");
        assertEquals(400, result);


        //3 letters
        result = converter.convertToDecimal("XIV");
        assertEquals(14, result);

        result = converter.convertToDecimal("CXL");
        assertEquals(140, result);

        //4 letters
        result = converter.convertToDecimal("XLIV");
        assertEquals(44, result);

        result = converter.convertToDecimal("CDIX");
        assertEquals(409, result);


    }

    @Test
    void convertToDecimalInvalidSubstractions() {
        Integer result;
        //2 letters
        result = converter.convertToDecimal("IM");
        assertNull(result);

        result = converter.convertToDecimal("XD");
        assertNull(result);

        result = converter.convertToDecimal("XM");
        assertNull(result);

        //3 letters
        result = converter.convertToDecimal("XDI");
        assertNull(result);

        result = converter.convertToDecimal("ICX");
        assertNull(result);

        //4 letters
        result = converter.convertToDecimal("XDIC");
        assertNull(result);
    }

    @Test
    void convertToDecimalInvalid4Digits() {
        Integer result;
        result = converter.convertToDecimal("IIII");
        assertNull(result);

        result = converter.convertToDecimal("XXLXXXX");
        assertNull(result);

        result = converter.convertToDecimal("CMCCCC");
        assertNull(result);

        result = converter.convertToDecimal("MMMCDXXXXII");
        assertNull(result);
    }

    @Test
    void convertToDecimalInvalidVLDNeverSubstracted() {
        Integer result;
        //2 letters
        result = converter.convertToDecimal("VX");
        assertNull(result);

        result = converter.convertToDecimal("VL");
        assertNull(result);

        result = converter.convertToDecimal("LC");
        assertNull(result);

        //3 letters
        result = converter.convertToDecimal("CVL");
        assertNull(result);

        result = converter.convertToDecimal("MLC");
        assertNull(result);

        //4 letters
        result = converter.convertToDecimal("MMVX");
        assertNull(result);

        result = converter.convertToDecimal("CDVL");
        assertNull(result);
    }

    @Test
    void someDigitRepeatsTooMuchTrue() {
        boolean result;
        result = converter.SomeDigitRepeatsTooMuch("MMMM");
        assertTrue(result);

        result = converter.SomeDigitRepeatsTooMuch("MMMMI");
        assertTrue(result);

        result = converter.SomeDigitRepeatsTooMuch("XIIII");
        assertTrue(result);

        result = converter.SomeDigitRepeatsTooMuch("XXXXIX");
        assertTrue(result);

        result = converter.SomeDigitRepeatsTooMuch("MMMCMXXXXII");
        assertTrue(result);

        result = converter.SomeDigitRepeatsTooMuch("MMMCMXXVVVV");
        assertTrue(result);

        result = converter.SomeDigitRepeatsTooMuch("MMMCDXXXXII");
        assertTrue(result);
    }

    @Test
    void someDigitRepeatsTooMuchFalse() {
        boolean result;
        result = converter.SomeDigitRepeatsTooMuch("III");
        assertFalse(result);

        result = converter.SomeDigitRepeatsTooMuch("VIII");
        assertFalse(result);

        result = converter.SomeDigitRepeatsTooMuch("XIII");
        assertFalse(result);

        result = converter.SomeDigitRepeatsTooMuch("XXXIX");
        assertFalse(result);

        result = converter.SomeDigitRepeatsTooMuch("MMMCMXXII");
        assertFalse(result);
    }
}