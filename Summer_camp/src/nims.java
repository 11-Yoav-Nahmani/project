import java.util.*;

public class nims {

  static char roads[] = new char[6];
  static int SpeedPerHour[] = new int[6];
  static int roadLengths[] = new int[6];

  static int times[] = new int[6];

  public static char[] sortOnDistance(char[] roads) {
    int min, num, move, min_pos, speed;
    char latter;

    for (int j = 0; j < roadLengths.length; j++) {
      min_pos = j;
      min = roadLengths[j];
      for (int i = j; i < roadLengths.length; i++) {
        num = roadLengths[i];
        if (num < min) {
          min = num;
          min_pos = i;
        }
      }
      move = roadLengths[min_pos];
      latter = roads[min_pos];
      speed = SpeedPerHour[min_pos];

      roadLengths[min_pos] = roadLengths[j];
      roads[min_pos] = roads[j];
      SpeedPerHour[min_pos] = SpeedPerHour[j];

      roadLengths[j] = move;
      roads[j] = latter;
      SpeedPerHour[j] = speed;
      times[j] = roadLengths[j] / SpeedPerHour[j];
    }

    return roads;
  }

  public static char[] sort(char[] roads) {
    int min, num, move, min_pos, speed;
    char latter;

    for (int j = 0; j < times.length; j++) {
      min_pos = j;
      min = (int) roads[j];
      for (int i = j; i < roadLengths.length; i++) {
        num = (int) roads[i];
        if (num <= min) {
          min = num;
          min_pos = i;
        }
      }
      move = roadLengths[min_pos];
      latter = roads[min_pos];
      speed = SpeedPerHour[min_pos];

      roadLengths[min_pos] = roadLengths[j];
      roads[min_pos] = roads[j];
      SpeedPerHour[min_pos] = SpeedPerHour[j];

      roadLengths[j] = move;
      roads[j] = latter;
      SpeedPerHour[j] = speed;
      times[j] = roadLengths[j] / SpeedPerHour[j];
    }

    return roads;
  }

  public static int indexInArray(char n) {
    int minIndex = 0, maxIndex = times.length - 1, middleIndex = (times.length - 1) / 2;

    if (roads[maxIndex] == n) {
      return maxIndex;
    } else if (roads[minIndex] == n) {
      return minIndex;
    }

    while ((maxIndex > minIndex)) {
      if (roads[middleIndex] == n) {
        return middleIndex;
      } else if ((int) roads[middleIndex] < (int) n) {
        minIndex = middleIndex;
      } else {
        maxIndex = middleIndex;
      }
      middleIndex = (minIndex + maxIndex) / 2;
    }
    return -999;
  }

  public static boolean thisUserExist(char n) {
    int minIndex = 0, maxIndex = roads.length - 1, middleIndex = (roads.length - 1) / 2;

    if (((int) roads[minIndex] == (int) roads[maxIndex]) && ((int) n < (int) roads[minIndex])
        || ((int) roads[minIndex] == (int) roads[maxIndex]) && ((int) n > roads[maxIndex])) {
      return false;
    }

    if (((int) n > (int) roads[maxIndex]) || ((int) n < (int) roads[minIndex])) {
      return false;
    }

    if ((int) roads[maxIndex] == (int) n) {
      return true;
    }

    if ((int) roads[minIndex] == (int) n) {
      return true;
    }

    while ((maxIndex > minIndex)) {
      if (roads[middleIndex] == n) {
        return true;
      } else if ((int) roads[middleIndex] < (int) n) {
        minIndex = middleIndex;
      } else {
        maxIndex = middleIndex;
      }
      middleIndex = (minIndex + maxIndex) / 2;
    }
    return false;
  }

  public static void main(String[] args) {
    Scanner n = new Scanner(System.in);
    int speed,
        roadLength,
        routes,
        commandNum,
        routeLength = 0,
        minRoadLength = 0,
        totalTime = 0,
        minTime = 0,
        index,
        timeDuplicate = 20,
        system,
        systemMin = 0;
    char[] route = new char[3];
    String routesArray = "";
    char latter;

    System.out.println("welcome to nims! where we gonna calculate the best route for you!");
    System.out.println("first lets insert the roads you use");

    for (int i = 1; i <= roads.length; i++) {

      System.out.println("For road number #" + i);

      System.out.println("please enter the latter: ");
      latter = n.next().charAt(0);
      roads[i - 1] = latter;

      System.out.println("please enter the average speed (km/hour): ");
      speed = n.nextInt();
      SpeedPerHour[i - 1] = speed;

      System.out.println("please enter the length of the road (km): ");
      roadLength = n.nextInt();
      roadLengths[i - 1] = roadLength;
      while (speed <= 0 || roadLength <= 0) {
        System.out.println("Error. the values of the speed is negative. do it again.");
        System.out.println();
        System.out.println();
        System.out.println("please enter the average speed (km/hour): ");
        speed = n.nextInt();
        SpeedPerHour[i - 1] = speed;

        System.out.println("please enter the length of the road (km): ");
        roadLength = n.nextInt();
        roadLengths[i - 1] = roadLength;
      }
      times[i - 1] = roadLength / speed;
    }

    System.out.println("enter the number of roads for comparison: ");
    routes = n.nextInt();

    System.out.println("1. find the preferred time.");
    System.out.println("2. find the preferred length.");
    System.out.println("3. let the system choose for you the best route.");

    commandNum = n.nextInt();

    System.out.println();
    roads = sort(roads);
    switch (commandNum) {
      case 1 -> {
        for (int i = 1; i <= routes; i++) {
          System.out.println("route number #" + i);
          for (int j = 0; j < 3; j++) {
            System.out.println("enter the #" + (j + 1) + " road");
            latter = n.next().charAt(0);
            route[j] = latter;
            index = indexInArray(latter);
            totalTime += times[index];
            routeLength += roadLengths[index];
          }
          if (totalTime < minTime || minTime == 0) {
            minTime = totalTime;
            minRoadLength = routeLength;
            routesArray = new String(route);
          }

          for (int j = 0; j < 3; j++) {
            route[j] = 0;
          }

          totalTime = 0;
          routeLength = 0;
        }
        System.out.println("your preferred route is: " + routesArray);
        System.out.println("time: " + minTime + " hours");
        System.out.println("length: " + minRoadLength + "km");
      }
      case 2 -> {
        for (int i = 1; i <= routes; i++) {
          System.out.println("route number #" + i);
          for (int j = 0; j < 3; j++) {

            System.out.println("enter the #" + (j + 1) + " road");
            latter = n.next().charAt(0);
            route[j] = latter;
            index = indexInArray(latter);
            totalTime += times[index];
            routeLength += roadLengths[index];
            System.out.println(routeLength);
          }
          if (routeLength < minRoadLength || minRoadLength == 0) {
            minTime = totalTime;
            minRoadLength = routeLength;
            routesArray = new String(route);
          }

          for (int j = 0; j < 3; j++) {
            route[j] = 0;
          }

          totalTime = 0;
          routeLength = 0;
        }
        System.out.println("your preferred route is: " + routesArray);
        System.out.println("time: " + minTime + " hours");
        System.out.println("length: " + minRoadLength + "km");
      }
      case 3 -> {
        System.out.println("insert time frame");
        for (int i = 1; i <= routes; i++) {
          System.out.println("route number #" + i);
          for (int j = 0; j < 3; j++) {

            System.out.println("enter the #" + (j + 1) + " road");
            latter = n.next().charAt(0);
            route[j] = latter;
            index = indexInArray(latter);
            totalTime += times[index];
            routeLength += roadLengths[index];
          }
          system = totalTime * timeDuplicate + routeLength;
          if (system < systemMin || systemMin == 0) {
            systemMin = system;
            minTime = totalTime;
            minRoadLength = routeLength;
            routesArray = new String(route);
          }

          for (int j = 0; j < 3; j++) {
            route[j] = 0;
          }

          totalTime = 0;
          routeLength = 0;
        }
        System.out.println("your preferred route is: " + routesArray);
        System.out.println("time: " + minTime + " hours");
        System.out.println("length: " + minRoadLength);
      }
      default -> System.out.println("ERROR. YOU DID SOMETHING STUPID DIDN'T YOU!? FOLLOW INSTRUCTIONS!!");
    }
  }
}
