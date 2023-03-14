class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int max = 0;
        int min = 0;
        int zerocnt = 0;
        for(int i = 0 ; i<lottos.length; i++){
            if(lottos[i]==0){
                    zerocnt++;
                }
            for(int j= 0 ; j<lottos.length; j++){
                if(win_nums[j]==lottos[i]){
                    min++;
                }
            }
        }
        max = min+zerocnt;
        max= Math.max(1,max);
        answer[0]=7-max;
        min= Math.max(1,min);
        answer[1]=7-min;
        return answer;
    }
}