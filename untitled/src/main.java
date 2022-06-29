import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class main {
  static final int n_wallCode = -99;
  static final int N_caveCode = -1;
  static final int WORLD_ROW_SIZE = 20;
  static final int WORLD_COL_SIZE = 20;
  static final int WALL_SIZE = 1;
  static final Direction[] MOVEMENT_VECTOR = {
    new Direction(0, 0),
    new Direction(0, 1),
    new Direction(1, 0),
    new Direction(0, -1),
    new Direction(-1, 0)
  };
  static int[][] matrix =
      new int[WORLD_COL_SIZE + (2 * WALL_SIZE)][WORLD_COL_SIZE + (2 * WALL_SIZE)];
  static int stepNumber = 0;

  public static void main(String[] args) {

    final String strFIleName = "Map.dat";
    final int MAX_STEPS = 200;
    Location[] stepsLocations = new Location[MAX_STEPS];
    Location player1 = new Location();
    Location berry = new Location();
    boolean isPlayerAlive = true;

    MatrixInitialize();
    CaveInitialize(player1, berry);

    while ((isPlayerAlive)
        && ((berry.getCol() != player1.getCol()) || (berry.getRow() != player1.getRow()))) {
      PrintCave(player1, berry);

      isPlayerAlive = MovePlayer1(player1, stepsLocations);
    }

    if (isPlayerAlive) {
      PrintPathBack(stepsLocations);
    } else {
      System.out.println("player 1 fell into the horrible trap of doom!");
    }

    try {
      SaveMap(strFIleName);
    } catch (Exception e) {
      System.out.println("Error while trying saving map to " + strFIleName);
    }
  }

  static void MatrixInitialize() {
    int wallRowIndex;
    int wallColIndex;
    int mapColIndex;
    int mapRowIndex;

    for (wallRowIndex = 0; wallRowIndex < WORLD_ROW_SIZE + 2 * WALL_SIZE; wallRowIndex++) {
      for (wallColIndex = 0; wallColIndex < WORLD_COL_SIZE + 2 * WALL_SIZE; wallColIndex++) {
        matrix[wallRowIndex][wallColIndex] = n_wallCode;
      }
    }

    for (mapRowIndex = WALL_SIZE; mapRowIndex < WORLD_ROW_SIZE + WALL_SIZE; mapRowIndex++) {
      for (mapColIndex = WALL_SIZE; mapColIndex < WORLD_COL_SIZE + WALL_SIZE; mapColIndex++) {
        matrix[mapRowIndex][mapColIndex] = N_caveCode;
      }
    }
  }

  static void CaveInitialize(Location player1, Location berry) {
    final Location TRAP_EXIT_LOC = new Location(-1, -1);
    final Scanner input = new Scanner(System.in);
    int trapCol;
    Location inputBerryLocation = new Location();
    Location inputPlayer1Location = new Location();
    Location inputTrapLocation = new Location();

    System.out.println("welcome to the game! your target is to get to the berry's");
    System.out.println("to start please type the location of the player in the map");

    System.out.println("please Enter location: ");
    System.out.print("Row: ");
    inputPlayer1Location.setRow(input.nextInt());

    System.out.print("Col: ");
    inputPlayer1Location.setCol(input.nextInt());

    player1.setRow(inputPlayer1Location.getRow() + WALL_SIZE - 1);
    player1.setCol(inputPlayer1Location.getCol() + WALL_SIZE - 1);

    System.out.println("Enter the location for the berry's: ");
    System.out.print("Row: ");
    inputBerryLocation.setRow(input.nextInt());

    System.out.println("Col: ");
    inputBerryLocation.setCol(input.nextInt());

    berry.setRow(inputBerryLocation.getRow() + WALL_SIZE - 1);
    berry.setCol(inputBerryLocation.getCol() + WALL_SIZE - 1);

    System.out.println("Enter first trap's location : ");
    System.out.print("Row: ");
    inputTrapLocation.setRow(input.nextInt());

    System.out.print("Col: ");
    inputTrapLocation.setCol(input.nextInt());

    while ((inputTrapLocation.getCol() != TRAP_EXIT_LOC.getCol())
        || (inputTrapLocation.getRow() != TRAP_EXIT_LOC.getRow())) {
      System.out.println("Enter the dangerous column . ");
      trapCol = input.nextInt();

      matrix[inputTrapLocation.getRow() + WALL_SIZE - 1][
              inputTrapLocation.getCol() + WALL_SIZE - 1] =
          trapCol;

      System.out.println("Enter next trap's location. if you want to start the game type -1 twice to start the map");
      System.out.print("Row: ");
      inputTrapLocation.setRow(input.nextInt());

      System.out.println("Col: ");
      inputTrapLocation.setCol(input.nextInt());
    }
  }

  static boolean MovePlayer1(Location player1, Location[] stepsLocations) {
    final Scanner input = new Scanner(System.in);

    final int STAY = 0;
    final int RIGHT = 1;
    final int DOWN = 2;
    final int LEFT = 3;
    final int UP = 4;

    int actionCode;
    int lastTrapCol;
    Location tempLocation;
    boolean didPlayer1Survived = true;

    lastTrapCol = matrix[player1.getRow()][player1.getCol()];
    tempLocation = player1;

    System.out.println("Insert movement code: ");
    System.out.println(RIGHT + " -. Right");
    System.out.println(DOWN + " -. Down");
    System.out.println(LEFT + " -. Left");
    System.out.println(UP + " -. Up");
    System.out.println(STAY + " -. Stay" + '\n');
    actionCode = input.nextInt();

    tempLocation.setRow(tempLocation.getRow() + MOVEMENT_VECTOR[actionCode].getRow());
    tempLocation.setCol(tempLocation.getCol() + MOVEMENT_VECTOR[actionCode].getCol());

    try{
    if (matrix[tempLocation.getRow()-1][tempLocation.getCol()-1] != n_wallCode) {

      player1.setRow(tempLocation.getRow());
      player1.setCol(tempLocation.getCol());

      stepsLocations[stepNumber] = player1;

      (stepNumber)++;
    }}catch (ArrayIndexOutOfBoundsException e){
      System.out.println("error : you cant go 2beyond the border of the map");
      tempLocation.setRow(tempLocation.getRow() - MOVEMENT_VECTOR[actionCode].getRow());
      tempLocation.setCol(tempLocation.getCol() - MOVEMENT_VECTOR[actionCode].getCol());
    }

    if ((lastTrapCol != N_caveCode) && (player1.getCol() == lastTrapCol)) {
      didPlayer1Survived = false;
      System.out.println("poop");
    }

    return (didPlayer1Survived);
  }

  static void PrintPathBack(Location[] stepsLocations) {
    int index, row, col, highPow, lowPow, currPow;
    Location lowestPowLoc;
    Location biggestPowLoc;

    row = stepsLocations[stepNumber - 1].getRow() + 1 - WALL_SIZE;
    col = stepsLocations[stepNumber - 1].getCol() + 1 - WALL_SIZE;

    biggestPowLoc = stepsLocations[stepNumber - 1];
    lowestPowLoc = stepsLocations[stepNumber - 1];

    highPow = (int) Math.pow(row, col);
    lowPow = highPow;

    for (index = stepNumber - 2; index >= 0; index--) {
      row = stepsLocations[index].getRow() + 1 - WALL_SIZE;
      col = stepsLocations[index].getCol() + 1 - WALL_SIZE;

      System.out.println("(" + row + " " + col + ")");

      currPow = (int) Math.pow(row, col);

      if (currPow > highPow) {
        highPow = currPow;
        biggestPowLoc.setCol(col);
        biggestPowLoc.setRow(row);
      } else if (currPow < lowPow) {
        lowPow = currPow;
        lowestPowLoc.setCol(col);
        lowestPowLoc.setRow(row);
      }
    }

    System.out.println(
        "Berries found in : "
            + "("
            + lowestPowLoc.getRow()
            + " "
            + lowestPowLoc.getCol()
            + ")"
            + " and "
            + "("
            + biggestPowLoc.getRow()
            + " "
            + biggestPowLoc.getCol()
            + ")");
  }

  static void PrintCave(Location player1, Location player2) {
    final char playerSign = 'S';
    final char goalSign = '@';
    final char emptySign = '.';
    final char trapSign = 'X';

    int rowIndex;
    int colIndex;

    for (rowIndex = WALL_SIZE; rowIndex < WORLD_ROW_SIZE + WALL_SIZE; rowIndex++) {
      for (colIndex = WALL_SIZE; colIndex < WORLD_COL_SIZE + WALL_SIZE; colIndex++) {
        if ((rowIndex == player1.getRow()) && (colIndex == player1.getCol())) {
          System.out.print(playerSign);
        } else if ((rowIndex == player2.getRow()) && (colIndex == player2.getCol())) {
          System.out.print(goalSign);
        } else if (matrix[rowIndex][colIndex] == N_caveCode) {
          System.out.print(emptySign);
        } else {
          System.out.print(trapSign);
        }
      }

      System.out.println();
    }
  }

  static void SaveMap(final String FILE_NAME) throws Exception {

    FileOutputStream fileOutput;
    ObjectOutputStream objectOutput;

    fileOutput = new FileOutputStream(FILE_NAME);
    objectOutput = new ObjectOutputStream(fileOutput);
    objectOutput.writeObject(matrix);
    objectOutput.close();
  }
}
