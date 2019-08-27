package sheepcounter;

import java.util.Arrays;
import java.util.stream.Stream;

public class SheepCounter {
    public int countSheeps(Boolean[] arrayOfSheep) {
        if (arrayOfSheep == null) {
            return 0;
        }
        return (int) Arrays.stream(arrayOfSheep).filter(sheep -> sheep != null && sheep).count();
    }
}
