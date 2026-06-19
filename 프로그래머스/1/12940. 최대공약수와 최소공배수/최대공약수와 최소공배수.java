class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        int max = n * m;
        int gcd = 0;
        int lcm = 0;
        for(int i = 1; i <= m; i++){
            if(n % i == 0 && m % i == 0){
                gcd = i;
            }
        }
        for(int i = 2; i <= max; i++){
            if(i % n == 0 && i % m == 0){
                lcm = i;
                break;
            }
        }
        answer[0] = gcd;
        answer[1]= lcm;
        return answer;
    }
}