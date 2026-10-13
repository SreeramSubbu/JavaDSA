package ram.dsa.training;

public class RotateArray {


    public int[] rotate(int[] input, int count) {
        int length = input.length;
        if (length <= 1) return input;
        int effectiveRotation = count % length;
        if (effectiveRotation == 0) return input;
        int[] rotatedArray = new int[length];
        int newPosition;
        for (int i = 0; i < length; i++) {
            newPosition = (i + effectiveRotation) % length;
            rotatedArray[newPosition] = input[i];
        }
        return rotatedArray;
    }
}
