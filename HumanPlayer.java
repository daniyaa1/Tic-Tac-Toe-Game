import java.util.Scanner;

class HumanPlayer extends Player {
    
    public HumanPlayer(String name, char mark) {
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
            System.out.println("Enter the row and column:");
             row= scan.nextInt();
             col= scan.nextInt();
         } while(isValidMove(row, col) != true);
         tictactoe.placeMark(row, col, mark);
    } 

  

    }



