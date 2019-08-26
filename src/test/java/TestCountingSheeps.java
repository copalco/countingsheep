import org.junit.Test;
import sheepcounter.SheepCounter;

import static org.junit.Assert.assertEquals;

public class TestCountingSheeps {
    @Test
    public void noSheeps() {
        Boolean[] sheeps = {};
        assertEquals(countSheeps(sheeps), 0);
    }

    private int countSheeps(Boolean[] sheeps) {
        SheepCounter counter = new SheepCounter();
        return 0;
    }
}
