package sheepcounter;

public class SheepCounter {
    public int countSheeps(Boolean[] arrayOfSheep) {
        int sheepCounter = 0;
        if (arrayOfSheep == null) {
            return 0;
        }
        for (Boolean sheep : arrayOfSheep) {
            if (sheep != null && sheep) {
                sheepCounter += 1;
            }
        }
        return sheepCounter;
    }
}
