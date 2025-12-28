import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        int max = 0;
        int col = 0;
        int row = 0;
        Scanner sc = new Scanner(System.in);
        
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                int k = sc.nextInt();
                if(k>=max){
                    max = k;
                    row = i+1;
                    col = j+1;
                }
            }
        }
        System.out.println(max);
        System.out.printf("%d %d", row, col);
        sc.close();
    }
}