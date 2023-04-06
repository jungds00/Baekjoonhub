import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        int cnt=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0 ; i<numbers.length-1;i++){
            for(int j = i+1 ; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        int[] answer = new int[set.size()];
        for(int x : set){
            answer[cnt++] = x;
        }
        Arrays.sort(answer);
        return answer;
    }
}