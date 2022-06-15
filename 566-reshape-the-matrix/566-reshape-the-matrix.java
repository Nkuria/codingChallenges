class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int x = mat.length;
        int y = mat[0].length;
        
        int m = 0;
        int n = 0;
        
        if(r * c != x * y) {
            return mat;
        }
        
        int[][] arr = new int[r][c];
        
        
  
        
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                arr[i][j] = mat[m][n];
                n++;
                if(n == y) {
                    n = 0;
                    m++;
                }
            }
        }
        
        return arr;
    }
}