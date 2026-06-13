class Solution {
    public String solution(int n) {
        String answer = "";
        String[] change = new String[n];
        for(int i =0; i<n; i++){
            if(i % 2 == 0){
                change[i] = "수";
            }
            else{
                change[i] = "박";
            }
        }
        answer = String.join("", change);
        return answer;
    }
}