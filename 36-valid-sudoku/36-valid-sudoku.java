class Solution {
    public boolean isValidSudoku(char[][] board) {
        
       
        
        for(int i = 0; i < board.length; i++) {
            HashSet<Character> row = new HashSet(); 
            HashSet<Character> column = new HashSet();
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] != '.') {
                    if (!(row.add(board[i][j]))) return false;
                }
                  if(board[j][i] != '.') {
                    if(!(column.add(board[j][i]))) return false;
                }
                
                
              
            }
        }
        
        int row = 0;
        int column = 0;
        
      for(int m = 0; m < 9; m+=3) {
            for(int k = 0; k < 9; k+=3)  {
                 HashSet<Character> grid = new HashSet(); 
                  for(int i =m; i < m+3; i++) {
                        for(int j = k; j < 3 + k; j++) {
                             if(board[i][j] != '.') {
                                    if (!(grid.add(board[i][j]))) return false;
                                }

                        }
                }
            }
      }
       
        


        return true;
    }
}