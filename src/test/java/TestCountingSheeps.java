import org.junit.Test;
import sheepcounter.SheepCounter;

import static org.junit.Assert.assertEquals;

public class TestCountingSheeps {
    @Test
    public void noSheeps() {
        assertEquals(countSheeps(new Boolean[]{}), 0);
    }

    @Test
    public void countTrueAsSheep() {
        assertEquals(countSheeps(new Boolean[]{true, true, true}), 3);
    }

    private int countSheeps(Boolean[] sheep) {
        SheepCounter counter = new SheepCounter();
        return counter.countSheeps(sheep);
    }
}
