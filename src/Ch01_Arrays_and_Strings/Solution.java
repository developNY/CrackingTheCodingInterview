package Ch01_Arrays_and_Strings;

import java.util.Scanner;

public class Solution
{
    public static char[][]  chessboardPattern(int num)
    {
        char[][]  answer = new char[100][100];
        // Write your code here
        for(int i=0; i<num; i++){
            for(int j=0; j<num; j++){
                if(i%2 == 0 && j%2==0)
                    answer[i][j] = 'W';
                else if(i%2 == 0 && j%2!=0)
                    answer[i][j] = 'B';
                else if(i%2 != 0 && j%2==0)
                    answer[i][j] = 'B';
                else
                    answer[i][j] = 'W';
            }
        }

        return answer;
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // input for num
        int num = in.nextInt();


        char[][] result = chessboardPattern(num);
        for(int idx = 0; idx < result.length; idx++)
        {
            for(int jdx = 0; jdx < result[0].length - 1; jdx++)
            {
                System.out.print(result[idx][jdx] + " ///");
            }
            System.out.print(result[idx][result[0].length - 1]);
            System.out.println();
        }
    }
}
