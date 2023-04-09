import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> map = new HashMap<>();
        for(int i = 0 ; i<players.length;i++){
            map.put(players[i],i);    
        }
        for(String call : callings){
            int pos = map.get(call);
            String tmp = players[pos-1];
            players[pos-1] = players[pos];
            players[pos] = tmp;
            map.put(call,pos-1);
            map.put(tmp,pos);
        }
        return players;
    }
}