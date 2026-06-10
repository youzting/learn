class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int pCount = 0;
        int yCount = 0;

        String[] arr = s.split("");
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("p") || arr[i].equals("P")){
                pCount++;
            }
            if(arr[i].equals("y") || arr[i].equals("Y")){
                yCount++;
            }
        }
        
        if(pCount != yCount){
            answer = false;
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}