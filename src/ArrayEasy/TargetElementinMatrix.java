package ArrayEasy;

public class TargetElementinMatrix {
    public static void main(String[] args) {
        int mat[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 8, 12}};

        int target=8;

        for(int i=0;i<mat.length;i++){
            for (int j=0;j<mat[i].length;j++){
                if (mat[i][j]==target){
                    System.out.println(i+" "+j);
                    break;
                }
            }
        }
    }
}
