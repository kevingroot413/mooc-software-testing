package tudelft.mirror;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MirrorTest {

    private MirrorSolution mirror;

    @BeforeEach
    public void initialize() {
        this.mirror = new MirrorSolution();
    }

    @Test
    public void evenString(){
        String result = mirror.mirrorEnds("ab");

        Assertions.assertEquals("", result);
    }

    @Test
    public void evenString2(){
        String result = mirror.mirrorEnds("abca");

        Assertions.assertEquals("a", result);
    }

    @Test
    public void unevenString(){
        String result = mirror.mirrorEnds("abc");

        Assertions.assertEquals("", result);
    }
    @Test
    public void unevenString2(){
        String result = mirror.mirrorEnds("abXYZba");

        Assertions.assertEquals("ab", result);
    }

    @Test
    public void unevenString3(){
        String result = mirror.mirrorEnds("aba");

        Assertions.assertEquals("aba", result);
    }
}
