package tudelft.roman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RomanConvertTest {

    private RomanConvert roman;

    @BeforeEach
    public void initialize() {
        this.roman = new RomanConvert();
    }

    @Test
    public void singleNumber() {
        int result = roman.convert("I");
        Assertions.assertEquals(1, result);
    }

    @Test
    public void multipleNumbersPositive() {
        int result = roman.convert("VIII");
        Assertions.assertEquals(8, result);
    }

    @Test
    public void mulipleNumbersNegative() {
        int result = roman.convert("IV");
        Assertions.assertEquals(4, result);
    }

    @Test
    public void multipleNumbersNegativeAndPositive() {
        int result = roman.convert("XCIX");
        Assertions.assertEquals(99, result);
    }

    @Test
    public void nonExistingRomanNumber() {
        int result = roman.convert("VX");
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void allRomanNumbersLowToHigh() {
        int result = roman.convert("IVXLCDM");
        Assertions.assertEquals(-1, result);
    }

    @Test
    public void allRomanNumbersHighToLow() {
        int result = roman.convert("MDCLXVI");
        Assertions.assertEquals(1666, result);
    }
}
