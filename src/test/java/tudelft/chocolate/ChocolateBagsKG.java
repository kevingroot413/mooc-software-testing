package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChocolateBagsKG {

    private ChocolateBags chocolateBags;

    @BeforeEach
    public void initialize() {
        this.chocolateBags = new ChocolateBags();
    }

    //Partition_1: Not enough bars to fill boxes
    @Test
    public void notEnoughBars() {
        int result = chocolateBags.calculate(1,1,10);
        Assertions.assertEquals(-1,result);
    }

    //Partition_2: Big bars only can fill the boxes
    @Test
    public void onlyBigBars() {
        int result = chocolateBags.calculate(3,3,15);
        Assertions.assertEquals(0,result);
    }

    //Partition_3: Small bars only can fill the boxes
    @Test
    public void onlySmallBars() {
        int result = chocolateBags.calculate(6,2,4);
        Assertions.assertEquals(4,result);
    }

    //Partition_4: Big and small bars together can fill the boxes
    @Test
    public void smallAndBigBars() {
        int result = chocolateBags.calculate(7,2,12);
        Assertions.assertEquals(2,result);
    }
}
