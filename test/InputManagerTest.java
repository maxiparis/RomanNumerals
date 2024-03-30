import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class InputManagerTest {
    private InputManager inputManager = new InputManager();
    @Test
    void isNumericCorrect() {
        boolean result;
        result = inputManager.isNumeric("1234");
        Assertions.assertTrue(result);

        result = inputManager.isNumeric("12");
        Assertions.assertTrue(result);

        result = inputManager.isNumeric("23423423423");
        Assertions.assertTrue(result);

        result = inputManager.isNumeric("33");
        Assertions.assertTrue(result);
    }

    @Test
    void isNumericIncorrect() {
        boolean result;
        result = inputManager.isNumeric("iamastring");
        Assertions.assertFalse(result);

        result = inputManager.isNumeric("ihaveanumber12");
        Assertions.assertFalse(result);

        result = inputManager.isNumeric("2342342fdf3423");
        Assertions.assertFalse(result);

        result = inputManager.isNumeric("3d*** fsd f3");
        Assertions.assertFalse(result);
    }
}