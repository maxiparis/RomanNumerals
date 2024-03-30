import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class InputManagerTest {
    private InputManager inputManager = new InputManager();
    @Test
    void isNumericCorrect() {
        boolean result;
        result = inputManager.isNumeric("1234");
        assertTrue(result);

        result = inputManager.isNumeric("12");
        assertTrue(result);

        result = inputManager.isNumeric("23423423423");
        assertTrue(result);

        result = inputManager.isNumeric("33");
        assertTrue(result);
    }

    @Test
    void isNumericIncorrect() {
        boolean result;
        result = inputManager.isNumeric("iamastring");
        assertFalse(result);

        result = inputManager.isNumeric("ihaveanumber12");
        assertFalse(result);

        result = inputManager.isNumeric("2342342fdf3423");
        assertFalse(result);

        result = inputManager.isNumeric("3d*** fsd f3");
        assertFalse(result);
    }

    @Test
    void onlyContainsRomanCharactersCorrect() {
        boolean result;

        result = inputManager.onlyContainsRomanCharacters("MDC");
        assertTrue(result);

        result = inputManager.onlyContainsRomanCharacters("mdc");
        assertTrue(result);

        result = inputManager.onlyContainsRomanCharacters("MMMCDXLIII");
        assertTrue(result);

    }

    @Test
    void onlyContainsRomanCharactersOtherLetters() {
        boolean result;

        result = inputManager.onlyContainsRomanCharacters("MDCu");
        assertFalse(result);

        result = inputManager.onlyContainsRomanCharacters("mdctrw");
        assertFalse(result);

        result = inputManager.onlyContainsRomanCharacters("hello");
        assertFalse(result);

    }

    @Test
    void onlyContainsRomanCharactersNumbersSymbols() {
        boolean result;

        result = inputManager.onlyContainsRomanCharacters("MDC123");
        assertFalse(result);

        result = inputManager.onlyContainsRomanCharacters("md**(c");
        assertFalse(result);

        result = inputManager.onlyContainsRomanCharacters("MMM3CDX1((LIII");
        assertFalse(result);

    }
}