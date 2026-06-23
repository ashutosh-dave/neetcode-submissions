class Solution {
    public int scoreOfString(String s) {
        int total = 0;
        int n = s.length();

        for(int i = 0; i < n - 1; i++){
            int diffSum = Math.abs(s.charAt(i) - s.charAt(i+1));
            total = total + diffSum;
        }

        return total;
    }
}