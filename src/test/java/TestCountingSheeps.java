import org.junit.Test;
import sheepcounter.SheepCounter;

import static org.junit.Assert.assertEquals;

public class TestCountingSheeps {

    private final SheepCounter counter = new SheepCounter();

    @Test
    public void noSheep() {
        assertEquals(counter.countSheeps(new Boolean[]{}), 0);
    }

    @Test
    public void countTrueAsSheep() {
        assertEquals(counter.countSheeps(new Boolean[]{true, true, true}), 3);
    }

    @Test
    public void doesNotCountFalse() {
        assertEquals(counter.countSheeps(new Boolean[]{false, true, false}), 1);
    }

    @Test
    public void countsNullArrayAsZero() {
        assertEquals(counter.countSheeps(null), 0);
    }

    @Test
    public void ignoresNulls() {
        assertEquals(counter.countSheeps(new Boolean[]{null}), 0);
    }

}
