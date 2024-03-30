import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class TerminalManagerTest {
    private TerminalManager terminalManager= new TerminalManager();
    @Test
    void isNumericCorrect() {
        boolean result;
        result = terminalManager.isNumeric("1234");
        assertTrue(result);

        result = terminalManager.isNumeric("12");
        assertTrue(result);

        result = terminalManager.isNumeric("23423423423");
        assertTrue(result);

        result = terminalManager.isNumeric("33");
        assertTrue(result);
    }

    @Test
    void isNumericIncorrect() {
        boolean result;
        result = terminalManager.isNumeric("iamastring");
        assertFalse(result);

        result = terminalManager.isNumeric("ihaveanumber12");
        assertFalse(result);

        result = terminalManager.isNumeric("2342342fdf3423");
        assertFalse(result);

        result = terminalManager.isNumeric("3d*** fsd f3");
        assertFalse(result);
    }

    @Test
    void onlyContainsRomanCharactersCorrect() {
        boolean result;

        result = terminalManager.onlyContainsRomanCharacters("MDC");
        assertTrue(result);

        result = terminalManager.onlyContainsRomanCharacters("mdc");
        assertTrue(result);

        result = terminalManager.onlyContainsRomanCharacters("MMMCDXLIII");
        assertTrue(result);

    }

    @Test
    void onlyContainsRomanCharactersOtherLetters() {
        boolean result;

        result = terminalManager.onlyContainsRomanCharacters("MDCu");
        assertFalse(result);

        result = terminalManager.onlyContainsRomanCharacters("mdctrw");
        assertFalse(result);

        result = terminalManager.onlyContainsRomanCharacters("hello");
        assertFalse(result);

    }

    @Test
    void onlyContainsRomanCharactersNumbersSymbols() {
        boolean result;

        result = terminalManager.onlyContainsRomanCharacters("MDC123");
        assertFalse(result);

        result = terminalManager.onlyContainsRomanCharacters("md**(c");
        assertFalse(result);

        result = terminalManager.onlyContainsRomanCharacters("MMM3CDX1((LIII");
        assertFalse(result);

    }
}