class Solution {
    public int solution(int[][] sizes) {
        int maxone = 0;
        int maxano = 0;
        for(int i = 0 ; i<sizes.length;i++){
            maxone = Math.max(Math.max(sizes[i][0],sizes[i][1]),maxone);
            maxano = Math.max(Math.min(sizes[i][0],sizes[i][1]),maxano);
        }
        return maxone*maxano;
    }
}