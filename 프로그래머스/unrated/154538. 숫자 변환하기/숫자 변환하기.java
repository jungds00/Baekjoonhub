class Solution {
    private final static int MAX = Integer.MAX_VALUE;
    public static int solution(int x, int y, int n) {
        int[] dp = new int[y + 1];

        for (int i = x + 1; i <= y; i++) {

            int a = i / 2 > 0 && i % 2 == 0 && x <= i / 2 ? dp[i / 2] : MAX;
            int b = i / 3 > 0 && i % 3 == 0 && x <= i / 3 ? dp[i / 3] : MAX;
            int c = x <= i - n ? dp[i - n] : MAX;
            int d = Math.min(a, Math.min(b, c));

            dp[i] = d < MAX ? d + 1 : MAX;
        }

        return dp[y] < MAX ? dp[y] : -1;
    }
}