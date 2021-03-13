package tudelft.sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

public class TwoNumbersSumTest {

    private TwoNumbersSumSolution sumArray;

    @BeforeEach
    public void initialize() {
        this.sumArray = new TwoNumbersSumSolution();
    }

    @Test
    public void zero(){

        ArrayList<Integer> input1 = new ArrayList<>();
        ArrayList<Integer> input2 = new ArrayList<>();
        input1.add(0);
        input2.add(0);

        ArrayList<Integer> expected = new  ArrayList<>();
        expected.add(0);
        ArrayList<Integer> result = sumArray.addTwoNumbers(input1, input2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void oneNumberLow(){

        ArrayList<Integer> input1 = new ArrayList<>();
        ArrayList<Integer> input2 = new ArrayList<>();
        input1.add(1);
        input2.add(2);

        ArrayList<Integer> expected = new  ArrayList<>();
        expected.add(3);
        ArrayList<Integer> result = sumArray.addTwoNumbers(input1, input2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void oneNumberHigh(){

        ArrayList<Integer> input1 = new ArrayList<>();
        ArrayList<Integer> input2 = new ArrayList<>();
        input1.add(8);
        input2.add(9);

        ArrayList<Integer> expected = new  ArrayList<>();
        expected.add(1);
        expected.add(7);
        ArrayList<Integer> result = sumArray.addTwoNumbers(input1, input2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void unevenArraysLow(){

        ArrayList<Integer> input1 = new ArrayList<>();
        ArrayList<Integer> input2 = new ArrayList<>();
        input1.add(1);
        input2.add(2);
        input2.add(3);

        ArrayList<Integer> expected = new  ArrayList<>();
        expected.add(2);
        expected.add(4);
        ArrayList<Integer> result = sumArray.addTwoNumbers(input1, input2);
        Assertions.assertEquals(expected, result);
    }

    @Test
    public void unevenArraysHigh(){

        ArrayList<Integer> input1 = new ArrayList<>();
        ArrayList<Integer> input2 = new ArrayList<>();
        input1.add(8);
        input1.add(7);
        input2.add(9);

        ArrayList<Integer> expected = new  ArrayList<>();
        expected.add(9);
        expected.add(6);
        ArrayList<Integer> result = sumArray.addTwoNumbers(input1, input2);
        Assertions.assertEquals(expected, result);
    }
}
