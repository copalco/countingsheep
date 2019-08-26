import org.junit.Test;
import sheepcounter.SheepCounter;

import static org.junit.Assert.assertEquals;

public class TestCountingSheeps {
    @Test
    public void noSheeps() {
        Boolean[] sheep = {};
        assertEquals(countSheeps(sheep), 0);
    }

    private int countSheeps(Boolean[] sheep) {
        SheepCounter counter = new SheepCounter();
        return counter.countSheeps(sheep);
    }
}
