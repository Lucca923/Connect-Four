public class SweetVictory{
  public static boolean CheckWin(int[][] board){
    int count = 0;
    int count2 = 0;
    for(int i = 0; i < board.length; i++){
      count = 0;
      count2 = 0;
      for(int j = 0; j<board[i].length; j++){
        if(board[i][j] == 1){
          count++;
          count2--;
        }
        if(board[i][j] == 2){
          count2++;
          count--;
        }
        if(count == 4){
          System.out.println("You win!");
          return false;
        }
        if(count2 == 4){
          System.out.println("You lose!");
          return false;
        }
      }
    }
    for(int i = 0; i<board[0].length; i++){
      count = 0;
      count2 = 0;
      for(int j = 0; j<board.length; j++){
         if(board[j][i] == 1){
          count++;
          count2--;
        }
        if(board[j][i] == 2){
          count2++;
          count--;
        }
        if(count == 4){
          System.out.println("You win!");
          return false;
        }
        if(count2 == 4){
          System.out.println("You lose!");
          return false;
        }
      }
    }
    return true;
  }
}