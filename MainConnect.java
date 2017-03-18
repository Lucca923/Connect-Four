import java.util.Scanner;
public class MainConnect{
  public static void main(String[] args){
    int col = 0;
    int WIDTH = 6;
    int HEIGHT = 6;
    Scanner scan = new Scanner(System.in);
    boolean gameValue = true;
    int [][] Board = ZaBoard.CreateBoard(WIDTH, HEIGHT);
    while(gameValue == true){
      ZaBoard.PrintBoard(Board);
      System.out.println(" ");
      System.out.println("what colume do you want to add a spot?");
      col = scan.nextInt();
      Board = ZaBoard.PlayerTurn(Board, col);
      Board = ZaBoard.ComputerTurn(Board);
      System.out.println(" ");
      gameValue = SweetVictory.CheckWin(Board);
    }
  }
}
      
    