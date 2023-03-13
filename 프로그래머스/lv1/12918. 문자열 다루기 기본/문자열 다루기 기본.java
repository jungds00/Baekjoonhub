class Solution {
    public boolean solution(String s) {
         String[] tmp = s.split("");
        if(tmp.length == 4 || tmp.length ==6 ){
        }else {
            return false;
        }
        for (int i = 0; i < tmp.length; i++) {
            try{
                Integer.parseInt(tmp[i]);
            }catch (NumberFormatException e){
                return false;
            }
        }
        return true;
    }
}