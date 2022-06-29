import java.util.*;

public class plane_classes {
  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);

    System.out.println("רשום את מספר המחלקות בקבוצת המטוסים");
    int m = n.nextInt(), fuelCount = 0, available_fuel;
    System.out.println("רשום את כמות הדלק הזמינה היום לקבוצת המטוסים");
    available_fuel = n.nextInt();

    for (int i = 1; i <= m; i++) {
      System.out.println(
          " רשום את כמות הדלק שצריך לתת למחלקה מספר "
              + i
              + " והקלד -999 כדי לעבור למחלקה הבאה בקבוצת המטוסים ");
      fuelCount = n.nextInt();
      while ((fuelCount != -999)) {
        available_fuel -= fuelCount;
        fuelCount = n.nextInt();
      }
    }

    if (available_fuel < 0) {
      available_fuel = available_fuel * -1;
      System.out.print("לקבוצת המטוסים חסרים ");
      System.out.print(available_fuel);
      System.out.print(" גלונים של דלק");
    } else {
      System.out.println("יש מספיק דלק");
    }
  }
}
