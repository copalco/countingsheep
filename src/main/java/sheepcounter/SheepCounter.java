package sheepcounter;

import java.util.Arrays;
import java.util.stream.Stream;

public class SheepCounter {
    public int countSheeps(Boolean[] arrayOfSheep) {
        if (arrayOfSheep == null) {
            return 0;
        }
        int sheepCounter = 0;
        Stream<Boolean> sheepStream = Arrays.stream(arrayOfSheep);
        for (Boolean sheep : arrayOfSheep) {
            if (sheep != null && sheep) {
                sheepCounter += 1;
            }
        }
        return sheepCounter;
    }
}
