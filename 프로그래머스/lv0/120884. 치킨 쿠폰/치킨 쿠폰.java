class Solution {
    public int solution(int chicken) {
        int answer = 0;
        int service = 0;
        int coupon = 0;
        while (chicken>0){
            coupon += chicken;
            service = coupon/10;
            coupon %= 10;
            chicken = service;
            answer += service;
        }
        return answer;
    }
}