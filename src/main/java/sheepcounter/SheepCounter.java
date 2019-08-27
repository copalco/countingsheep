package sheepcounter;

public class SheepCounter {
    public int countSheeps(Boolean[] arrayOfSheep) {
        int sheepCounter = 0;
        if (arrayOfSheep != null) {
            for (Boolean sheep : arrayOfSheep) {
                if (sheep != null && sheep == true) {
                    sheepCounter += 1;
                }
            }
        }
        return sheepCounter;
    }
}
