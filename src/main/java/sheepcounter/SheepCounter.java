package sheepcounter;

public class SheepCounter {
    public int countSheeps(Boolean[] arrayOfSheep) {
        int sheepCounter = 0;
        for (Boolean sheep: arrayOfSheep) {
            if (sheep == true) {
                sheepCounter += 1;
            }

        }
        return sheepCounter;
    }
}
