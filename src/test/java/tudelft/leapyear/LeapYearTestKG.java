package tudelft.leapyear;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LeapYearTestKG {

    private LeapYear leapyear;

    @BeforeEach
    public void initialize() {
        this.leapyear = new LeapYear();
    }

    @Test
    public void leapYearOnlyByDiv4() {
        boolean result = leapyear.isLeapYear(2016);
        Assertions.assertTrue(result);
    }

    @Test
    public void leapYearByDiv4Div100Div400() {
        boolean result = leapyear.isLeapYear(2000);
        Assertions.assertTrue(result);
    }

    @Test
    public void notLeapYearByDiv4() {
        boolean result = leapyear.isLeapYear(2021);
        Assertions.assertFalse(result);
    }

    @Test
    public void notLeapYearByDiv4Div100() {
        boolean result = leapyear.isLeapYear(1900);
        Assertions.assertFalse(result);
    }
}
