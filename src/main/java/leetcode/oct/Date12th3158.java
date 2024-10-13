package leetcode.oct;

public class Date12th3158 {
    public int duplicateNumbersXOR(int[] nums) {
        if (nums.length == 0 || nums.length == 1)
            return 0;
        int[] hashTable = new int[51];
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            hashTable[nums[i]]++;
        }
        for (int i = 0; i < 51; i++) {
            if (hashTable[i] == 2)
                result ^= i;
        }

        return result;
    }
}
