public class ZaBoard{
  public static int[][] CreateBoard(int x, int y){
     int [][] ProtoBoard = new int[x][y];
    for(int i = 0; i < x; i++){
      for(int j = 0; j < y; j++){
        ProtoBoard[i][j]=0;
      }
    }
    return ProtoBoard;
  }
  public static void PrintBoard(int[][] board){
    for(int i = 0; i < board.length; i++){
      for(int j = 0; j < board[0].length; j++){
        System.out.print(" "+board[i][j]);
      }
      System.out.println("");
    }
  }
    public static int [][] PlayerTurn(int [][] board, int y){
      y = y-1;
      for(int i = 0; i<board.length; i++){
        if(i != board.length-1){
          if((board[i+1][y]) != 0 && (board[i][y]) == 0){
            board[i][y] = 1;
      }
      
}
        else{
          board[board.length-1][y]=1;
        }
        
}
      return board;
}
    public static int[][] ComputerTurn(int[][] board){
      int temp = 0;
      int x;
      for(int i = 0; i< board.length; i++){
        for(int j = 0; j<board[i].length; j++){
          if(i == board.length-1){
            if(board[i-2][j] == 1 && temp == 0){
             board[i-3][j] = 2; 
             temp = 1;
             break;
            }
          
          if(j == board[i].length){
            if(board[i][j-2]==1 && temp == 0){
            board[i][j-3] =2;
            temp = 1;
            break;
            }
          }
          if(j == 0){
           if(board[i][j+2] == 1 && temp == 0){
            board[i][j+3] =2;
            temp = 1;
            break;
            }
          }
          }
        }
      }
      if(temp == 0){ 
        x = board.length-1;
        int temp2 = (int)(Math.random()*6);
            while(board[x][temp2] != 0){
              x++;
            }
            board[x][temp2] = 2;
          }
      return board;
    }
}