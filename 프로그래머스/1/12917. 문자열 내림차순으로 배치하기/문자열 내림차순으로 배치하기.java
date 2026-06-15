import java.util.Arrays;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] line = s.split("");
        int a = line.length;
        int[] code = new int[a];
        
        for(int i =0; i < a; i++){
            code[i] = (int) line[i].charAt(0);
        }
        
        Arrays.sort(code);
        
        for(int i = code.length - 1; i >= 0; i--) {
            answer += (char) code[i];
        }
        
        return answer;
    }
}