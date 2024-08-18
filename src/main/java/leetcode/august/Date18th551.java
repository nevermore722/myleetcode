package leetcode.august;

public class Date18th551 {
    public boolean checkRecord(String s) {
        int aNum = 0;
        int lNum = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A') {
                aNum++;
                lNum = 0;
                if (aNum >= 2) {
                    return false;
                }
            } else if (c == 'L') {
                lNum++;
                if (lNum >= 3) {
                    return false;
                }
            } else if (c == 'P') {
                lNum = 0;
            }
        }
        return true;
    }
}
