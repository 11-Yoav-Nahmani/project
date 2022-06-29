import java.util.*;

public class ticktacktoe {

  static char[][]ticktack = new char[3][3];

  public static boolean winner(char[][]t){

           if(t[0][0] == t[1][0] && t[1][0] == t[2][0])
          return true;
      else if(t[0][1] == t[1][1] && t[1][1] == t[2][1])
          return true;
      else if(t[0][2] == t[1][2] && t[1][2] == t[2][2])
            return true;
      else if(t[2][2] == t[1][1] && t[1][1] == t[0][0])
          return true;
      else if(t[0][2] == t[1][1] && t[1][1] == t[2][0])
          return true;
      else if(t[0][0] == t[0][1] && t[0][1] == t[0][2])
          return true;
      else if(t[1][0] == t[1][1] && t[1][1] == t[1][2])
          return true;
      else if(t[2][0] == t[2][1] && t[2][1] == t[2][2])
          return true;
      else return false;
  }


  public static void board(char[][]t){

      for (char[] chars : t) {
          for (char aChar : chars) {
              System.out.print(aChar + " ");
          }
          System.out.println();
      }
  }


  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
int turnsCounter = 0,row,column;

      for (char[] chars : ticktack) {
          Arrays.fill(chars, '-');
      }


    System.out.println("WELCOME TO TICKTACKTOE! ");
      System.out.println("on each turn, the player enters the location for x or o, the winner is the player who manage to form a line diagonally or horizontally of o or x");
      board(ticktack);

      System.out.println("x turn to play.");
      System.out.println("enter the row to position: ");
      row = n.nextInt();
      System.out.println("enter the colum to position: ");
      column = n.nextInt();
      ticktack[row][column] = 'x';
      if(winner(ticktack)){
          System.out.println("x player has won!");
      }

while(!winner(ticktack) || turnsCounter < 9){
    System.out.println("x turn to play.");
    System.out.println("enter the row to position: ");
    row = n.nextInt();
    System.out.println("enter the colum to position: ");
    column = n.nextInt();
    ticktack[row][column] = 'x';
    if(winner(ticktack)){
        System.out.println("x player has won!");
    }
    System.out.println("o turn to play.");
    System.out.println("enter the row to position: ");
    row = n.nextInt();
    System.out.println("enter the colum to position: ");
    column = n.nextInt();
    ticktack[row][column] = 'o';
    if(winner(ticktack)){
        System.out.println("o player has won!");
    }
turnsCounter++;

}
  }
}

