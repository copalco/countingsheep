import org.junit.Test;
import sheepcounter.SheepCounter;

import static org.junit.Assert.assertEquals;

public class TestCountingSheeps {
    @Test
    public void noSheep() {
        assertEquals(countSheep(new Boolean[]{}), 0);
    }

    @Test
    public void countTrueAsSheep() {
        assertEquals(countSheep(new Boolean[]{true, true, true}), 3);
    }

    @Test
    public void doesNotCountFalse() {
        assertEquals(countSheep(new Boolean[]{false, false, false}), 0);
    }

    @Test
    public void countsNullArrayAsZero() {
        assertEquals(countSheep(null), 0);
    }

    @Test
    public void ignoresNulls() {
        assertEquals(countSheep(new Boolean[]{null}), 0);
    }

    private int countSheep(Boolean[] sheep) {
        SheepCounter counter = new SheepCounter();
        return counter.countSheeps(sheep);
    }
}
