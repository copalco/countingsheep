package sheepcounter;

import java.util.Arrays;

public class SheepCounter {
    public int countSheeps(Boolean[] arrayOfSheep) {
        if (arrayOfSheep == null) {
            return 0;
        }
        return (int) Arrays.stream(arrayOfSheep).filter(sheep -> sheep != null && sheep).count();
    }
}
