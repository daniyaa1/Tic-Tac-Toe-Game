public class game {
    public static void main(String[] args) {
        tictactoe t= new tictactoe();
        HumanPlayer p1 = new HumanPlayer("Player 1", 'X');
        AIPlayer p2 = new AIPlayer("AI Player", 'O');
        Player cp; //reference to current player
        cp = p1; //start with player 1  // Note: An object in java can have multiple references
       while(true) //infinite loop for the game
       {
        System.out.println(cp.name +"turn.");
       cp.makeMove();
       tictactoe.dispBoard();
       //check for win
       if(tictactoe.checkColWin() || tictactoe.checkRowWin() || tictactoe.checkDiagWin() || tictactoe.checkDraw())
       {
           System.out.println(cp.name + "has won!");
           break; //exit the loop if a player has won
         } 
         else if(tictactoe.checkDraw()) //check for draw
         {
            System.out.println("It's a draw!");
            break; //exit the loop if it's a draw
         }
         
         
         
         else 
         {
            if(cp==p1){
                cp=p2; //switch to player 2
            } else {
                cp=p1; //switch to player 1
            }   
         }
        }
        /*   t.dispBoard();
        t.placeMark( 0, 0, 'X');
        t.placeMark( 0, 2, 'X');
        t.placeMark( 1, 1, 'X'); 
        t.placeMark( 0, 1, 'O');
        t.placeMark( 2, 2, 'X');
        t.placeMark( 2, 1, 'X');*/

      /*  t.dispBoard();
       System.out.println(t.checkColWin());
       System.out.println(t.checkRowWin());
       System.out.println(t.checkDiagWin());*/ 
    }
}
