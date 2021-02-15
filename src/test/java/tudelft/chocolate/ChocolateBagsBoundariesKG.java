package tudelft.chocolate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ChocolateBagsBoundariesKG {

    @ParameterizedTest
    @CsvSource({
            //Partition_1: Not enough bars to fill boxes
            "'total-higher',3,1,10,-1", "'total-higher',4,1,10,-1", "'total-higher',5,1,10,5", "'total-higher',6,1,10,5",
            //Partition_2: Big bars only can fill the boxes
            "'big-bars-only',3,1,15,-1", "'big-bars-only',3,2,15,-1", "'big-bars-only',3,3,15,0", "'big-bars-only',3,4,15,0",
            //Partition_3: Small bars only can fill the boxes
            "'small-bars-only',2,2,4,-1", "'small-bars-only',3,2,4,-1", "'small-bars-only',4,2,4,4", "'small-bars-only',5,2,4,4",
            //Partition_4: Big and small bars together can fill the boxes
            "'big-and-small',0,2,12,-1", "'big-and-small',1,2,12,-1", "'big-and-small',2,2,12,2", "'big-and-small',3,2,12,2",
            "'big-and-small',0,3,12,-1", "'big-and-small',1,3,12,-1", "'big-and-small',2,3,12,2", "'big-and-small',3,3,12,2"
    })
    public void chocolateBagsTestAlgorithm(String partition, int small, int big, int total, int expected) {
        ChocolateBags chocolateBags = new ChocolateBags();
        int result = chocolateBags.calculate(small,big,total);
        Assertions.assertEquals(expected,result);
    }
}
