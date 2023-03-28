import java.util.*;
class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        Integer[] tmp = Arrays.stream(score).boxed().toArray(Integer[]::new);
        Arrays.sort(tmp,Comparator.reverseOrder());
        int length = score.length ;
        for(int i = m-1 ; i<score.length-length%m;i+=m){
            answer+= tmp[i]*m;
        }
        return answer;
    }
}