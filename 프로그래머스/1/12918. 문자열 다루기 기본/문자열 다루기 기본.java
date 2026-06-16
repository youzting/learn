class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        int[] codes = new int[s.length()];
        if(s.length() == 4 || s.length() == 6){
            for(int i = 0; i < s.length(); i++){
                char ch = s.charAt(i);
                codes[i] = (int) ch;
            }
            for(int j = 0; j < s.length(); j++){
                if(codes[j] > 58){
                    answer = false;
                    return answer;
                }
            }
        }
        else{
            answer = false;
        }
        return answer;
    }
}