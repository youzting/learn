class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int min = Integer.MAX_VALUE;
        int minIndex = 0;
        int[] newArr = new int[arr.length - 1];
        
        if(arr.length == 1){
            arr[0] = -1;
            answer = arr;
        }
        else{
            for(int i = 0; i < arr.length; i++){
                if(arr[i] < min){
                    min = arr[i];
                    minIndex = i;
                }
            }
            for(int i = 0, j = 0; i < arr.length; i++){
                if(i == minIndex){
                    continue;
                }
                newArr[j]=arr[i];
                j++;
            }
            answer = newArr;
        }
        
        return answer;
    }
}