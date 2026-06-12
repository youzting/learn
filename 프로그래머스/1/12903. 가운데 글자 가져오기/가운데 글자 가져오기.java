class Solution {
    public String solution(String s) {
        String answer = "";
        String[] sb = s.split("");
        String[] middleEven = new String[2];
        String[] middleOdd = new String[1];
        int i = sb.length / 2;
        int k = i;
        int j = (sb.length-1) / 2;
        if(sb.length % 2 == 0){
            for(;i < k+2; i++){
                middleEven[i-k] = sb[i-1];
                answer = String.join("", middleEven);
            }
        }
        else{
            middleOdd[0] = sb[j];
            answer = String.join("", middleOdd);
        }
        
        return answer;
    }
}