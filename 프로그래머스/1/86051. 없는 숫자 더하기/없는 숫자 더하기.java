class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        int[] fullNumbers = new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for(int i = 0; i < numbers.length; i++){
            fullNumbers[i] -= numbers[i];
        }
        
        for(int j =0; j < fullNumbers.length; j++){
            answer += fullNumbers[j];
        }
        return answer;
    }
}