import java.util.*;
class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        String[] tarr = t.split("");
        String[] parr = p.split("");
        for(int i = 0 ; i<tarr.length-parr.length+1; i++){
            StringBuilder sb = new StringBuilder();
            for(int j = 0 ; j<parr.length;j++){
                sb.append(tarr[i+j]);
            }
            if(Long.parseLong(sb.toString()) <=Long.parseLong(p)){
                answer++;
            }
        }
        return answer;
    }
}