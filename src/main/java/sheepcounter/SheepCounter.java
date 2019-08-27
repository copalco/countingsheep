package sheepcounter;

import java.util.Arrays;
import java.util.stream.Stream;

public class SheepCounter {
    public int countSheeps(Boolean[] arrayOfSheep) {
        if (arrayOfSheep == null) {
            return 0;
        }
        Stream<Boolean> sheepStream = Arrays.stream(arrayOfSheep);
        return (int) sheepStream.filter(sheep -> sheep != null && sheep).count();
    }
}
