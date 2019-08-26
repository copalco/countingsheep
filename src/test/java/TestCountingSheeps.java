import org.junit.Test;
import sheepcounter.SheepCounter;

import static org.junit.Assert.assertEquals;

public class TestCountingSheeps {
    @Test
    public void noSheeps() {
        Boolean[] sheeps = {};
        assertEquals(countSheeps(sheeps), 0);
    }

    @Test
    public void countsTrueAsSheeps() {
    }

    private int countSheeps(Boolean[] sheeps) {
        SheepCounter counter = new SheepCounter();
        return counter.countSheeps();
    }
}
