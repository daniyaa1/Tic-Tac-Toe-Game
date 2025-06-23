public abstract class Player {
        String name;
        char mark;
        abstract void makeMove();
        boolean isValidMove(int row, int col)
    {
        if(row>=0 && row<=2 && col>=0 && col<=2)
        {
          if(tictactoe.board[row][col]==' ')  
          {
               
          return true; // Valid position
        } 
    
      }
      return false; // Invalid position
    }
}

