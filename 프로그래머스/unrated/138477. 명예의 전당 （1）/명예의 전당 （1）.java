import java.util.*;
class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        int[] karr = new int[k];
        int tmp = 0 ;
        Arrays.fill(karr,Integer.MAX_VALUE);
        for(int i = 0 ; i<Math.min(k,score.length) ; i++){
            karr[i] = score[i];
            Arrays.sort(karr);
            answer[i] = karr[0];
        }
        for(int i = k ; i <score.length ; i ++){
            if(score[i]<=karr[0]){
                answer[i] = karr[0];
                continue;
            }else{
                karr[0] = score[i];
                Arrays.sort(karr);
            }
            answer[i] = karr[0];

                    
        }
        return answer;
    }
}