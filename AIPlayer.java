
import java.util.Scanner;
import java.util.Random;

public class AIPlayer extends Player {
  
    public AIPlayer(String name, char mark) {
        this.name = name;
        this.mark = mark;
    }

    void makeMove()
    {
        Scanner scan = new Scanner(System.in);
        int row;
        int col;
         do
         {
            Random r=new Random();
           // r.nextInt(3); // Generate a random number between 0 and 2
            row = r.nextInt(3); // Random row
            col = r.nextInt(3); // Random column
         } while(isValidMove(row, col) != true);
         tictactoe.placeMark(row, col, mark);
    } 

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





