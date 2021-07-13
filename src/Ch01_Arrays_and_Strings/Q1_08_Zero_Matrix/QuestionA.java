package Ch01_Arrays_and_Strings.Q1_08_Zero_Matrix;

public class QuestionA {
    public static void setZero(int[][] matrix){
        boolean[] row = new boolean[matrix.length];
        boolean[] col = new boolean[matrix[0].length];

        // find targets that change to 0
        for(int i = 0; i< matrix.length; i++){          //row
            for(int j = 0; j< matrix[0].length; j++){   //column
                if(matrix[i][j] == 0 && (row[i] != true || col[j] != true)){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < row.length; i++) {
            for (int j = 0; j < col.length; j++) {
                if(row[i] == true || col[j] == true)
                    System.out.print("0");
                else
                    System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] matrix = {{0,1,1,1,1},{1,1,1,1,1},{1,0,0,1,1},{1,1,1,1,1},{0,1,1,1,1}};
        setZero(matrix);
    }
}
