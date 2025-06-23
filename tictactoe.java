public class tictactoe {
        static char[][] board;     //To access a variable using just the class name and not the object we must declare it as static
         public tictactoe() { //constructor
             board = new char[3][3];
             initBoard();  
                 }
            public void initBoard() { //initialize the board
                for(int i=0; i<board.length; i++){
                    for(int j=0; j<board[i].length; j++){
                        board[i][j] = ' ';
                    }
                }
             }
       static void dispBoard(){
                System.out.println("----------------");
                for(int i=0; i<board.length; i++){
                    System.out.print("|  ");
                    for(int j=0; j<board[i].length; j++){
                        System.out.print(board[i][j] + " |  ");
                    }
                    System.out.println();
                    System.out.println("----------------"); 
                }

        }
       static void placeMark(int row, int col, char mark){
            if(row>=0 && row<=2 && col>=0 && col<=2 && board[row][col] == ' ') {
                board[row][col] = mark;
            } else {
                System.out.println("Invalid Position. Try again.");
            }
        }
      static  boolean checkColWin(){
            for(int j=0; j<=2;j++){
                if(board[0][j] == board[1][j] && board[1][j] == board[2][j] && board[0][j]!= ' ') {
                    System.out.println("Column " + j + " has a win with mark: " + board[0][j]);
                   return true; // Column win
                }     
            }
             return false; // No column win
        }
      static  boolean checkRowWin(){
            for(int i=0; i<=2;i++){
                if(board[i][0] == board[i][1] && board[i][1] == board[i][2] && board[i][0]!= ' ') {
                    System.out.println("Row " + i + " has a win with mark: " + board[i][0]);
                    return true; // Row win
                }     
            }
             return false; // No row win
            }

       static boolean checkDiagWin(){
            if(board[0][0]==board[1][1] && board[1][1]==board[2][2] && board[0][0]!=' ') {
                System.out.println("Diagonal from top-left to bottom-right has a win with mark: " + board[0][0]);
                return true; // Diagonal win
            } else if(board[0][2]==board[1][1] && board[1][1]==board[2][0] && board[0][2]!=' ') {
                System.out.println("Diagonal from top-right to bottom-left has a win with mark: " + board[0][2]);
                return true; // Diagonal win
            }
            return false; // No diagonal win

        }

       static boolean checkDraw()
        {
            for(int i=0; i<=2; i++){
                for(int j=0; j<=2; j++){
                    if(board[i][j] == ' ') {
                        return false; // If any cell is empty, it's not a draw
                    }
                }
            }
            return true; // All cells are filled and no winner, so it's a draw
        }
        }




         

