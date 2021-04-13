import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {
    static final String FIZZ_MESSAGE = "Fizz";
    static final String BUZZ_MESSAGE = "Buzz";

    @Test
    void translate21() {
        int testNumber = 21;
        String expected = FIZZ_MESSAGE;
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

    @Test
    void translate23() {
        int testNumber = 23;
        String expected = FIZZ_MESSAGE;
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

    @Test
    void translate36() {
        int testNumber = 36;
        String expected = FIZZ_MESSAGE;
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

    @Test
    void translate40() {
        int testNumber = 40;
        String expected = BUZZ_MESSAGE;
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

    @Test
    void translate58() {
        int testNumber = 58;
        String expected = BUZZ_MESSAGE;
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

    @Test
    void translate75() {
        int testNumber = 85;
        String expected = BUZZ_MESSAGE;
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

    @Test
    void translate60() {
        int testNumber = 60;
        String expected = FIZZ_MESSAGE + BUZZ_MESSAGE;
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

    @Test
    void translate35() {
        int testNumber = 35;
        String expected = FIZZ_MESSAGE + BUZZ_MESSAGE;
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

    @Test
    void translate53() {
        int testNumber = 53;
        String expected = FIZZ_MESSAGE + BUZZ_MESSAGE;
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

    @Test
    void translate51() {
        int testNumber = 51;
        String expected = FIZZ_MESSAGE + BUZZ_MESSAGE;
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

    @Test
    void translate130() {
        int testNumber = 130;
        String expected = FIZZ_MESSAGE + BUZZ_MESSAGE;
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

    @Test
    void translateDefault28(){
        int testNumber = 28;
        String expected = "hai tam";
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

    @Test
    void translateDefault4(){
        int testNumber = 4;
        String expected = "bon";
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

    @Test
    void translateDefaultBelow(){
        int testNumber = 0;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

    @Test
    void translateDefaultAbove(){
        int testNumber = 100;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

    @Test
    void translateDefault217(){
        int testNumber = 217;
        String expected = "";
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

    @Test
    void translateDefaultMinus21(){
        int testNumber = -21;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

    @Test
    void translateDefaultMinus17(){
        int testNumber = -17;
        String expected = "";
        String result = FizzBuzzTranslate.translate(testNumber);
        assertEquals(expected, result);
    }

}