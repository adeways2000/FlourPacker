/*
 * I can come back to this later. It has more to do with figuring out the problem than learning how to code...
 */

public class FlourPacker {
    public static boolean canPack (int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        else {
            int bigSum = bigCount * 5;
            int sum = bigSum + smallCount;
            if (sum == goal) {
                if (((bigSum % goal) + smallCount) == 0) {
                    return true;
                }
            }
            return false;
        }
    }
}