import java.util.Scanner;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String[][] stars = new String[b][a];
        
        for(int i = 0; i < stars.length; i++){
            for(int j = 0; j < stars[i].length; j++){
                stars[i][j] = "*";
                System.out.print(stars[i][j]);
            }
            System.out.println();
        }

        
    }
}