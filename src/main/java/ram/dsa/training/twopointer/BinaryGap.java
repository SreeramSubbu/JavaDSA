package ram.dsa.training.twopointer;

class BinaryGap {

    public int solution(Integer number) {
        char[] arr = Integer.toBinaryString(number).toCharArray();
        int i = -1;
        int tempGap;
        int maxGap = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == '1') {
                if (i != -1) {
                    tempGap = j - i - 1;
                    maxGap = Math.max(tempGap, maxGap);
                }
                i = j;
            }
        }
        return maxGap;
    }
}