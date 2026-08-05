class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 9; j++)
            {
                if(board[i][j] == '.')  continue;
                if(check(i, j, board))  continue;
                else    return false;
            }
        }
        return true;
    }
    private boolean check(int row, int col, char[][] board)
    {
        int i = row;
        int j = col;
        for(int k = 0; k < 9; k++)
        {
            if(k != j && board[i][k] == board[i][j])
            {
                return false;
            }
        }
        for(int k = 0; k < 9; k++)
        {
            if(k != i && board[k][j] == board[i][j])
            {
                return false;
            }
        }
        int a = (i / 3) * 3;
        int b = (j / 3) * 3;
        for(int k = a; k < a + 3; k++)
        {
            for(int l = b; l < b + 3; l++)
            {
                if(k == i && l == j)    continue;
                if(board[k][l] == board[i][j])
                {
                    return false;
                }
            }
        }
        return true;
    }
}