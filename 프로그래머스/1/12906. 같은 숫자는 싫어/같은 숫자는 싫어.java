import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0 || arr[i] != arr[i - 1]) {
                temp[index++] = arr[i];
            }
        }

        int[] answer = new int[index];

        for (int i = 0; i < index; i++) {
            answer[i] = temp[i];
        }

        return answer;
    }
}